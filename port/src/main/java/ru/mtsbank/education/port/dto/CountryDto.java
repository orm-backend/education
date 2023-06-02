package ru.mtsbank.education.port.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDto {

	private Integer id;
	
	private String name;

	@JsonProperty("latitude")
	private BigDecimal lat;

	@JsonProperty("longitude")
	private BigDecimal lon;
	
	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;
	
}
