package com.bridgelabz.springbootexample;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@Slf4j
public class SpringBootExampleApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
		logger.info("Info Level");
		logger.warn("Warn Message");
		logger.debug("Debug message");
		log.info("Using Lombox Log");
	}
}