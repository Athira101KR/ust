import java.util.Date;

public class Call {
	private String type;
	private String callType;
	private double cost;
	private Date durattion;
	private Date date;
	private Contact contact;
	
	public Call(){}

	public Call(String type, String callType, double cost, Date durattion, Date date, Contact contact) {
		super();
		this.type = type;
		this.callType = callType;
		this.cost = cost;
		this.durattion = durattion;
		this.date = date;
		this.contact = contact;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Date getDurattion() {
		return durattion;
	}

	public void setDurattion(Date durattion) {
		this.durattion = durattion;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
}
