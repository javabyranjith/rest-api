package jbr.jersey.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product implements Serializable {
  private static final long serialVersionUID = 1L;
  private int id;
  private String name;
  private String type;

  public Product() {

  }

  public Product(int id, String name, String type) {
    this.id = id;
    this.name = name;
    this.type = type;
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

  public String getType() {
    return type;
  }

  @XmlElement
  public void setType(String type) {
    this.type = type;
  }

}
