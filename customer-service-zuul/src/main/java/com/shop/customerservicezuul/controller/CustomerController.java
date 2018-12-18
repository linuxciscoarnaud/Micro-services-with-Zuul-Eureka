/**
 * 
 */
package com.shop.customerservicezuul.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.shop.customerservicezuul.model.DataProduct;

/**
 * @author Arnaud
 *
 */

@Controller
@PropertySource({"classpath:application.properties"})
@RequestMapping("consumer")
public class CustomerController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/product/{productId}")
	public DataProduct requestProductByProductId(@PathVariable String productId) throws RestClientException, IOException {
		
		DataProduct response = new DataProduct();
		
		List<ServiceInstance> instances = discoveryClient.getInstances("ZUUL-GATEWAY-SERVICE");
		ServiceInstance serviceInstance = instances.get(0);
		
		String baseUrl = serviceInstance.getUri().toString();
		baseUrl = baseUrl + "/producer/product/{productId}";
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("productId", productId);
		
		ResponseEntity<DataProduct> responseEntity = new RestTemplate().exchange(
				baseUrl,
				HttpMethod.GET,
				getHeaders(),
				DataProduct.class,
				uriVariables);
		
		response = responseEntity.getBody();
		
		return new DataProduct(response.getProductId(),
				response.getName(),
				response.getDescription(),
				response.getUnitPrice(),
				response.getCategory());
	}
	
	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}
