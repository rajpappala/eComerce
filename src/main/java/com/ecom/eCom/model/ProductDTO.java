package com.ecom.eCom.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class ProductDTO {
	private Long id;
	private String productSKU;
	private String productName;
	private BigDecimal productPrice;
	private BigDecimal productWeight;
	private String productCartDesc;
	private String productShortDesc;
	private String productLongDesc;
	private String ProductThumb;
	private Byte[] image;
	private Date ProductUpdateDate;
	private Integer ProductStock;
	private Integer productLive;
	private Integer productUnlimited;
	private String productLocation;
	private List<ProductDetailDTO> productDetail;
	private ProductcategoryDTO productcategory;
	public String getProductSKU() {
		return productSKU;
	}
	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public BigDecimal getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(BigDecimal productWeight) {
		this.productWeight = productWeight;
	}
	public String getProductCartDesc() {
		return productCartDesc;
	}
	public void setProductCartDesc(String productCartDesc) {
		this.productCartDesc = productCartDesc;
	}
	public String getProductShortDesc() {
		return productShortDesc;
	}
	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}
	public String getProductLongDesc() {
		return productLongDesc;
	}
	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}
	public String getProductThumb() {
		return ProductThumb;
	}
	public void setProductThumb(String productThumb) {
		ProductThumb = productThumb;
	}
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public Date getProductUpdateDate() {
		return ProductUpdateDate;
	}
	public void setProductUpdateDate(Date productUpdateDate) {
		ProductUpdateDate = productUpdateDate;
	}
	public Integer getProductStock() {
		return ProductStock;
	}
	public void setProductStock(Integer productStock) {
		ProductStock = productStock;
	}
	public Integer getProductLive() {
		return productLive;
	}
	public void setProductLive(Integer productLive) {
		this.productLive = productLive;
	}
	public Integer getProductUnlimited() {
		return productUnlimited;
	}
	public void setProductUnlimited(Integer productUnlimited) {
		this.productUnlimited = productUnlimited;
	}
	public String getProductLocation() {
		return productLocation;
	}
	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}
	public List<ProductDetailDTO> getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(List<ProductDetailDTO> productDetail) {
		this.productDetail = productDetail;
	}
	public ProductcategoryDTO getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(ProductcategoryDTO productcategory) {
		this.productcategory = productcategory;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ProductDTO [productSKU=" + productSKU + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productWeight=" + productWeight + ", productCartDesc=" + productCartDesc
				+ ", productShortDesc=" + productShortDesc + ", productLongDesc=" + productLongDesc + ", ProductThumb="
				+ ProductThumb + ", image=" + Arrays.toString(image) + ", ProductUpdateDate=" + ProductUpdateDate
				+ ", ProductStock=" + ProductStock + ", productLive=" + productLive + ", productUnlimited="
				+ productUnlimited + ", productLocation=" + productLocation + ", productDetail=" + productDetail
				+ ", productcategory=" + productcategory + "]";
	}
	
}
