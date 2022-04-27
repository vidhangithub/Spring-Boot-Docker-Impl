package com.vidhan.microservices.productcomposite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.vidhan")
public class ProductCompositeServiceApplication {

	@Bean
	@LoadBalanced
	RestTemplate getRestTemplate(){
		return  new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductCompositeServiceApplication.class, args);
	}

}
