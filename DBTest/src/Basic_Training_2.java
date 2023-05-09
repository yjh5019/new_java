import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
//		stmt.execute("DROP TABLE scoreTable;");
		
		stmt.execute("CREATE TABLE scoreTable (" +
				"student_id INT NOT NULL PRIMARY KEY , " + // 주차장관리번호 0
                "name VARCHAR(50) NOT NULL, " + // 주차장명 1
                "korean_score INT, " + // 소재지도로명주소 4
                "english_score INT, " + // 소재지지번주소  5
                "math_score INT " + // 주차구획수  6
                ") DEFAULT CHARSET=utf8"
        );
		
		
		stmt.close();
		conn.close();
	}

}




