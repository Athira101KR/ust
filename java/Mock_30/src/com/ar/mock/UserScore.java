package com.ar.mock;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserScore {
	private Double completionPercentage;
	private User user;
	private Course course;
	
	public UserScore() {}

	public UserScore(Double completionPercentage, User user, Course course) {
		super();
		this.completionPercentage = completionPercentage;
		this.user = user;
		this.course = course;
	}

	public Double getCompletionPercentage() {
		return completionPercentage;
	}

	public void setCompletionPercentage(Double completionPercentage) {
		this.completionPercentage = completionPercentage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public static Map<String,UserScore> getTopPerformer(List<UserScore> scoreList)
	{
		Map<String,UserScore> umap=new TreeMap<String,UserScore>();
		for(UserScore sl:scoreList)
		{
			Course c=sl.getCourse();
			String cname=c.getName();
			UserScore value=umap.get(cname);
			if(value!=null)
			{
				if(sl.getCompletionPercentage()>value.getCompletionPercentage())
					umap.put(cname, sl);
			}
			else
			{
				umap.put(cname,sl);
			}
		}
		return umap;
	}
}
