CREATE TABLE `tb_blog` (
                           `blog_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '博客表主键id',
                           `blog_title` varchar(200) NOT NULL COMMENT '博客标题',
                           `blog_sub_url` varchar(200) NOT NULL COMMENT '博客自定义路径url',
                           `blog_cover_image` varchar(200) NOT NULL COMMENT '博客封面图',
                           `blog_content` mediumtext NOT NULL COMMENT '博客内容',
                           `blog_category_id` int(11) NOT NULL COMMENT '博客分类id',
                           `blog_category_name` varchar(50) NOT NULL COMMENT '博客分类(冗余字段)',
                           `blog_tags` varchar(200) NOT NULL COMMENT '博客标签',
                           `blog_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-草稿 1-发布',
                           `blog_views` bigint(20) NOT NULL DEFAULT '0' COMMENT '阅读量',
                           `enable_comment` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-允许评论 1-不允许评论',
                           `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0=否 1=是',
                           `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
                           `update_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
                           PRIMARY KEY (`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '博客表';

CREATE TABLE `tb_blog_category` (
                                    `category_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类表主键',
                                    `category_name` varchar(50) NOT NULL COMMENT '分类的名称',
                                    `category_icon` varchar(50) NOT NULL COMMENT '分类的图标',
                                    `category_rank` int(11) NOT NULL DEFAULT '1' COMMENT '分类的排序值 被使用的越多数值越大',
                                    `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0=否 1=是',
                                    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                    PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '分类表';

CREATE TABLE `tb_blog_comment` (
                                   `comment_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                                   `blog_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '关联的blog主键',
                                   `commentator` varchar(50) NOT NULL DEFAULT '' COMMENT '评论者名称',
                                   `email` varchar(100) NOT NULL DEFAULT '' COMMENT '评论人的邮箱',
                                   `website_url` varchar(50) NOT NULL DEFAULT '' COMMENT '网址',
                                   `comment_body` varchar(200) NOT NULL DEFAULT '' COMMENT '评论内容',
                                   `comment_create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '评论提交时间',
                                   `commentator_ip` varchar(20) NOT NULL DEFAULT '' COMMENT '评论时的ip地址',
                                   `reply_body` varchar(200) NOT NULL DEFAULT '' COMMENT '回复内容',
                                   `reply_create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '回复时间',
                                   `comment_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否审核通过 0-未审核 1-审核通过',
                                   `is_deleted` tinyint(4) DEFAULT '0' COMMENT '是否删除 0-未删除 1-已删除',
                                   PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '评论表';

CREATE TABLE `tb_blog_tag` (
                               `tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签表主键id',
                               `tag_name` varchar(100) NOT NULL COMMENT '标签名称',
                               `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0=否 1=是',
                               `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                               PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '标签表';

CREATE TABLE `tb_blog_tag_relation` (
                                        `relation_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关系表id',
                                        `blog_id` bigint(20) NOT NULL COMMENT '博客id',
                                        `tag_id` int(11) NOT NULL COMMENT '标签id',
                                        `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
                                        PRIMARY KEY (`relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '关系表';

CREATE TABLE `tb_config` (
                             `config_id` int(11) not null AUTO_INCREMENT COMMENT '配置项id',
                             `config_name` varchar(100) NOT NULL DEFAULT '' COMMENT '配置项的名称',
                             `config_value` varchar(200) NOT NULL DEFAULT '' COMMENT '配置项的值',
                             `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                             `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
                             PRIMARY KEY (`config_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '配置项表';

CREATE TABLE `tb_link` (
                           `link_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '友链表主键id',
                           `link_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '友链类别 0-友链 1-推荐 2-个人网站',
                           `link_name` varchar(50) NOT NULL COMMENT '网站名称',
                           `link_url` varchar(100) NOT NULL COMMENT '网站链接',
                           `link_description` varchar(100) NOT NULL COMMENT '网站描述',
                           `link_rank` int(11) NOT NULL DEFAULT '0' COMMENT '用于列表排序',
                           `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0-未删除 1-已删除',
                           `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
                           PRIMARY KEY (`link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `login_record` (
                                `record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录表Id',
                                `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登录时间',
                                `logout_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下线时间',
                                `online_time` bigint NOT NULL DEFAULT '0' COMMENT '网站链接',
                                `user_id` int(11) NOT NULL COMMENT '用户id',
                                PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '登陆记录表';