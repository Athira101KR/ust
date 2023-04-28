import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class mobileBrand {
	private String name;
	private List<Mobile> mobileList;
	public mobileBrand() {
		// TODO Auto-generated constructor stub
		mobileList=new ArrayList<Mobile>();
	}
	public mobileBrand(String name, List<Mobile> mobileList) {
		this();
		this.name = name;
		this.mobileList = mobileList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
//adding	
	public void addMobileToMobileBrand(Mobile mobile)
	{
		mobileList.add(mobile);
	}
//removing	
	public Boolean removeMobileFromMobileBrand(String referenceId)
	{
		for(Mobile m:mobileList)
		{
			if(m.getReferenceId().equals(referenceId))
			{
				return mobileList.remove(referenceId);
			}
		}
		return false;
	}
//display	
	public void displayMobiles()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		for(int i=0;i<mobileList.size();i++)
		{
			Mobile m=mobileList.get(i);
			System.out.format("%-15s %-15s %-12s %-8s %s\n",m.getReferenceId(),m.getModelName() ,m.getDisplaySize(),m.getPrice(),sdf.format(m.getLaunchedDate()));
		}
	}
}


