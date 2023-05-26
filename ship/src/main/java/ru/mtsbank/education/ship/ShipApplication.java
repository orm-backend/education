package ru.mtsbank.education.ship;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ShipApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Arrays.stream(args).forEach(log::info);
	}

}
