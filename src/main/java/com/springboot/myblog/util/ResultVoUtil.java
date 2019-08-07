package com.springboot.myblog.util;

import com.springboot.myblog.vo.ResultVo;

/**
 * @ClassName ResultVoUtil
 * @Description 返回对象工具类
 * @Author 2985062714@qq.com
 * @Date 2019/8/7 10:12
 * @Version 1.0
 */
public class ResultVoUtil {

    /**
     *
     * 功能描述: 操作成功有数据返回
     *
     * @param:
     * @return:
     * @auther: 2985062714@qq.com
     * @date: 2019-07-13 下午 4:04
     */
    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMessage("成功");
        return resultVo;
    }

    /**
     *
     * 功能描述: 操作成功但无数据返回
     *
     * @param:
     * @return:
     * @auther: 2985062714@qq.com
     * @date: 2019-07-13 下午 4:05
     */
    public static ResultVo success(){
        return success(null);
    }

    /**
     *
     * 功能描述: 操作失败
     *
     * @param:
     * @return:
     * @auther: 2985062714@qq.com
     * @date: 2019-07-13 下午 4:05
     */
    public static ResultVo error(Integer code,String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMessage(msg);
        return resultVo;
    }
}
