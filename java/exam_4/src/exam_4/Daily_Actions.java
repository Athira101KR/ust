package exam_4;

import java.util.Scanner;

public class Daily_Actions {
	private static Account acn;
	private long deposit;
	private long withdrawal;
	
	public static Scanner sc=new Scanner(System.in);
	
	public Daily_Actions() {}

	public Daily_Actions(Account acn, long deposit, long withdrawal) {
		super();
		this.acn = acn;
		this.deposit = deposit;
		this.withdrawal = withdrawal;
	}

	public Account getAcn() {
		return acn;
	}

	public void setAcn(Account acn) {
		this.acn = acn;
	}

	public long getDeposit() {
		return deposit;
	}

	public void setDeposit(long deposit) {
		this.deposit = deposit;
	}

	public long getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(long withdrawal) {
		this.withdrawal = withdrawal;
	}
	
	static long balanceEnquiry(int id)
	{
		long bal=(acn.getBal()+deposit())-withdrawal();
		acn.setBal(bal);
		return bal;
	}

	private static long withdrawal() {
		System.out.println("enter the amount to withdraw:");
		int withdraw=sc.nextInt();
		long bal=acn.getBal()-withdraw;
		acn.setBal(bal);
		return bal;
	}

	private static long deposit() {
		System.out.println("enter the amount to deposit:");
		int deposit=sc.nextInt();
		long bal=acn.getBal()+deposit;
		acn.setBal(bal);
		return bal;
	}
	
}
