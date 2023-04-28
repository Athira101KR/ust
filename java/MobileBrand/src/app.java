import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Mobile Brand:");
		String name=sc.nextLine();
		
		int choice;
		do
		{
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			System.out.println("1.Add Mobile\r\n"
					+ "\r\n"
					+ "2.Delete Mobile\r\n"
					+ "\r\n"
					+ "3.Display Mobiles\r\n"
					+ "\r\n"
					+ "4.Exit");
			
		}while(choice<4);

	}

}
