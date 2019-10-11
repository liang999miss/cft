CREATE TABLE `cft_wechat_config` (
  `id` varchar(32) NOT NULL COMMENT '主键ID',
  `wechat_name` varchar(255) DEFAULT NULL COMMENT '第三方说明',
  `app_id` varchar(255) NOT NULL COMMENT '第三方appid',
  `app_secret` varchar(255) NOT NULL COMMENT '第三方secret',
  `access_token` varchar(255) DEFAULT NULL COMMENT 'access_token',
  `access_token_expired` timestamp NULL DEFAULT NULL COMMENT 'access_token过期时间',
  `jssdk_token` varchar(255) DEFAULT NULL COMMENT 'jssdk_token',
  `jssdk_token_expired` timestamp NULL DEFAULT NULL COMMENT 'jssdk_token过期时间',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `enable_` tinyint(1) DEFAULT '1' COMMENT '删除标识：0为已删除，1为未删除',
  `remark_` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微信配置';

