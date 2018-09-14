package com.ecom.eCom.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productoptions")
public class Productoptions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal optionPriceIncrement;
	private String optionName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getOptionPriceIncrement() {
		return optionPriceIncrement;
	}
	public void setOptionPriceIncrement(BigDecimal optionPriceIncrement) {
		this.optionPriceIncrement = optionPriceIncrement;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	
}
