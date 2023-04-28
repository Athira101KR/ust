package challenge1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String inp=sc.nextLine();
		
		LinkedHashMap<Character,String> lhm=new LinkedHashMap<>();
		
		for(char x:inp.toCharArray())
		{
			String count=lhm.get(x);
			if(count==null)
			//	count=0;
		//	count++;
			lhm.put(x, count);
			
			
		}
		for(Entry<Character, String> e:lhm.entrySet())
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}

	}

}
