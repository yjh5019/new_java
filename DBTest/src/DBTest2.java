import java.io.UnsupportedEncodingException;
import java.sql.*;
public class DBTest2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//�����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();	// ���� ������ ���� Statement ��ü ����		
		
		ResultSet kp37_rset = kp37_stmt.executeQuery("select * from examtable;"); //  select �� ���� examtable ���� ������ �����ϱ����� ������ ���
		System.out.printf("  �̸�  �й�   ����  ����  ����\n"); //  ����Ʈ ���
		while(kp37_rset.next()) {
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n", //  reset�� ���� ���� �͵��� getstring�� ���� ������
								kp37_rset.getString(1), kp37_rset.getInt(2),kp37_rset.getInt(3),kp37_rset.getInt(4),kp37_rset.getInt(5));
		}
		kp37_rset.close(); // ResultSet ��ü �ݱ�
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}
