package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationRequest {

	@JsonProperty("applicationId")
	private String applicationId;

	@JsonProperty("sharedSecret")
	private String sharedSecret;

	public String getApplicationId(){
		return applicationId;
	}

	public String getSharedSecret(){
		return sharedSecret;
	}
}