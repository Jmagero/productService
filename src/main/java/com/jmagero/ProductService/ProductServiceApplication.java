package com.jmagero.ProductService;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.PostConstruct;

@Log4j2
@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {


	@PostConstruct
	public void init(){
		log.info("Application started finallly");
	}



	public static void main(String[] args) {
		log.info("Application started");
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
