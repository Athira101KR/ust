import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("C:/Users/248761/Desktop/training/java/14-04/src/news.txt"));
		String str=sc.nextLine();
		System.out.println(str);
		
	}

}
