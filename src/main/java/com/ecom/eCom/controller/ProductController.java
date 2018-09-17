package com.ecom.eCom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.eCom.entity.Product;
import com.ecom.eCom.model.ProductDTO;
import com.ecom.eCom.repositories.ProductsRepo;
import com.ecom.eCom.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/product/save")
	public ProductDTO saveProduct(@RequestBody ProductDTO productDTO) {
		System.out.println(productDTO);
		return productService.saveProduct(productDTO);
	}

	@RequestMapping("/product/show")
	public ProductDTO getProduct(@RequestParam String id) {
		ProductDTO productDTO=	productService.getProduct(Long.parseLong(id));
		return productDTO;
	}
	
}
