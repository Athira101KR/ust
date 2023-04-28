import java.util.ArrayList;

public class Prodcut implements Comparable<Prodcut>{
		// TODO Auto-generated method stub
		private String id;
		private String name;
		private int price;
		private String category;
	}
//	
//	
//
	public Prodcut() {
		// TODO Auto-generated constructor stub
	}
//
	public Prodcut(String id,String name,int price,String category) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public int compareTo(Prodcut arg0) {
		// TODO Auto-generated method stub
		return arg0.getId().compareTo(this.getId());
	}
	

	

}
