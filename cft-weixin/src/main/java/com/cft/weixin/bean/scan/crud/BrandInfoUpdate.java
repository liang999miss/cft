package com.cft.weixin.bean.scan.crud;

import com.cft.weixin.bean.BaseResult;
import com.cft.weixin.bean.scan.info.ActionInfo;


public class BrandInfoUpdate extends BaseResult {
    private ActionInfo action_info;

    public ActionInfo getAction_info() {
        return action_info;
    }

    public void setAction_info(ActionInfo action_info) {
        this.action_info = action_info;
    }
}
