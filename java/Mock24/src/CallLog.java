import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CallLog {

	private List<Call> callList;
	
	public CallLog(){
		this.callList=new ArrayList<>();
	}

	public CallLog(List<Call> callList) {
		super();
		this.callList = callList;
	}

	public List<Call> getCallList() {
		return callList;
	}

	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}
	
	Contact getFavouriteContact()
	{
		
		Map<Contact,Integer> map=new LinkedHashMap<Contact,Integer>();
		for(Call c:callList)
		{
			Contact contact= c.getContact();
			Integer count=map.get(contact);
			if(count==null)
				count=0;
			count++;
			map.put(contact, count);
		}
		int max=0;
		Contact maxContact=null;
		for(Entry<Contact,Integer>e:map.entrySet())
		{
			int count=e.getValue();
			if(count>max)
			{
				max=count;
				maxContact=e.getKey();
			}
		}
		
		return maxContact;
		
	}

}
