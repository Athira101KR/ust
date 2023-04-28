package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class App2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInput ois=new ObjectInputStream(new FileInputStream("Athira.dat"));
		Employee e=(Employee) ois.readObject();
		
		System.out.println(e);

	}

}
