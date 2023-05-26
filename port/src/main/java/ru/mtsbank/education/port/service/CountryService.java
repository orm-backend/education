package ru.mtsbank.education.port.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.mtsbank.education.port.entity.Country;
import ru.mtsbank.education.port.repository.CountryRepository;

@Service
@RequiredArgsConstructor
public class CountryService {

	private final CountryRepository repository;

	public List<Country> fetchAll() {
		return repository.findAll();
	}

}
