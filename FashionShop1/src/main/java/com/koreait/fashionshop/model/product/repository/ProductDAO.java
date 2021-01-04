package com.koreait.fashionshop.model.product.repository;

import java.util.List;

import com.koreait.fashionshop.model.domain.Product;

public interface ProductDAO {
	public List selectAll();//모든 상품
	public List selectByID(int subcategory_id);
	public Product select(int product_id);
	public void insert(Product product);
	public void update(Product product);
	public void delete(int product_id);
}