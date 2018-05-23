package jbr.rest.jersey.sun;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ProductService")
public class ProductService {

	@GET
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	public List<Product> getAllProducts() {
		return Stream.of(new Product(1, "Mobile", "Electronics"), new Product(2, "Heater", "Electrical"),
				new Product(3, "Television", "Electronics")).collect(Collectors.toList());
	}
}
