package com.cft.weixin.bean.datacube.getcardmembercardinfo;

import java.util.List;

import com.cft.weixin.bean.BaseResult;

/**
 * 拉取会员卡数据接口－响应对象
 * 
 * @author Moyq5
 *
 */
public class MemberCardInfoResult extends BaseResult {

	List<MemberCardInfoResultInfo> list;

	public List<MemberCardInfoResultInfo> getList() {
		return list;
	}

	public void setList(List<MemberCardInfoResultInfo> list) {
		this.list = list;
	}
}
