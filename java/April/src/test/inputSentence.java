package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class inputSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String ar="This sentence is types by me. You are going to work on this";
		
//		char[] charArray=ar.toCharArray();
//		
//		for(int i=0;i<charArray.length;i++)
//		{
//			System.out.println(charArray[i]);
//		}
		
		List<String> li=Arrays.asList("This","sentence","is","types","by","me","You","are","going","to","work","on","this");
		li= li.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		Map<Character, Long> charFrequency = li.stream()
        .flatMapToInt(String::chars) //IntStream
        .mapToObj(c -> (char) c)     //Stream<Character>
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		System.out.println(charFrequency);
	}

}
