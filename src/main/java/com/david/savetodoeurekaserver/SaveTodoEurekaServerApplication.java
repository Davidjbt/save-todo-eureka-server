package com.david.savetodoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SaveTodoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveTodoEurekaServerApplication.class, args);
	}

}
