import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dobTask {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entrr date of birth dd/mm/yyyy");
		String date=sc.nextLine();
		Date dob=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd/mm/yyyy");
		dob=sf.parse(date);
		
		SimpleDateFormat sf2=new SimpleDateFormat();
		
	}

}
