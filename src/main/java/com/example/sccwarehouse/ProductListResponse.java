package com.example.sccwarehouse;

import java.util.List;

/**
 * @author Eddú Meléndez
 */
public class ProductListResponse {

	private List<ProductResponse> products;

	public List<ProductResponse> getProducts() {
		return this.products;
	}

	public void setProducts(List<ProductResponse> products) {
		this.products = products;
	}
}
