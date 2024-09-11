package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertintoDataBase {

	public static void main(String[] args) throws Throwable {
		//step1:Register/load mysql database
		Driver driverref = new Driver();
		
		//DriverManager.registerDriver(driverref);
		
		//step2:get the connection of database
		
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium", "root", "root");
		
		
		//step3:create a SWL statement
		Statement state = conn.createStatement();
		String query = "insert into selenium(id,first_name,last_name,address)values('3','disha','s','banglr')";
	
	    int result = state.executeUpdate(query);
	    
	    if(result==1) {
	    	System.out.println("data is added");
	    }
	    
	    else {
	    	System.out.println("data is not added");
	    }
	
	      conn.close();
	}
	

}
