import java.util.Scanner;

public class Historical_era {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int check=year/100;
		
		if(check<=2)
		{
			System.out.println(check+1+"\nPrehistorical period");
		}
		else if(check<=6)
		{
			System.out.println(check+1+"\nVedic Period");
		}
		else if(check<=13)
		{
			System.out.println(check+1+"\nSecond Urbanisation");
		}
		else if(check<=18)
		{
			System.out.println(check+1+"\nEarly Modern Period");
		}
		else
		{
			System.out.println(check+1+"\nModern period");
		}
		

	}

}
