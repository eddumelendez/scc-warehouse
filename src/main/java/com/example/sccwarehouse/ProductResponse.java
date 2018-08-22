package com.example.sccwarehouse;

/**
 * @author Eddú Meléndez
 */
public class ProductResponse {

	private Long id;

	private String name;

	private String sku;

	private String status;

	private String price;

	public ProductResponse() {
	}

	public ProductResponse(Long id, String name, String sku, String status, String price) {
		this.id = id;
		this.name = name;
		this.sku = sku;
		this.status = status;
		this.price = price;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
