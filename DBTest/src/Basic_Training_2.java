import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
//		stmt.execute("DROP TABLE grades;");
		
		stmt.execute("CREATE TABLE grades (" +
				"student_id INT NOT NULL PRIMARY KEY , " + // �����������ȣ 0
                "name VARCHAR(50) NOT NULL, " + // ������� 1
                "kor INT, " + // ���������θ��ּ� 4
                "eng INT, " + // �����������ּ�  5
                "mat INT " + // ������ȹ��  6
                ") DEFAULT CHARSET=utf8"
        );
		
		
		stmt.close();
		conn.close();
	}

}




