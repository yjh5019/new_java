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
		Class.forName("com.mysql.cj.jdbc.Driver");// ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");// �����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();// ���� ������ ���� Statement ��ü ����
		
		ResultSet kp37_rset = kp37_stmt.executeQuery("show databases;"); //  ���� ���� ����� ���� �����ͺ��̽� ��ȸ
		
		while(kp37_rset.next()) {
			System.out.println("�� : " + kp37_rset.getString(1)); //  �ش� ���̺��� ù��° ���� reset�� ���� ������ �����
		}
		// ���� ������ ������ ���� ���ɼ��� �ֱ� ������ �ݴ´�
		kp37_rset.close();// ResultSet ��ü �ݱ�
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close();//�����ͺ��̽� �ݱ�
		
		
		

	}

}
