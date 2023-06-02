package ru.mtsbank.education.port.controller.v1;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.mtsbank.education.port.dto.CountryDto;
import ru.mtsbank.education.port.mapper.CountryMapper;
import ru.mtsbank.education.port.service.CountryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/countries")
public class CountryControllerV1 {

	private final CountryService service;
	private final CountryMapper mapper;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CountryDto> fetchAllCountries() {
		return mapper.map(service.fetchAll());
	}

}
