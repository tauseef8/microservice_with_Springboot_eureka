package com.tk.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Tauseef.Khan
 *
 */
@Repository
public class StubProductRepository implements ProductRepository {
	
	private Map<String, Product> productsByName = new HashMap<String, Product>();
	
	public StubProductRepository() {
		Product product = new Product(500.00, "JNJ" , "Baby-oil");
		productsByName.put("Baby-oil", product);
		product = new Product(600.50, "JNJ" , "Baby-lotion");
		productsByName.put("Baby-lotion", product);
		product = new Product(254.50, "JNJ" , "Gluco-meter");
		productsByName.put("Gluco-meter", product);
		product = new Product(600.50, "JNJ" , "Baby-shampoo");
		productsByName.put("Baby-shampoo", product);
		
		Logger.getLogger(StubProductRepository.class).info("Created StubProductRepository");
	}
	
	@Override
	public List<Product> getAllProducts() {
		return new ArrayList<Product>(productsByName.values());
	}

	@Override
	public Product getProduct(String name) {
		return productsByName.get(name);
	}

}
