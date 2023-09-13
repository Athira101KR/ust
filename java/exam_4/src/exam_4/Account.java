package exam_4;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int id;
	private String name;
	private String accountNumber;
	private long bal;
	private static  List<Account> account=new ArrayList<>();
	public Account() {}
	
	public Account(int id,String name, String accountNumber, long bal) {
		super();
		this.id=id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.bal = bal;
	}

	public int getId()
	{
		return id;
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBal() {
		return bal;
	}

	public void setBal(long bal) {
		this.bal = bal;
	}

//////////////
	public static List<Account> createUser(String details)
	{
		
		String[] array=details.split(" ,");
		Account ac=new Account();
		ac.setName(array[0]);
		ac.setAccountNumber(array[1]);
		ac.setBal(Long.parseLong(array[1]));
		
		account.add(ac);
		return account;
	}
//////////

	@Override
	public String toString() {
		return "Account Id="+id+"\nAccount holder Name=" + name + "\n accountNumber=" + accountNumber + "\n bal=" + bal + "";
	}
//////////
	
	public static String update(int id,String name)
	{
		Account acn = null;
		if(id==acn.getId())
		{
			acn.setName(name);
		}
		else
		{
			System.out.println("Id is not found");
		}
		return "Account holder name="+acn.getName()+"\n accountNumber= "+acn.getAccountNumber()+"\n bal="+acn.getBal()+"";
	}
//////////
	public static void delete(int id)
	{
		Account acn=null;
		if(id==acn.getId())
		{
			account.remove(acn);
		}
		else
		{
			System.out.println("Id is not found");
		}
	}
}
