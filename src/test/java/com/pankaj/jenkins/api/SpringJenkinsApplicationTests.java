package com.pankaj.jenkins.api;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class SpringJenkinsApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case Executing...");
		logger.info("Test case Executing second time...");
	}

}
