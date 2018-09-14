package com.ecom.eCom.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productSKU;
	private String productName;
	private BigDecimal productPrice;
	private BigDecimal productWeight;
	private String productCartDesc;
	private String productShortDesc;
	private String productLongDesc;
	private String ProductThumb;
	@Lob
	private Byte[] image;
	private Date ProductUpdateDate;
	private Integer ProductStock;
	private Integer productLive;
	private Integer productUnlimited;
	private String productLocation;
	@OneToMany
	private List<Productoptions> productoptions;
	@OneToOne
	private Productcategories productcategories;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<Productoptions> getProductoptions() {
		return productoptions;
	}

	public void setProductoptions(List<Productoptions> productoptions) {
		this.productoptions = productoptions;
	}

	public Productcategories getProductcategories() {
		return productcategories;
	}

	public void setProductcategories(Productcategories productcategories) {
		this.productcategories = productcategories;
	}

}
