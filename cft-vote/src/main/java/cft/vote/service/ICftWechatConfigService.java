package cft.vote.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import cft.vote.bean.PageData;
import cft.vote.bean.PageInfo;
import cft.vote.pojo.CftWechatConfig;

public interface ICftWechatConfigService extends IService<CftWechatConfig> {

	PageData<List<CftWechatConfig>> page(PageInfo pageInfo, CftWechatConfig config);
}
