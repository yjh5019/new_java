import java.io.UnsupportedEncodingException;
import java.sql.*;
public class DBTest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//�����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();// ���� ������ ���� Statement ��ü ����	
		// ���̺��� �����ϴ� ������ �ۼ�
//		kp37_stmt.execute("CREATE TABLE examtable1(" +  //  examtable1 �� �����
//	             "name VARCHAR(20), " +               // �̸��� ������(20)����
//	             "studentid INT NOT NULL PRIMARY KEY, " + //  �й��� �����̸Ӹ� Ű�� ���� ������ ����
//	             "kor INT, " +                            //  ���� 
//	             "eng INT, " +                            //	����
//	             "mat INT) " +                            //	����
//	             "DEFAULT CHARSET=utf8;");                            // utf8�� ����
		
		
//		kp37_stmt.execute("delete from examtable1;"); //  ���� ���̺� ����
		// ����� ���� ���̺� ���Ŀ� ������ �����͸� �ִ´�
		//������ ����
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('ȿ��',209901,95,100,95);"  ); // insert�� �̿��� examtable�� ������ ������ ���� �ִ´�
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('����',209902,95,95,95);"  ); // insert�� �̿��� examtable�� ������ ������ ���� �ִ´�
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('����',209903,100,100,100);"  ); // insert�� �̿��� examtable�� ������ ������ ���� �ִ´�
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('����',209904,100,95,90);"  ); // insert�� �̿��� examtable�� ������ ������ ���� �ִ´�
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('�ҿ�',209905,90,80,80);"  ); // insert�� �̿��� examtable�� ������ ������ ���� �ִ´�
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('ť��',209906,100,95,80);"  ); // insert�� �̿��� examtable�� ������ ������ ���� �ִ´�
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('ȭ��',209907,70,70,70);"  ); // insert�� �̿��� examtable�� ������ ������ ���� �ִ´�
		
		
		ResultSet rset = kp37_stmt.executeQuery("select * from examtable1;"); //  select ���� ���� �ش� ���̺��� ����
		System.out.printf("  �̸�  �й�  ����  ����  ����\n"); //  �� �׸� ���
		while(rset.next()) {									// �� �׸��� ���
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n",
								rset.getString(1), rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5)); //  �ش� ������ ���� getString�� ���� �޾ƿ´�
		}
		rset.close(); // ResultSet ��ü �ݱ�
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}
