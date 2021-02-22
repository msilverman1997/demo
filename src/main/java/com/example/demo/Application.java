package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(PathRepository repository){
		return (args) -> {
			repository.save(new Path("NYC", "Chicago", "1000", "Large", "Monday"));
			repository.save(new Path("LA", "D.C.", "2500", "Large", "Monday"));
			repository.save(new Path("Dallas", "Kansas City", "300", "Large", "Monday"));
			repository.save(new Path("Atlanta", "Miami", "350", "Large", "Monday"));
			repository.save(new Path("Boston", "NYC", "200", "Large", "Monday"));

			log.info("Database Values Initialized");

		};
	}

}
