import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class app {

	public static void main(String[] args) {
		
		List<Prodcut> al=new ArrayList<Prodcut>();
		// TODO Auto-generated method stub
			al.add(new Prodcut("12", "abc", 20, "boook"));
			al.add(new Prodcut("5", "jkl", 70, "drinks"));
			al.add(new Prodcut("21", "sdf", 45, "snacks"));
			
			Collections.sort(al);
			
			for(Prodcut p:al)
			{
				System.out.println(p);
			}
	}

}
