package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneNumbers{

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("home")
	private String home;

	public String getMobile(){
		return mobile;
	}

	public String getHome(){
		return home;
	}
}