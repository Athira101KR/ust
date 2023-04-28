import java.util.Scanner;

public class Last_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Scanner sc2=new Scanner(System.in);
		int size=sc.nextInt();
		char[] array=new char[size];
		char max='\0';
		
	//array input
		for(int i=0;i<size;i++)
		{
			array[i]=sc.next().charAt(0);
		}
		
		int n=sc.nextInt();
		
		
		for(int i=0;i<size;i++)
		{
			int count=	0;
			for(int j=0;j<size;j++)
			{
				//System.out.println("i : "+array[i]+" j= "+array[j]);
				if(array[i]==array[j])
				{	
					count++;
				}
				
			}
			if(count==n)
			{
				max=array[i];
			}
			
			
		}
		if(max!='\0')
			System.out.println(max);
		else
		{
			System.out.println(-1);
			//System.exit(0);
		}
}}
