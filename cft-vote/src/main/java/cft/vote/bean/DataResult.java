package cft.vote.bean;

import java.io.Serializable;

import cft.vote.enums.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author xiejinei on 2018年12月13日
 *
 */
@ApiModel("Result(返回结果)")
public class DataResult implements Serializable {

	private static final long serialVersionUID = 5063776667672736098L;

	@ApiModelProperty("状态，10200表示成功， 10500表示失败")
	private Integer code = ResultCodeEnum.RESULT_SUCCESS;//

	@ApiModelProperty("提示性信息")
	private String message = "成功";

	@ApiModelProperty("数据体")
	private Object data;

	@ApiModelProperty("时间戳")
	private long timestamp = System.currentTimeMillis();

	@ApiModelProperty("是否成功(兼容审批项目，后续不要再使用)")
	private boolean isSuccess;

	public DataResult() {

	}

	public DataResult(Integer code, String message, Object data) {
		this.message = message;
		this.data = data;
		this.code = code;
	}

	public DataResult(String message, Object data) {
		this.message = message;
		this.data = data;
	}

	public DataResult(Object data) {
		this.data = data;
	}

	public boolean getIsSuccess() {
		return ResultCodeEnum.RESULT_SUCCESS.equals(this.code);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
