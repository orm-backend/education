package ru.mtsbank.education.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.mtsbank.education.port.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
