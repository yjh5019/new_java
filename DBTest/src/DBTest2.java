import java.io.UnsupportedEncodingException;
import java.sql.*;
public class DBTest2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		
		ResultSet rset = stmt.executeQuery("select * from examtable;");
		System.out.printf("  이름  학번   국어  영어  수학\n");
		while(rset.next()) {
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n",
								rset.getString(1), rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
		}
		rset.close();
		stmt.close();
		conn.close();
	}

}
