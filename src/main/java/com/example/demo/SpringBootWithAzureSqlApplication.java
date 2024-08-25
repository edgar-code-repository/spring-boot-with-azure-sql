
package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootWithAzureSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithAzureSqlApplication.class, args);
		log.debug("[main][AZURE_SQL_SERVER_TEST_URL: {}]", System.getenv("AZURE_SQL_SERVER_TEST_URL"));
	}

}
