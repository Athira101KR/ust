package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li=Arrays.asList(10,12,14,20,15,100,88,90);
		System.out.println(li);
		List<Integer> newLi=li.stream().filter(a->a>80).sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println(newLi);		
	}

}
