package p1;

import java.sql.*;

public class Connect {

	public static void main(String[] args){
		Connect.getCon();
	}
	
	public static Connection getCon(){
		
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jee","jeepass");
			System.out.println("Connect with Database Server Successfully");
		}catch(Exception e){
			System.out.println(e);
		}
		return conn;
		
	}
}
