package com.example.sccwarehouse;

import java.util.Arrays;
import java.util.List;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

/**
 * @author Eddú Meléndez
 */
public class BaseContractTest {

	@Before
	public void setup() {
		List<ProductResponse> products = Arrays.asList(
				new ProductResponse(1L, "Hulk Pop", "FU32690", "Coming in September 2018", "$ 10.99"),
				new ProductResponse(2L, "Groot with Stormbreaker Pop", "FU35773", "Coming in December 2018", "$ 10.99"),
				new ProductResponse(3L, "Bucky with weapon", "FU35775", "Coming in December 2018", "$ 10.99"));
		ProductListResponse listOfProducts = new ProductListResponse();
		listOfProducts.setProducts(products);

		ProductService productService = mock(ProductService.class);
		given(productService.fetchProducts()).willReturn(listOfProducts);

		RestAssuredMockMvc.standaloneSetup(new ProductController(productService));
	}

}
