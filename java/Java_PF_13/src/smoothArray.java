import java.util.Arrays;
import java.util.Scanner;

public class smoothArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mid1=0,mid2=0,mid=0,first=0,last=0,midl=0;
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		if(size%2==0)
		{
			mid1=size/2;
			mid2=mid1-1;
		}
		else
			mid=(int) size/2;
		for(int i=0;i<=size;i++)
		{
			first=arr[0];
			last=arr[size-1];
			midl=arr[mid1]+arr[mid2];

		}
		//System.out.println(first);System.out.println(midl);System.out.println(last);
		if(first==last && last==midl)
		{
			System.out.print(first);
			System.out.print(midl);
			System.out.println(last);
			System.out.println("True");
		}
		else
		{	System.out.print(first);
			System.out.print(midl);
			System.out.println(last);
			System.out.println("False");
		}
	}

}
