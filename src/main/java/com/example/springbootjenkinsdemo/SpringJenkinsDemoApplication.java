package com.example.springbootjenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

	// init method run before our application start
	@PostConstruct
	public void init(){
		logger.info("Application started.........");
	}

	public static void main(String[] args) {
		logger.info("Application executed........");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
