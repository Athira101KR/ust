
public class Employee_Constructor {
	
	private Integer id;
	private String name;
	private Float marks;

	public Employee_Constructor() {
		super();
	}
	

	public Employee_Constructor(Integer id, String name, Float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Float getMarks() {
		return marks;
	}


	public void setMarks(Float marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Employee_Constructor [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
