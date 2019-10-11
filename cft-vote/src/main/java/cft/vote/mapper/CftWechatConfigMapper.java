package cft.vote.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import cft.vote.pojo.CftWechatConfig;

public interface CftWechatConfigMapper extends BaseMapper<CftWechatConfig> {

	IPage<CftWechatConfig> page(Page<CftWechatConfig> page, @Param("vo") CftWechatConfig vo);

}
