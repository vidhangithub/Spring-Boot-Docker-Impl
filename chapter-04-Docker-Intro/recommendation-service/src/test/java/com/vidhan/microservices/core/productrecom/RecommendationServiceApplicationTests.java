package com.vidhan.microservices.core.productrecom;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT,
		properties = {"eureka.client.enabled=false"})
class RecommendationServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
