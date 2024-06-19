package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static org.slf4j.Logger logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case excuting......");
		logger.info("Test case excuting second log statement......");
		assertEquals(true, true);
	}

}
