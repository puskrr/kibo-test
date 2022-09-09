package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorizationRequest {

	@JsonProperty("grant_type")
	private String grantType;

	@JsonProperty("client_secret")
	private String clientSecret;

	@JsonProperty("client_id")
	private String clientId;

	public String getGrantType(){
		return grantType;
	}

	public String getClientSecret(){
		return clientSecret;
	}

	public String getClientId(){
		return clientId;
	}
}