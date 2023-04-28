package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String detail=sc.nextLine();
		String[] arr=detail.split(",");
		
		Employee emp=new Employee();
		emp.setId(Integer.parseInt(arr[0]));
		emp.setFirstName(arr[1]);
		emp.setLastName(arr[2]);
		emp.setLocation(arr[3]);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Athira.dat"));
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		System.out.println("Done");
	}

}
