//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.*;
//import com.mysql.cj.xdevapi.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		System.out.println("qefqe");
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();
		
		ResultSet rset = stmt.executeQuery("show databases;");
		
		while(rset.next()) {
			System.out.println("°ª : " + rset.getString(1));
		}
		rset.close();
		stmt.close();
		conn.close();
		
		
		

	}

}
