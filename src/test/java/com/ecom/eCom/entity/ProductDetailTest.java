package com.ecom.eCom.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductDetailTest {

	ProductDetail productDetail;

	@Test
	public void testSetId() {
		Long  id=10l;
		productDetail = new ProductDetail();
		productDetail.setId(10l);
		assertEquals(id, productDetail.getId());
	}

}
