package ru.mtsbank.education.port.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ru.mtsbank.education.port.dto.ErrorDto;

@ControllerAdvice
public class CuctomControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDto> exceptionHandler(Exception e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(ErrorDto.builder().message(e.getLocalizedMessage()).build());
	}

}
