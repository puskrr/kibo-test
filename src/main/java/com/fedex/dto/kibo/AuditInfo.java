package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditInfo{

	@JsonProperty("updateDate")
	private String updateDate;

	@JsonProperty("createBy")
	private String createBy;

	@JsonProperty("updateBy")
	private String updateBy;

	@JsonProperty("createDate")
	private String createDate;

	public String getUpdateDate(){
		return updateDate;
	}

	public String getCreateBy(){
		return createBy;
	}

	public String getUpdateBy(){
		return updateBy;
	}

	public String getCreateDate(){
		return createDate;
	}
}