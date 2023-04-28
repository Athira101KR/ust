import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class College implements Comparable<College>{
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;
	
	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Integer getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	
	@Override
	public String toString() {
		return ;
	}

	public static College createCollege(String detail) throws Exception
		{

		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			College college=new College();
			String[] array=detail.split(",");
			
			college.setName(array[0]);
			college.setWebsite(array[1]);
			college.setMobile(array[2]);
			college.setFounder(array[3]);
			college.setNumberOfDept(Integer.parseInt(array[4]));
			college.setLocation(array[5]);
			college.setStartingDate(sdf.parse(array[6]));
			return college;
			
		}


	@Override
	public int compareTo(College arg0) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(this.getName());
	}
	
//	public int compareTo(College o) {
//		// TODO Auto-generated method stub
//		return this.getName().compareTo(o.getName());
//	}
}
