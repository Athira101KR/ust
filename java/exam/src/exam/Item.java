package exam;

public class Item implements Comparable{
	private String name;
	private Double price;
	private String type;
	
	public Item() {}

	public Item(String name, Double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	static Item createItem(String detail)
	{
		Item item=new Item();
		String[] arr=detail.split(",");
		item.setName(arr[0]);
		item.setPrice(Double.parseDouble(arr[1]));
		item.setType(arr[2]);
		
		return item;
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.getName().equals(((Item) o).getName()));
			return item;
	}
}
