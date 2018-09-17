package com.ecom.eCom.model;

public class ProductcategoryDTO {
	private Long id;
	private String categoryName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "ProductcategoryDTO [id=" + id + ", categoryName=" + categoryName + "]";
	}

}
