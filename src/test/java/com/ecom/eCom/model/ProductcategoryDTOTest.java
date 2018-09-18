package com.ecom.eCom.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductcategoryDTOTest {

	ProductcategoryDTO productcategoryDTO;
	@Before
	public void iniTest() {
		productcategoryDTO=new ProductcategoryDTO();
	}
 

	@Test
	public void testGetCategoryName() {
		String test_val = "ID_232323_2";
		productcategoryDTO.setCategoryName("ID_232323_2");
		assertEquals(test_val, productcategoryDTO.getCategoryName());
	}

}
