package com.ecom.eCom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.eCom.entity.Product;
@Repository
public interface ProductsRepo extends CrudRepository<Product, Long> {

}
