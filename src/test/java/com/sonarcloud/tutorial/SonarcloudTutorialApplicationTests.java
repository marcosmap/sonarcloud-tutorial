package com.sonarcloud.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarcloudTutorialApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals("asdasd", Mockito.anyString());
		Assertions.assertEquals("marcos", Mockito.anyString());
	}

}
