import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	private String name;
	private String email;
	private String phoneNumber;
	private String location;
	private List<Purchase> purchaseList;

	public User(){}

	public User(String name, String email, String phoneNumber, String location, List<Purchase> purchaseList) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.purchaseList = purchaseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Purchase> getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(List<Purchase> purchaseList) {
		this.purchaseList = purchaseList;
	}
	
	public static List<User> prefill(){
		List<User> userList=new ArrayList<>();
		userList.add(new User("Harry","harry@gmail.com","9856231478","NewYork", new ArrayList<Purchase>()));
		userList.add(new User("Joe","joe@gmail.com","8956231548","Chicago", new ArrayList<Purchase>()));
		userList.add(new User("Oliver","oliver@gmail.com","7856124589","SanFrancisco", new ArrayList<Purchase>()));
		userList.add(new User("Danny","danny@gmail.com","9382714568","Los Angeles", new ArrayList<Purchase>()));
		userList.add(new User("Brandon","brandon@gmail.com","98596215488","Boston", new ArrayList<Purchase>()));
		userList.add(new User("Rob","rob@gmail.com","9584596662","NewYork", new ArrayList<Purchase>()));
		return userList;
		}
//	static User getValuableUser(List<User> userList,String month)
//	{
//		Purchase purchase=new Purchase();
//		SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy");
//		
//		Date purchaseDate=purchase.getPurchaseDate();		
//		String newDate=sdf.format(purchaseDate);
//		
//		String str[] = newDate.split("-");
//		String getMonth = str[1];
//		User user=new User();
//		
//		User valuableUser = null;
//		for(User ur:userList)
//		{ 
//			Double maxPrice=0.0;			
//			Double price=0.0;
//			valuableUser=null;
//			if(getMonth.equals(month))
//			{
//				String name=ur.getName();
//				 price=price+purchase.getPrice();
//				 if(price>maxPrice)
//				 {
//					 maxPrice=price;
//					 valuableUser = user;
//				 }
//			}
//		}
//		return valuableUser;
		
static User getValuableUser(List<User>userList,String month) {
	Double curramount=0.0;
	Double maxamount=0.0;
	User maxuser=null;
	SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
	for(User curruser:userList) 
	{
		for(Purchase purchase:curruser.purchaseList) 
		{
			String currMonth=sdf.format(purchase.getPurchaseDate());
			if(currMonth.equals(month)) 
			{
				curramount+=purchase.getPrice();
			}
		}
			if(curramount>maxamount) 
			{
				maxamount=curramount;
				maxuser=curruser;
			}
					curramount=0.0;
	}
				return maxuser;
 }
	
}
//date.getDayOfMonth()