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
				"student_id INT NOT NULL PRIMARY KEY , " + // �����������ȣ 0
                "name VARCHAR(50) NOT NULL, " + // ������� 1
                "korean_score INT, " + // ���������θ��ּ� 4
                "english_score INT, " + // �����������ּ�  5
                "math_score INT " + // ������ȹ��  6
                ") DEFAULT CHARSET=utf8"
        );
		
		
		stmt.close();
		conn.close();
	}

}




