package com.springboot.myblog.controller;

import com.springboot.myblog.enums.ResultEnum;
import com.springboot.myblog.exception.BlogException;
import com.springboot.myblog.form.AdminUserForm;
import com.springboot.myblog.pojo.AdminUser;
import com.springboot.myblog.service.AdminUserService;
import com.springboot.myblog.util.ResultVoUtil;
import com.springboot.myblog.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @ClassName AdminUserController
 * @Description admin user controller
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 23:02
 * @Version 1.0
 */
@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;


    /* 用户登陆 */
    @PostMapping("/login")
    @ResponseBody
    public ResultVo login(@Valid AdminUserForm adminUserForm,
                          BindingResult bindingResult,
                          HttpSession session){
        if (bindingResult.hasErrors()){
            log.info("【用户登陆】 参数不正确， adminUserForm = {}" , adminUserForm);
            return ResultVoUtil.error(ResultEnum.PARAM_ERROR.getCode(),ResultEnum.PARAM_ERROR.getMessage());
        }
        String username = adminUserForm.getUserName().trim().toLowerCase();
        String password = adminUserForm.getPassword();
        String verifyCode = adminUserForm.getVerifyCode();
        String authCode = session.getAttribute("verifyCode") + "";
        if (StringUtils.isEmpty(authCode) || !verifyCode.equals(authCode)){
            log.info("【用户登陆】 验证码错误，verifyCode = {}",verifyCode);
            return ResultVoUtil.error(ResultEnum.VERIFY_CODE_ERROR.getCode(),ResultEnum.VERIFY_CODE_ERROR.getMessage());
        }

        AdminUser adminUser = adminUserService.login(username,password);
        if (adminUser != null){
            /* 用户登陆成功 */
            session.setAttribute("loginUser", adminUser.getNickName());
            session.setAttribute("loginUserId", adminUser.getAdminUserId());
            /* 同时新增用户登陆记录 */
            //todo
            return null;
        }else {
            log.info("【用户登陆】 用户不存在，username = {} , password = {}",username,password);
            return ResultVoUtil.error(ResultEnum.USER_NOT_EXIST.getCode(),ResultEnum.USER_NOT_EXIST.getMessage());
        }
    }

}
