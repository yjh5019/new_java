import java.sql.*;
import java.util.Random;
public class Basic_Training_2_Add {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");// ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); //  �����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();	 //  �������� �����ϱ����� statment ��ü ���� �� ���� ����		
		
		Random kp37_rand = new Random(); //  �������� �л� ������ �Է��ϱ� ���� ���� ��ü ����
        for (int kp37_i = 0; kp37_i < 1000; kp37_i++) {
            int kp37_student_id = kp37_i + 1; //  �й�
            String name = "Student_" + kp37_student_id; //  �̸�
            int kor = kp37_rand.nextInt(101); //  ����
            int eng = kp37_rand.nextInt(101); // ����
            int mat = kp37_rand.nextInt(101); //  ����

            String kp37_query = String.format("INSERT INTO grades VALUES ('%s', '%s', '%d', '%d', '%d')", kp37_student_id, name, kor, eng, mat); // �� �����͸� �ֱ� ���� ������ ����
            kp37_stmt.execute(kp37_query); //  ���� ������ ����
        }
		
        kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}

