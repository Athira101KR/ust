package ab.cd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class app1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ust","","");
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery("SELECT * FROM BRANCH");
	        while(rs.next())
	        {
	        	System.out.printf("%-8s\n%-25s%-20s",rs.getString(1),rs.getString(2),rs.getString(3));
	        }
	        con.close();

	}

}
