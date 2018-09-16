package com.ecom.eCom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.eCom.entity.ProductDetail;

@Repository
public interface ProductDetailsRepo extends CrudRepository<ProductDetail, Long> {

}
