package entities;
// Generated Mar 6, 2019 1:15:47 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product", catalog = "demo")
public class Product implements java.io.Serializable {

	private Integer id;
	private Category category;
	private String prodname;
	private byte quantity;
	private String photo;
	private String describation;
	private double price;
	private boolean featured;
	private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);

	public Product() {
	}

	public Product(Category category, String prodname, byte quantity, String photo, String describation, double price,
			boolean featured) {
		this.category = category;
		this.prodname = prodname;
		this.quantity = quantity;
		this.photo = photo;
		this.describation = describation;
		this.price = price;
		this.featured = featured;
	}

	public Product(Category category, String prodname, byte quantity, String photo, String describation, double price,
			boolean featured, Set<Orderdetail> orderdetails) {
		this.category = category;
		this.prodname = prodname;
		this.quantity = quantity;
		this.photo = photo;
		this.describation = describation;
		this.price = price;
		this.featured = featured;
		this.orderdetails = orderdetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryid", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "prodname", nullable = false)
	public String getProdname() {
		return this.prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	@Column(name = "quantity", nullable = false)
	public byte getQuantity() {
		return this.quantity;
	}

	public void setQuantity(byte quantity) {
		this.quantity = quantity;
	}

	@Column(name = "photo", nullable = false)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "describation", nullable = false)
	public String getDescribation() {
		return this.describation;
	}

	public void setDescribation(String describation) {
		this.describation = describation;
	}

	@Column(name = "price", nullable = false, precision = 10)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "featured", nullable = false)
	public boolean isFeatured() {
		return this.featured;
	}

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

}
