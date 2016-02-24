package com.tinysquare.api.shop.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinysquare.api.shop.vo.ShopVo;
import com.tinysquare.commons.constants.Constants;
import com.tinysquare.dao.entity.Shop;
import com.tinysquare.dao.entity.ShopExample;
import com.tinysquare.dao.mapper.ShopMapper;

@Component
public class ShopService {

	@Autowired
	private ShopMapper shopMapper;

	public Shop getByPrimaryKey(Long id) {
		return this.shopMapper.selectByPrimaryKey(id);
	}

	public ShopVo getVoByPrimaryKey(Long id) {
		Shop shop = this.getByPrimaryKey(id);
		if (shop == null || shop.getStatus() != Constants.Status.NORMAL) {
			return null;
		}
		return new ShopVo(id, shop.getUserId(), shop.getName(), shop.getMobile(), shop.getTel(), shop.getAddress(), shop.getBrief(), shop.getDescription(),
				shop.getFavoriteCount(), shop.getLongitude() == null ? 0d : shop.getLongitude().doubleValue(),
				shop.getLatitude() == null ? 0d : shop.getLatitude().doubleValue());
	}

	public Shop getByUserId(Long userId) {
		ShopExample example = new ShopExample();
		example.or().andUserIdEqualTo(userId).andStatusEqualTo(Constants.Status.NORMAL);
		List<Shop> shopList = this.shopMapper.selectByExample(example);
		return CollectionUtils.isEmpty(shopList) ? null : shopList.get(0);
	}

	public Integer updateByPrimaryKey(Shop shop) {
		return this.shopMapper.updateByPrimaryKeySelective(shop);
	}
}
