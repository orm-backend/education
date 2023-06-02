package ru.mtsbank.education.port.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ru.mtsbank.education.port.dto.CountryDto;
import ru.mtsbank.education.port.entity.Country;

@Mapper(componentModel = "spring")
public interface CountryMapper {

	@Mapping(target = "id", source = "id")
	@Mapping(target = "createdAt", ignore = true)
	CountryDto map(Country entity);

	@IterableMapping(elementTargetType = CountryDto.class)
	List<CountryDto> map(List<Country> countries);

}
