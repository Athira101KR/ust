import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class app2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st mobile details:");
		String details1=sc.nextLine();
		System.out.println("Enter 2nd mobile details:");
		String details2=sc.nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		String[] array1=details1.split(",");
		
		MobileClass mc1=new MobileClass();
		
		mc1.setReferenceId(array1[0]);
		mc1.setModelName(array1[1]);
		mc1.setDisplaySize(Double.valueOf(array1[2]));
		mc1.setPrice(Double.valueOf(array1[3]));
		mc1.setLaunchedDate(sdf.parse(array1[4]));
		

		String[] arr2 = details2.split(",");
		MobileClass mc2=new MobileClass();
		mc2.setReferenceId(array1[0]);
		mc2.setModelName(array1[1]);
		mc2.setDisplaySize(Double.valueOf(array1[2]));
		mc2.setPrice(Double.valueOf(array1[3]));
		mc2.setLaunchedDate(sdf.parse(array1[4]));
		
		System.out.println("Mobile 1:");
		System.out.println(mc1);
		System.out.println();
		System.out.println("Mobile 2:");
		System.out.println(mc2);
		
//		System.out.println(college1.equals(college2));
		System.out.println((mc1.equals(mc2))?"Mobile 1 is same as Mobile 2 ":"Mobile 1 and Mobile 2 are different");
		
	}

}
