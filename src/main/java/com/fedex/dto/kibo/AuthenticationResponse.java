package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {

	@JsonProperty("refreshTokenExpiration")
	private String refreshTokenExpiration;

	@JsonProperty("accessTokenExpiration")
	private String accessTokenExpiration;

	@JsonProperty("accessToken")
	private String accessToken;

	@JsonProperty("refreshToken")
	private String refreshToken;

	public String getRefreshTokenExpiration(){
		return refreshTokenExpiration;
	}

	public String getAccessTokenExpiration(){
		return accessTokenExpiration;
	}

	public String getAccessToken(){
		return accessToken;
	}

	public String getRefreshToken(){
		return refreshToken;
	}
}