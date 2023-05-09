package com.ar.mock;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String Name;
	private String Category;
	private Double Price;
	private List<UserScore> userScoreList;
	
	public Course() {}

	public Course(String name, String category, Double price, List<UserScore> userScoreList) {
		super();
		Name = name;
		Category = category;
		Price = price;
		this.userScoreList = userScoreList;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public List<UserScore> getUserScoreList() {
		return userScoreList;
	}

	public void setUserScoreList(List<UserScore> userScoreList) {
		this.userScoreList = userScoreList;
	}
	
	public static List<Course> prefill(){
        List<Course> list = new ArrayList<>();
        list.add(new Course("ANGULAR","Web Development",Double.parseDouble("9360"),new ArrayList<UserScore>()));
        list.add(new Course("Web Developer","Web Development",Double.parseDouble("9600"),new ArrayList<UserScore>()));
        list.add(new Course("JavaScript","Web Development",Double.parseDouble("9699"),new ArrayList<UserScore>()));
        list.add(new Course("HTML CSS","Web Development",Double.parseDouble("9000"),new ArrayList<UserScore>()));
        list.add(new Course("MEAN Stack","Web Development",Double.parseDouble("9599"),new ArrayList<UserScore>()));
        list.add(new Course("C","Programming",Double.parseDouble("5000"),new ArrayList<UserScore>()));
        list.add(new Course("Java","Programming",Double.parseDouble("4999"),new ArrayList<UserScore>()));
        list.add(new Course("Python","Programming",Double.parseDouble("5299"),new ArrayList<UserScore>()));
        list.add(new Course("C Sharp","Programming",Double.parseDouble("4900"),new ArrayList<UserScore>()));
        list.add(new Course("AWS Developer","IT Software",Double.parseDouble("10000"),new ArrayList<UserScore>()));
        list.add(new Course("Ethical Hacking","IT Software",Double.parseDouble("9300"),new ArrayList<UserScore>()));
        list.add(new Course("PhotoShop CS","Design",Double.parseDouble("9299"),new ArrayList<UserScore>()));
        list.add(new Course("TShirt Design","Design",Double.parseDouble("8999"),new ArrayList<UserScore>()));
        list.add(new Course("3D Modelling","Design",Double.parseDouble("11999"),new ArrayList<UserScore>()));
        list.add(new Course("Music Theory","Music",Double.parseDouble("9499"),new ArrayList<UserScore>()));
        list.add(new Course("Learn Guitar","Music",Double.parseDouble("9999"),new ArrayList<UserScore>()));
        list.add(new Course("Become a Singer","Music",Double.parseDouble("7500"),new ArrayList<UserScore>()));
        return list;
    }

	
}
