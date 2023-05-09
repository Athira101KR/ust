import java.util.Scanner;

public class triangular_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			sum=sum+i;
			if(sum==n)
			{
				System.out.println("True\n"+i);
				break;
			}
			else if(sum>n)
			{
				System.out.println("false"+"\n"+(i-1)+" "+i);
				break;
			}
			else
			{
				continue;
			}
		}
	}

}
