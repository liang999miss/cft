package com.cft.weixin.bean.wxa;

import java.util.List;

import com.cft.weixin.bean.BaseResult;

public class GetnearbypoilistDataData extends BaseResult {

	private List<GetnearbypoilistPoi> poi_list;

	public List<GetnearbypoilistPoi> getPoi_list() {
		return poi_list;
	}

	public void setPoi_list(List<GetnearbypoilistPoi> poi_list) {
		this.poi_list = poi_list;
	}

}
