package com.cft.weixin.bean.card;

import com.cft.weixin.bean.card.AbstractCard;
import com.cft.weixin.bean.card.Cash;

/**
 * 代金券
 * 
 * @author Moyq5
 *
 */
public class CashCard extends AbstractCard {

	private Cash cash;

	public CashCard() {
		super("CASH");
	}

	public Cash getCash() {
		return cash;
	}

	public void setCash(Cash cash) {
		this.cash = cash;
	}

}
