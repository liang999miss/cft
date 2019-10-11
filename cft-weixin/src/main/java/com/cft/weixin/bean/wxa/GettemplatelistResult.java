package com.cft.weixin.bean.wxa;

import java.util.List;

import com.cft.weixin.bean.BaseResult;

public class GettemplatelistResult extends BaseResult {

	private List<TemplateItem> template_list;

	public List<TemplateItem> getTemplate_list() {
		return template_list;
	}

	public void setTemplate_list(List<TemplateItem> template_list) {
		this.template_list = template_list;
	}

}
