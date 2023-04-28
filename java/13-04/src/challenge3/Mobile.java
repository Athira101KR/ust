package challenge3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import challenge2.College;

public class Mobile {
	private String referenceId,modelName;
	private Double displaySize,price;
	private Date launchedDate;
	
	public Mobile() {}

	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	
	public static Mobile createMobile(String detail) throws ParseException
	{
		Mobile mobile=new Mobile();
		String[] arr=detail.split("");
		mobile.setReferenceId(arr[0]);
		mobile.setModelName(arr[1]);
		mobile.setDisplaySize(Double.parseDouble(arr[2]));	//double to string
		mobile.setPrice(Double.parseDouble(arr[3]));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
		mobile.setLaunchedDate(sdf.parse(arr[4]));
		return mobile;
	}
	
	public static Map<Date,Integer> yearWiseCount(List<Mobile> mobileList) throws ParseException
	{
		Map<Date, Integer> map=new TreeMap<>();
		for(Mobile mobile:mobileList)
		{
			//sdf:  refer code
			Date dt=mobile.getLaunchedDate();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
			String year=sdf.format(dt);
			Date date=sdf.parse(year);

			Integer value=map.get(date);
			if(value==null)
				value=0;
			value++;
			map.put(date, value);
		}
		return map;
	}
}


