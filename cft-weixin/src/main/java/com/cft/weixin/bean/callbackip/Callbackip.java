package com.cft.weixin.bean.callbackip;

import java.util.List;

import com.cft.weixin.bean.BaseResult;

public class Callbackip extends BaseResult{

	public List<String> ip_list;

	public List<String> getIp_list() {
		return ip_list;
	}

	public void setIp_list(List<String> ip_list) {
		this.ip_list = ip_list;
	}
	
}
