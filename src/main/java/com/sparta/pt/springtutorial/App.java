package com.sparta.pt.springtutorial;

import com.sparta.pt.springtutorial.run.Location;
import com.sparta.pt.springtutorial.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		log.info("App started successfully");
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			Run run = new Run(1,"First run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
			log.info("Run: ", run);
		};
	}
}
