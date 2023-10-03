package com.jmagero.ProductService;


import lombok.extern.log4j.Log4j2;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Log4j2
@SpringBootApplication
public class ProductServiceApplication {


	@PostConstruct
	public void init(){
		log.info("Application started");
	}



	public static void main(String[] args) {
		log.info("Application started");
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
