package challenge1;

import java.util.HashSet;


public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("India");
		hashSet.add("US");
		hashSet.add("India");
		hashSet.add("Korea");
		hashSet.add("China");
		hashSet.add("Korea");

		System.out.println(hashSet);
	}

}
