package com.ar.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<User> uList=User.prefill();
		List<Course> cList=Course.prefill();
		
		List<UserScore> ul=new ArrayList<>();
		
		System.out.println("Enter the number of user scores:");
		int noOfUserScores=sc.nextInt();
		for(int i=0;i<noOfUserScores;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] array=detail.split(",");
			
			Double completionPercentage=Double.parseDouble(array[0]);
			String uname=array[1];
			User user=null;
			
			for(User u:uList)
			{
				if(u.getName().equals(uname))
					user=u;
			}
			String courseName=array[2];
			Course course=null;
			for(Course c:cList)
			{
				if(c.getName().equals(courseName))
					course=c;
			}
			UserScore userScore=new UserScore();
			userScore.setCompletionPercentage(completionPercentage);
			userScore.setUser(user);
			userScore.setCourse(course);
			ul.add(userScore);
		}
		Map<String, UserScore> result = UserScore.getTopPerformer(ul);
		System.out.format("%-15s %s\n","Course","Top performer");
		for(Entry<String,UserScore> e:result.entrySet())
		{
			System.out.format("%-15s %s\n",e.getKey(),e.getValue().getUser().getName());
		}
	}

}
