package cft.vote.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author xiejinei on 2018年12月6日
 *
 */
@ApiModel("PageData(分页信息)")
public class PageData<T> {

	@ApiModelProperty(value = "总数", hidden = true)
	private long total;
	@ApiModelProperty(value = "返回数据", hidden = true)
	@ApiParam(hidden = true)
	private T data;

	public PageData() {

	}

	public PageData(T data, long total) {
		this.total = total;
		this.data = data;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
