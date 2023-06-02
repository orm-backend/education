package ru.mtsbank.education.port.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorDto {

	private String message;

}
