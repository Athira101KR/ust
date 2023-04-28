package exam;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of mobiles:");
		int n=sc.nextInt();
		String detail=sc.nextLine();
		if(detail.equals(""))
			detail=sc.nextLine();
		Mobile mob=mob.createMobile(detail);
		
		int choice;
		do
		{
			System.out.println("Enter a search type:\r\n"
					+ "1.By Model Name\r\n"
					+ "2.By Display Size");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
						System.out.println("Enter the Model Name:");
						String name=sc.nextLine();
						if(name.equals(""))
							name=sc.nextLine();
						MobileBO mbo=new MobileBO();
						mbo.findMobile(detail, name);
						break;
						
				case 2:
						System.out.println("Enter the Display Size:");
						Double size=sc.nextDouble();
						mbo.findMobile(detail, size);
						break;
						
				default : System.out.println("Invalis choice");
								
			}
		}while(choice<2);

	}

}
