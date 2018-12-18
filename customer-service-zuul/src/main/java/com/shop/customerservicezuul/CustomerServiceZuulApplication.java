package com.shop.customerservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.shop.customerservicezuul")
@SpringBootApplication
@EntityScan(basePackages = {"com.shop.customerservicezuul.model"})
public class CustomerServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceZuulApplication.class, args);
	}
}

