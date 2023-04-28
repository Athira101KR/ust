import java.util.Scanner;

public class Masked_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int y=sc.nextInt();
		int isFirst=0;
		for(int i=0;i<10;i++)
		{
			//System.out.println(input.charAt(0)+""+i+input.charAt(2));
			int z=Integer.parseInt(input.charAt(0)+""+i+input.charAt(2));
			if(z%6==0) {
				System.out.print(z);
				if(isFirst!=0)
					System.out.print(",");
				else
					isFirst=1;
			}
		}

	}

}
