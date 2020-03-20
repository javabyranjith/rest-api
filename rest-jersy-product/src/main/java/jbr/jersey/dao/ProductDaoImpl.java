package jbr.jersey.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jbr.jersey.model.Product;

public class ProductDaoImpl implements ProductDao {

  @Override
  public List<Product> getAllProducts() {
    return Stream.of(new Product(1, "Mobile", "Electronics"), new Product(2, "Heater", "Electrical"))
        .collect(Collectors.toList());
  }

  @Override
  public Product getProductById(int id) {
    return null;
  }

  @Override
  public Product getProductByName(String name) {
    return null;
  }

  @Override
  public Product getProductByCategory(int category) {
    return null;
  }

}
