package BussinessLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	public static Connection connect=null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/phuong_perfume?useUnicode=true&characterEncoding=UTF-8","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connect;
	}
	public static void main(String[] args) {
		Connection connect=CSDL.getConnection();
		
	}
}
