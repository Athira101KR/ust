import java.util.Scanner;

public class matrix_differnece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][] array=new int[n][n];
		int sumOfDiag=0,sumOfRest=0,diff=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==j) || (i==0 && j==n-1) || (i==n-1 && j==0))
				{
					sumOfDiag=sumOfDiag+array[i][j];
					//System.out.println(array[i][j]);
				}
				else
				{
					sumOfRest=sumOfRest+array[i][j];
				}
			}
		}
		
		System.out.println(sumOfDiag+" "+sumOfRest);
	}

}
