package com.ecom.eCom.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ecom.eCom.controller.ProductController;
import com.ecom.eCom.entity.Product;
import com.ecom.eCom.mapper.ProductMapper;
import com.ecom.eCom.model.ProductDTO;
import com.ecom.eCom.repositories.ProductsRepo;

@Service
public class ProductServiceImpl implements ProductService {
	static final Logger logger = LogManager.getLogger(ProductController.class.getName());
	private final ProductMapper productMapper;
	private final ProductsRepo productRepo;

	public ProductServiceImpl(ProductMapper productMapper, ProductsRepo productRepo) {
		super();
		this.productMapper = productMapper;
		this.productRepo = productRepo;
	}

	@Override
	public ProductDTO saveProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		logger.debug(productMapper.ProductDTOTOProduct(productDTO));
		Product p = productRepo.save(productMapper.ProductDTOTOProduct(productDTO));
		return productMapper.productToProductDTO(p);
	}

	@Override
	public ProductDTO updateProduct(ProductDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO getProduct(Long id) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(id).get();

		return productMapper.productToProductDTO(product);
	}

}
