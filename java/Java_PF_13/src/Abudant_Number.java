import java.util.Scanner;

public class Abudant_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int set=0;
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int last=sc.nextInt();
		for(int i=1;i<last;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum>i)
			{
				System.out.print(i+",");
				set=1;
			}
		}
		
	}

}
