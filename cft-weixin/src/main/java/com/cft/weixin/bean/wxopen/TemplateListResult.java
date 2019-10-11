package com.cft.weixin.bean.wxopen;

import java.util.List;

import com.cft.weixin.bean.BaseResult;

public class TemplateListResult extends BaseResult {

	private List<TemplateListItem> list;

	public List<TemplateListItem> getList() {
		return list;
	}

	public void setList(List<TemplateListItem> list) {
		this.list = list;
	}

}
