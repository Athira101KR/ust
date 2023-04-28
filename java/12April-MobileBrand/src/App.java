import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of mobiles:");
		int numberOfMobiles=sc.nextInt();
		List<Mobile> mobileList=new ArrayList<Mobile>();
		
		for(int i=0;i<numberOfMobiles;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
		}
	}

}
