package com.ogustavodias.games_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GamesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesMicroserviceApplication.class, args);
	}

}
