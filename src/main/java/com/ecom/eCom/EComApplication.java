package com.ecom.eCom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ecom.eCom.entity.Productcategory;
import com.ecom.eCom.repositories.ProductcategoryRepo;
import com.ecom.eCom.repositories.ProductDetailsRepo;
import com.ecom.eCom.repositories.ProductsRepo;

@SpringBootApplication
public class EComApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext aContext=	SpringApplication.run(EComApplication.class, args);
	ProductsRepo productsRepo=aContext.getBean(ProductsRepo.class);
	ProductDetailsRepo p=aContext.getBean(ProductDetailsRepo.class);
	ProductcategoryRepo pc=aContext.getBean(ProductcategoryRepo.class);
	Productcategory pcat=new Productcategory();
	pcat.setCategoryName("Electronics");
	pc.save(pcat);
	System.out.println(productsRepo);
	System.out.println(p);
	}
}
