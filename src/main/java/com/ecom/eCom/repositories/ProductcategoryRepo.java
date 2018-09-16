package com.ecom.eCom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ecom.eCom.entity.Productcategory;
@Repository
public interface ProductcategoryRepo extends CrudRepository<Productcategory, Long> {

}
