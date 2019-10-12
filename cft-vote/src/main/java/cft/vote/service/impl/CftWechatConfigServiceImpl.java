package cft.vote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cft.vote.bean.PageData;
import cft.vote.bean.PageInfo;
import cft.vote.mapper.CftWechatConfigMapper;
import cft.vote.pojo.CftWechatConfig;
import cft.vote.service.ICftWechatConfigService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CftWechatConfigServiceImpl extends ServiceImpl<CftWechatConfigMapper, CftWechatConfig> implements ICftWechatConfigService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Override
	public PageData<List<CftWechatConfig>> page(PageInfo pageInfo, CftWechatConfig config) {
		log.info("传入参数:{}", config);
		
		String strr = stringRedisTemplate.opsForValue().get("97b63b8de685492ba1e0e3951db8bef2COMPANY");
		System.out.println(strr);
		
		Page<CftWechatConfig> page = new Page<CftWechatConfig>(pageInfo.getPageNum(), pageInfo.getPageSize());
		IPage<CftWechatConfig> iPage = this.baseMapper.page(page, config);
		return new PageData<List<CftWechatConfig>>(iPage.getRecords(), iPage.getTotal());
	}


}
