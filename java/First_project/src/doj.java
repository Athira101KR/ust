import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class doj {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entr date in dd/mm/yyyy");
		String ip=sc.nextLine();
		Date doj=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd/mm/yyyy");
		sf.setLenient(false);
		doj=sf.parse(ip);
		System.out.println(doj);
		System.out.println(sf.format(doj));

	}

}
