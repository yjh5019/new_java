import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); //  �����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement(); //  �������� �����ϱ����� statment ��ü ���� �� ���� ����
		kp37_stmt.execute("DROP TABLE grades;");
		// ���� ���̺� �����
		kp37_stmt.execute("CREATE TABLE grades (" +
				"student_id INT NOT NULL PRIMARY KEY , " + // �����������ȣ 0
                "name VARCHAR(50) NOT NULL, " + // ������� 1
                "kor INT, " + // ���������θ��ּ� 4
                "eng INT, " + // �����������ּ�  5
                "mat INT " + // ������ȹ��  6
                ") DEFAULT CHARSET=utf8" //  utf 8�� ��ȯ
        );
		
		
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�;
	}

}




