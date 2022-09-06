package hibernate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@ToString
@Setter
@Entity
public class Product {
	public Product(int i, String string, String string2, String string3, int j, boolean b) {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String manufacturer, String description, float price, boolean instock) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.instock = instock;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", description="
				+ description + ", price=" + price + ", instock=" + instock + "]";
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String manufacturer;
private String description;
private float price;
private boolean instock;


}