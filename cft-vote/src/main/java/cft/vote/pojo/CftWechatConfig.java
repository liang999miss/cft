package cft.vote.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;


/**
 * <p>
 * 微信配置
 * </p>
 *
 * @author admin
 * @since 2019-10-11
 */
@Data
@TableName("cft_wechat_config")
public class CftWechatConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@TableId(value = "id_", type = IdType.UUID)
	private String id;
    /**
     * 第三方说明
     */
	@TableField("wechat_name")
	private String wechatName;
    /**
     * 第三方appid
     */
	@TableField("app_id")
	private String appId;
    /**
     * 第三方secret
     */
	@TableField("app_secret")
	private String appSecret;
    /**
     * access_token
     */
	@TableField("access_token")
	private String accessToken;
    /**
     * access_token过期时间
     */
	@TableField("access_token_expired")
	private Date accessTokenExpired;
    /**
     * jssdk_token
     */
	@TableField("jssdk_token")
	private String jssdkToken;
    /**
     * jssdk_token过期时间
     */
	@TableField("jssdk_token_expired")
	private Date jssdkTokenExpired;

	/**
	 * 创建人
	 */
	@TableField(value = "create_by")
	private String createBy;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@TableField(value = "create_time")
	private Date createTime;
	/**
	 * 更新人
	 */
	@TableField(value = "update_by")
	private String updateBy;
	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@TableField(value = "update_time")
	private Date updateTime;
	/**
	 * 删除标识：0为已删除，1为未删除
	 */
	@TableField("enable_")
	@TableLogic(value = "1", delval = "0")
	private Integer enable;

}