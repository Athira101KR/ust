package exam_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class candy_Crush {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> li=new ArrayList<>();
		li.add(100);
		li.add(56);
		li.add(90);
		li.add(78);
		li.add(80);
		li.add(45);
		li.add(99);
		li.add(85);
		li.add(89);
		li.add(91);
		
		int c=1;		
		do
		{
			Collections.sort(li,Collections.reverseOrder());
			Object[] array=li.toArray();
			System.out.println("LeaderBoard:");
			for(int i=0;i<10;i++)
			{
				System.out.println(i+1+"."+array[i]);
			}
			
			System.out.println("Wants to enter new score? (Yes=1, No=0)");
			c=sc.nextInt();
			if(c==1)
			{
				System.out.println("enter new score:");
				int score=sc.nextInt();
				li.add(score);
			}
		}while(c==1);
	}

}
