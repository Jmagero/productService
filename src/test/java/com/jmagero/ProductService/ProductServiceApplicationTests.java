package com.jmagero.ProductService;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test case executing");
		assertEquals(true,true);
	}

}
