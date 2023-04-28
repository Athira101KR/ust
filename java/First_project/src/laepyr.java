import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiSliderUI;

public class laepyr {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entrr yr");
		Integer date=sc.nextInt();
		GregorianCalendar gc=new GregorianCalendar();
		if(gc.isLeapYear(date))
			System.out.println("leap year");
		else
			System.out.println("not leap year");
	}

}
