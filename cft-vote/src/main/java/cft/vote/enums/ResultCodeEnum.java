package cft.vote.enums;
/**
 *
 * 状态码枚举
 *
 * @author xiejinei on 2018年12月12日
 *
 */
public class ResultCodeEnum {
	/** 成功状态码 */
	public static final Integer RESULT_SUCCESS = 10200;
	/** 失败状态码 */
	public static final Integer RESULT_FAIL = 10500;
	/**无权状态码*/
	public static final Integer RESULT_UNAUTHORIZED = 10001;
	/**没登录态码(过时)*/
	public static final Integer RESULT_NO_LOGIN = 10002;
	/**业务操作失败状态码*/
	public static final Integer RESULT_OPERATION_FAIL = 10003;
	/**不支持方法请求状态码*/
	public static final Integer RESULT_METHOD_NOT_SUPPORT = 10004;
	/**参数不正确请求状态码*/
	public static final Integer RESULT_PARAMETER_ERROR = 10005;
	/** 服务器异常状态码 */
	public static final Integer RESULT_ERROR = 10006;
	/** 用户名密码错误 */
	public static final Integer RESULT_USERNAME_PASSWORD = 10007;
	/** TOKEN无效 */
	public static final Integer RESULT_TOKEN_INVALID = 10008;
	/** 请求无TOKEN */
	public static final Integer RESULT_NO_TOKEN = 10009;
	/** 不支持刷新token */
	public static final Integer RESULT_NOT_SUPPORT_REFRESH = 10010;
	/** 刷新token无效 */
	public static final Integer RESULT_REFRESH_TOKEN_INVALID = 10011;
	/** 刷新token次数达到上限 */
	public static final Integer RESULT_REFRESH_TOKEN_COUNT_MAX = 10012;



	/** 不存在的第三方userId */
	public static final Integer RESULT_NO_THIRD_USERID = 11001;
	/** 不存在的clientId */
	public static final Integer RESULT_NO_CLIENTID = 11002;
	/** clientSecret不匹配 */
	public static final Integer RESULT_ERROR_CLIENT_SECRET = 11003;
	/** 无效的授权类型 */
	public static final Integer RESULT_ERROR_GRANT_TYPE = 11004;
	/** 无效的scope */
	public static final Integer RESULT_ERROR_SCOPE = 11005;
	/** 生成tolen失败 */
	public static final Integer RESULT_FAIL_CREATE_TOKEN = 11006;
	/** 验证码失效或者不存在 */
	public static final Integer RESULT_NO_VALIDCODE = 11007;
	/** 验证码不匹配 */
	public static final Integer RESULT_ERROR_VALIDCODE = 11008;
	/** 手机号不存在 */
	public static final Integer RESULT_NO_MOBILE = 11009;
	/** 短信当日发送超过次数 */
	public static final Integer RESULT_ERROR_SMS_CODE = 11010;
	/** 调用短信服务失败 */
	public static final Integer RESULT_FAIL_SEND_SMS = 11011;
	/** RSA解密出错 */
	public static final Integer RESULT_FAIL_RSA = 11012;
	/** 调用平台登录超时 */
	public static final Integer RESULT_LOGIN_PLATFORM_TIMEOUT = 11013;
	/** 该用户未在本地系统初始化 */
	public static final Integer RESULT_USER_NO_INIT = 11014;
	/** 固定时间内重复请求 */
	public static final Integer RESULT_TIMES_OUT = 11015;
	/** 未配置第三方系统的登陆地址 */
	public static final Integer RESULT_NO_THIRD_LOGIN_URL = 11016;
	/** 访问第三方系统的登陆地址失败 */
	public static final Integer RESULT_REQUEST_THIRD_LOGIN_URL_FAIL = 11017;
	/** 该clientId未获取访问token */
	public static final Integer RESULT_THIRD_CLIENTID_NO_TOKEN = 11018;



	/** 不存在的第三方userId */
	public static final Integer RESULT_NOTEXISTS_THIRD_USER_ID = 12010;
	/** 用户找不到 */
	public static final Integer RESULT_NOTEXISTS_USER = 12011;
	/** 用户已存在 */
	public static final Integer RESULT_EXISTS_USER = 12012;
	/** 用户同步失败 */
	public static final Integer RESULT_SYN_USER_ERROR = 12013;
	/** 用户在系统已存在 */
	public static final Integer RESULT_EXISTS_USER_IN_SYS = 12015;
	/** 用户未推送userId */
	public static final Integer RESULT_NOT_SEND_USERID = 12016;


	/** 不存在的第三方COMPANY_ID */
	public static final Integer RESULT_NOTEXISTS_THIRD_COMPANY_ID = 12020;
	/** 不存在该企业 */
	public static final Integer RESULT_NOTEXISTS_COMPANY = 12021;
	/** 企业已存在 */
	public static final Integer RESULT_EXISTS_COMPANY = 12022;
	/** 企业同步失败 */
	public static final Integer RESULT_SYN_COMPANY_ERROR = 12024;
	/** 企业在系统已存在 */
	public static final Integer RESULT_EXISTS_COMPANY_IN_SYS = 12025;
	/** 企业未推送companyId */
	public static final Integer RESULT_NOT_SEND_CONPANYID = 12026;

	/** 不存在的第三方STAFF_Id */
	public static final Integer RESULT_NOTEXISTS_THIRD_STAFF_ID = 12030;
	/** 不存在的该员工 */
	public static final Integer RESULT_NOTEXISTS_STAFF = 12031;
	/** 企业已存在 */
	public static final Integer RESULT_EXISTS_STAFF = 12032;
	/** 员工同步失败 */
	public static final Integer RESULT_SYN_STAFF_ERROR = 12034;
	/** 员工在系统已存在 */
	public static final Integer RESULT_EXISTS_STAFF_IN_SYS = 12035;
	/** 员工未推送staffId */
	public static final Integer RESULT_NOT_SEND_STAFFID = 12036;


	/** 电话已存在 */
	public static final Integer RESULT_EXISTS_PHONE = 12070;
	/** MQ异常 */
	public static final Integer RESULT_MQ_ERROR = 12090;


	/** 网关异常 */
	public static final Integer RESULT_GATEWAY_ERROR = 13500;
}
