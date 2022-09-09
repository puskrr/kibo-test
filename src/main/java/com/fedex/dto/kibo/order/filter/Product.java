package com.fedex.dto.kibo.order.filter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product{

	@JsonProperty("bundledProducts")
	private List<Object> bundledProducts;

	@JsonProperty("isTaxable")
	private boolean isTaxable;

	@JsonProperty("description")
	private String description;

	@JsonProperty("isPackagedStandAlone")
	private boolean isPackagedStandAlone;

	@JsonProperty("fulfillmentStatus")
	private String fulfillmentStatus;

	@JsonProperty("goodsType")
	private String goodsType;

	@JsonProperty("productCode")
	private String productCode;

	@JsonProperty("price")
	private Price price;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("options")
	private List<Object> options;

	@JsonProperty("name")
	private String name;

	@JsonProperty("categories")
	private List<Object> categories;

	@JsonProperty("stock")
	private Stock stock;

	@JsonProperty("properties")
	private List<Object> properties;

	public List<Object> getBundledProducts(){
		return bundledProducts;
	}

	public boolean isIsTaxable(){
		return isTaxable;
	}

	public String getDescription(){
		return description;
	}

	public boolean isIsPackagedStandAlone(){
		return isPackagedStandAlone;
	}

	public String getFulfillmentStatus(){
		return fulfillmentStatus;
	}

	public String getGoodsType(){
		return goodsType;
	}

	public String getProductCode(){
		return productCode;
	}

	public Price getPrice(){
		return price;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public List<Object> getOptions(){
		return options;
	}

	public String getName(){
		return name;
	}

	public List<Object> getCategories(){
		return categories;
	}

	public Stock getStock(){
		return stock;
	}

	public List<Object> getProperties(){
		return properties;
	}
}