package com.vidhan.microservices.core.productreview;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT,
		properties = {"eureka.client.enabled=false"})
class ReviewServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
