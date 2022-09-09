package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TotalOrderAmount{

	@JsonProperty("amount")
	private int amount;

	public int getAmount(){
		return amount;
	}
}