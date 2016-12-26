package com.qingtian.data.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com/qingtian/data/rest/dao")
public class SpringDataRestDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestDemoApplication.class, args);
	}
}
