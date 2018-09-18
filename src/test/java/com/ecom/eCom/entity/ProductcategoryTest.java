package com.ecom.eCom.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductcategoryTest {

	Productcategory productcategory;

	@Test
	public void testSetId() {
		Long  id=10l;
		productcategory = new Productcategory();
		productcategory.setId(10l);
		assertEquals(id, productcategory.getId());
	}
}
