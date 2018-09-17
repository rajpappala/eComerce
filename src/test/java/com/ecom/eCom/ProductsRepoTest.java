package com.ecom.eCom;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.ecom.eCom.entity.Product;
import com.ecom.eCom.entity.Productcategory;
import com.ecom.eCom.repositories.ProductsRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsRepoTest {

	@Autowired
	public ProductsRepo ProductsRepo;

	Product product;

	Productcategory productcategory;

	@Before
	public void setUp() {
		product = new Product();
		productcategory = new Productcategory();
	}

	@Test
	public void add() throws InterruptedException {
		product.setId(11L);
		productcategory.setId(1L);
		product.setProductcategory(productcategory);
		ProductsRepo.save(product);
		System.out.println(product);
		System.out.println(product);
		System.out.println(ProductsRepo.findById(11L));
		Thread.sleep(50000);
		assertEquals(ProductsRepo.findById(11L).get(), product);

	}

}
