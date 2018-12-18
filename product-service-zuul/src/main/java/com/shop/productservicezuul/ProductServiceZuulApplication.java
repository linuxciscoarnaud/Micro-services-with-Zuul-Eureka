package com.shop.productservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.shop.productservicezuul")
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = {"com.shop.productservicezuul.model"})
public class ProductServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceZuulApplication.class, args);
	}
}

