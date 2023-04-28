import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hasgMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> country=new HashMap<>();
		country.put(1,"India");
		country.put(2,"Paris");		
		country.put(3,"USA");		
		country.put(4,"UK");
		
		Set<Entry<Integer,String>> entries=country.entrySet();
		
		for(Entry<Integer,String> entry:entries)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		System.out.println(country);
		
		for(Entry<Integer,String> e:country.entrySet())
		{
			System.out.println(e);
		}
	}

}
