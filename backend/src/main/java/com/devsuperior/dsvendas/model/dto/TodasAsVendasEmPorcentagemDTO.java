package com.devsuperior.dsvendas.model.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.model.Seller;

public class TodasAsVendasEmPorcentagemDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	public TodasAsVendasEmPorcentagemDTO() {
		
	}

	public TodasAsVendasEmPorcentagemDTO(Seller seller, Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	

}
