package exam;

import java.util.ArrayList;
import java.util.List;

public class MobileBO {
	private List<Mobile> mobileList;
	
	public MobileBO()
	{
		mobileList=new ArrayList<Mobile>();
	}
	
	
	
	public MobileBO(List<Mobile> mobileList) {
		super();
		this.mobileList = mobileList;
	}



	public List<Mobile> findMobile(List<Mobile> mobileList,String modelName)
	{
		for(Mobile mob:mobileList)
		{
			if(mob.getModelName().equals(modelName))
			{	
			     System.out.format("%-15s %-15s %-12s %-8s %s\n"+mob.getReferenceId(),mob.getModelName(),mob.getDisplaySize(),mob.getPrice(),mob.getLaunchedDate());	 
				 break;
			}
			
		}
		return null;
		
	}
	
	public List<Mobile> findMobile(List<Mobile> mobileList,Double displaySize)
	{
		for(Mobile mob:mobileList)
		{
			if(mob.getDisplaySize().equals(displaySize))
			{
				 System.out.format("%-15s %-15s %-12s %-8s %s\n"+mob.getReferenceId(),mob.getModelName(),mob.getDisplaySize(),mob.getPrice(),mob.getLaunchedDate());
			}
			
		}
		return null;
	}
}
