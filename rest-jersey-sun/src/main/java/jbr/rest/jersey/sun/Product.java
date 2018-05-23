package jbr.rest.jersey.sun;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String category;

	public Product() {

	}

	public Product(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	@XmlElement
	public void setCategory(String category) {
		this.category = category;
	}

}
