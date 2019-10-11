package com.cft.weixin.bean.poi;

import com.cft.weixin.bean.BaseResult;

/**
 * 门店信息－响应对象
 * 
 * @author Moyq5
 *
 */
public class PoiResult extends BaseResult {

	private BusinessResult business;

	public BusinessResult getBusiness() {
		return business;
	}

	public void setBusiness(BusinessResult business) {
		this.business = business;
	}
}
