package com.common.retail;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@RequestMapping("/shopping")
	public String welcome() {
		return"welcome to shopping cart";
	}
	
	@RequestMapping("/shopping/cart")
	public String cart() {
		return "Welcome to Cart";
	}
}
