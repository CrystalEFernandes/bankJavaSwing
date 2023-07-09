package javaprojectbank;
import java.sql.*;

public class Conn {

	Connection Con = null;
	Statement St = null;
	ResultSet Rs=null;
	PreparedStatement pst=null;
	public Conn() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root"," ");
			St = Con.createStatement();
		
			}catch(Exception e) {
					System.out.println(e.getMessage());
				}

}
}
