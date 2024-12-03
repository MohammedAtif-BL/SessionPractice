package com.bridgelabz.springexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
//@Slf4j
public class SpringexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringexampleApplication.class, args);
//		log.info("Info Level");
//		log.error("Error level");
//		log.debug("Debuf level");
//		log.warn("Warn level");
	}

}
