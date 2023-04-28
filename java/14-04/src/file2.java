import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:/Users/248761/Desktop/training/java/14-04/src/news.txt");
		Date dt=new Date(f.lastModified());
		System.out.println("Folder modified");
		String[] str=f.list();
		for(String s:str)
			System.out.println(s);
	}

}
