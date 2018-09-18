package com.ecom.eCom.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {

	Product product;

	@Before
	public void setUp() {
		product = new Product();
	}

	@Test
	public void testGetId() {
		Long id = 10l;

		product.setId(10l);
		assertEquals(id, product.getId());
	}

	@Test
	public void testGetProductSKU() {
		String test_val = "ID_232323_2";
		product.setProductSKU("ID_232323_2");
		assertEquals(test_val, product.getProductSKU());
	}

	@Test
	public void testGetProductName() {
		String test_val = "ID_232323_2";
		product.setProductName("ID_232323_2");
		assertEquals(test_val, product.getProductName());
	}

	@Test
	public void testGetProductPrice() {
		BigDecimal test_val = BigDecimal.valueOf(10.22);
		product.setProductPrice(BigDecimal.valueOf(10.22));
		assertEquals(test_val, product.getProductPrice());
	}

	@Test
	public void testGetProductWeight() {
		BigDecimal test_val = BigDecimal.valueOf(10.22);
		product.setProductWeight(BigDecimal.valueOf(10.22));
		assertEquals(test_val, product.getProductWeight());
	}

	@Test
	public void testGetProductCartDesc() {
		String test_val = "ID_232323_2";
		product.setProductCartDesc("ID_232323_2");
		assertEquals(test_val, product.getProductCartDesc());
	}

	@Test
	public void testGetProductShortDesc() {
		String test_val = "ID_232323_2";
		product.setProductShortDesc("ID_232323_2");
		assertEquals(test_val, product.getProductShortDesc());
	}

	@Test
	public void testGetProductLongDesc() {
		String test_val = "ID_232323_2";
		product.setProductLongDesc("ID_232323_2");
		assertEquals(test_val, product.getProductLongDesc());
	}

	@Test
	public void testGetProductThumb() {
		String test_val = "ID_232323_2";
		product.setProductThumb("ID_232323_2");
		assertEquals(test_val, product.getProductThumb());
	}

	@Test
	public void testGetImage() {
		String test_val = "ID_232323_2";
		product.setProductThumb("ID_232323_2");
		assertEquals(test_val, product.getProductThumb());
	}

	@Test
	public void testGetProductUpdateDate() {
		Date test_val = new Date(2018, 11, 11);
		product.setProductUpdateDate(new Date(2018, 11, 11));
		assertEquals(test_val, product.getProductUpdateDate());
	}

	@Test
	public void testGetProductStock() {
		Integer test_val = 222;
		product.setProductStock(222);
		assertEquals(test_val, product.getProductStock());
	}

	@Test
	public void testGetProductLive() {
		Integer test_val = 222;
		product.setProductLive(222);
		assertEquals(test_val, product.getProductLive());
	}

	@Test
	public void testGetProductUnlimited() {
		Integer test_val = 222;
		product.setProductUnlimited(222);
		assertEquals(test_val, product.getProductUnlimited());
	}

	@Test
	public void testGetProductLocation() {
		String test_val = "ID_232323_2";
		product.setProductLocation("ID_232323_2");
		assertEquals(test_val, product.getProductLocation());
	}
//
//	@Test
//	public void testGetProductcategory() {
//		fail("");
//	}
//
//	@Test
//	public void testGetProductDetail() {
//		fail("");
//	}

}
