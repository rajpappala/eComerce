package com.ecom.eCom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.eCom.entity.Products;
@Repository
public interface ProductsRepo extends CrudRepository<Products, Long> {

}
