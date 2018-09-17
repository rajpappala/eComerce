package com.ecom.eCom.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.eCom.model.ProductDTO;
import com.ecom.eCom.service.ProductService;

@RestController
public class ProductController {
	static final Logger logger = LogManager.getLogger(ProductController.class.getName());
	
	@Autowired
	private ProductService productService;

	@RequestMapping("/product/save")
	public ProductDTO saveProduct(@RequestBody ProductDTO productDTO) {
		 logger.debug("XXXXXXXXXXXXXXX"+productDTO.toString());
		return productService.saveProduct(productDTO);
	}
	

	@RequestMapping("/product/show")
	public ProductDTO getProduct(@RequestParam String id) {
		ProductDTO productDTO = productService.getProduct(Long.parseLong(id));
		return productDTO;
	}

}
