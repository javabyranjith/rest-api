package jbr.jersey.dao;

import java.util.List;

import jbr.jersey.model.Product;

public interface ProductDao {

  List<Product> getAllProducts();
  
  Product getProductById(int id);
  
  Product getProductByName(String name);
  
  Product getProductByCategory(int category);
}
