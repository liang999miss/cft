package com.cft.weixin.bean.user;

import java.util.List;

import com.cft.weixin.bean.BaseResult;

/**
 * 标签
 * 
 * @author LiYi
 * 
 */
public class TagsGetResult extends BaseResult {

	private List<Tag> tags;

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
}
