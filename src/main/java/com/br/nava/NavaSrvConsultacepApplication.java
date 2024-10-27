package com.br.nava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = { "com.br.nava" })
public class NavaSrvConsultacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(NavaSrvConsultacepApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
