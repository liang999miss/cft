package com.cft.weixin.bean.scan.info;


import com.cft.weixin.bean.scan.infolist.ActionList;

import java.util.List;

public class ActionInfo {
    private List<ActionList> action_list;

    public List<ActionList> getAction_list() {
        return action_list;
    }

    public void setAction_list(List<ActionList> action_list) {
        this.action_list = action_list;
    }
}
