import java.util.Scanner;

public class mathHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a<b)
			System.out.println("Fraction");
		else
		{
			if(a%b==0)
				System.out.println(a/b);
			else
			{
				int rem=a%b;
				System.out.println((int)a/b+" "+rem+"/"+b);
				
			}
		}

	}

}
