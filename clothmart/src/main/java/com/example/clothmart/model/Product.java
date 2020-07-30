package com.example.clothmart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class  Product {

	private long productid;
	private String productName;
	private float price;
	private String photo;

	public Product() {
		
	}
	
	public Product(String productName, float price, String photo) {
		this.productName =productName;
		this.price = price;
		this.photo = photo;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}
	
	@Column(name = "product_name", nullable = false)
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Column(name = "price", nullable = false)
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	@Column(name = "photo", nullable = false)
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "Product [prodcutId=" + productid + ", prodcutName=" + productName + ", Price=" + price + ", Photo=" + photo
				+ "]";
	}
	
}
