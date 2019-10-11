package cft.vote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cft.vote.bean.DataResult;
import cft.vote.bean.PageInfo;
import cft.vote.pojo.CftWechatConfig;
import cft.vote.service.ICftWechatConfigService;

@RestController
@RequestMapping("vote/cft/Wechat/config")
public class CftWechatConfigController {

	@Autowired
	ICftWechatConfigService cftWechatConfigService;
	
	@RequestMapping("page")
	public DataResult page(PageInfo pageInfo, CftWechatConfig vo) {
		return new DataResult(cftWechatConfigService.page(pageInfo, vo));
	}
	
}
