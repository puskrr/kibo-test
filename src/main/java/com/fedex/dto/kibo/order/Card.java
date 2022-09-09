package com.fedex.dto.kibo.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card{

	@JsonProperty("isUsedRecurring")
	private boolean isUsedRecurring;

	@JsonProperty("paymentOrCardType")
	private String paymentOrCardType;

	@JsonProperty("isCardInfoSaved")
	private boolean isCardInfoSaved;

	@JsonProperty("cardNumberPartOrMask")
	private String cardNumberPartOrMask;

	@JsonProperty("nameOnCard")
	private String nameOnCard;

	@JsonProperty("expireMonth")
	private int expireMonth;

	@JsonProperty("isTokenized")
	private boolean isTokenized;

	@JsonProperty("paymentServiceCardId")
	private String paymentServiceCardId;

	@JsonProperty("expireYear")
	private int expireYear;

	public boolean isIsUsedRecurring(){
		return isUsedRecurring;
	}

	public String getPaymentOrCardType(){
		return paymentOrCardType;
	}

	public boolean isIsCardInfoSaved(){
		return isCardInfoSaved;
	}

	public String getCardNumberPartOrMask(){
		return cardNumberPartOrMask;
	}

	public String getNameOnCard(){
		return nameOnCard;
	}

	public int getExpireMonth(){
		return expireMonth;
	}

	public boolean isIsTokenized(){
		return isTokenized;
	}

	public String getPaymentServiceCardId(){
		return paymentServiceCardId;
	}

	public int getExpireYear(){
		return expireYear;
	}
}