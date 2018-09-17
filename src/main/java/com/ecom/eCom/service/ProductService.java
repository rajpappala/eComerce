package com.ecom.eCom.service;

import com.ecom.eCom.model.ProductDTO;

public interface ProductService {

	public ProductDTO saveProduct(ProductDTO product);
	public ProductDTO updateProduct(ProductDTO product);
	public ProductDTO getProduct(Long id);
}
