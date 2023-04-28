import java.util.Scanner;

public class bookShelf extends Furniture {
	private int noOfShelves;
	
	public bookShelf() {}
	
	public bookShelf(int noOfShelves)
	{	
		super();
		this.noOfShelves=noOfShelves;
	}

	public int getNoOfShelves() {
		return noOfShelves;
	}

	public void setNoOfShelves(int noOfShelves) {
		this.noOfShelves = noOfShelves;
	}
	
	public void acceptDetails()
	{
		super.acceptDetails();
		System.out.println("Enter Number of shelves");
		Scanner sc=new Scanner(System.in);
		noOfShelves=sc.nextInt();

		}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of shelves: "+noOfShelves);
	}
}
