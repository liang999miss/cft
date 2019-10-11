package com.cft.weixin.bean.card;

import com.cft.weixin.bean.card.AbstractCard;
import com.cft.weixin.bean.card.Gift;

/**
 * 兑换券
 * 
 * @author Moyq5
 *
 */
public class GiftCard extends AbstractCard {

	private Gift gift;

	public GiftCard() {
		super("GIFT");
	}

	public Gift getGift() {
		return gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}

}
