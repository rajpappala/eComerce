package com.ecom.eCom.model;

public class ProductDetailDTO {
	private Long id;
	private String detailName;
	private String detailValue;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetailName() {
		return detailName;
	}
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}
	public String getDetailValue() {
		return detailValue;
	}
	public void setDetailValue(String detailValue) {
		this.detailValue = detailValue;
	}
	@Override
	public String toString() {
		return "ProductDetailDTO [id=" + id + ", detailName=" + detailName + ", detailValue=" + detailValue + "]";
	}

}
