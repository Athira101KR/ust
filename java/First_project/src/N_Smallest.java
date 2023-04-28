import java.util.Arrays;
import java.util.Scanner;

public class N_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] array=new int[size];
		int n=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}

		int[] copy=array.clone();
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(copy));
		for(int i=0;i<n;i++)
		{
			//System.out.println(array.toString());
			array[i]=sc.nextInt();
		}

	}

}
