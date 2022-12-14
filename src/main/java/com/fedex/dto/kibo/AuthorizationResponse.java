package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorizationResponse {
	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("refresh_token")
	private String refreshToken;

	@JsonProperty("token_type")
	private String tokenType;

	@JsonProperty("expires_in")
	private int expiresIn;

	public String getAccessToken(){
		return accessToken;
	}

	public String getRefreshToken(){
		return refreshToken;
	}

	public String getTokenType(){
		return tokenType;
	}

	public int getExpiresIn(){
		return expiresIn;
	}
}
