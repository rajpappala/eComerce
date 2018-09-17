package com.ecom.eCom.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.ecom.eCom.entity.Product;
import com.ecom.eCom.model.ProductDTO;

@Mapper(componentModel="spring")
@Component
public interface ProductMapper {
	ProductMapper productMapper=Mappers.getMapper(ProductMapper.class);
	
	public ProductDTO productToProductDTO(Product product);
	
	public Product ProductDTOTOProduct(ProductDTO productDTO);
}
