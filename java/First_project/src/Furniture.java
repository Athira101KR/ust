import java.util.Scanner;

public class Furniture {
	private static String name;
	private static String color;
	
	public Furniture() {}
	
	public Furniture(String name, String color) 
	{
		super();
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void acceptDetails()
	{
		System.out.println("Enter name and color");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		color=sc.nextLine();
		}
	public void displayDetails()
	{
		System.out.println("Name: "+name +"\ncolor: "+color);
	}
	
//	public static void main(String[] args)
//	{
//		Furniture furniture=new Furniture();  
//		furniture.acceptDetails();
//		furniture.displayDetails();
//	}
	
}

