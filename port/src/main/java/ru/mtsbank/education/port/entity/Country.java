package ru.mtsbank.education.port.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Country extends BaseEntity {

	private static final long serialVersionUID = -9027312811497843287L;

	@NotBlank
	@Size(max = 255)
	@Column(nullable = false)
	private String name;

	@NotNull
	@Column(nullable = false)
	private BigDecimal lat;

	@NotNull
	@Column(nullable = false)
	private BigDecimal lon;

}
