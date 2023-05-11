import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1_distance {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//  �����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement(); // SQL�� ������ ���� Statement ��ü ����		
		
		double kp37_lat = 37.3860521;//���� ����ġ ����
		double kp37_lng = 127.1214038; //���� ����ġ  �浵
		String kp37_QueryTxt;
		
		kp37_QueryTxt =  String.format("select * from parkingTable where "+  // �������� string.foramt�� ���� �ۼ��ϰ�
									"SQRT( POWER(Latitude-%f,2) + POWER(Longitude-%f,2)) = "+ // �Ÿ� ���ϴ� ������ ���̺�κ��� ������
									"(select MIN( SQRT(POWER( Latitude-%f,2) + POWER(Longitude-%f,2))) from parkingTable);", //  ������ ���
									kp37_lat,kp37_lng,kp37_lat,kp37_lng);
		
//		QueryTxt = "select * from freewifi";
//		QueryTxt = "select * from freewifi where service_provider='SKT'";
//		QueryTxt = "select * from freewifi where inst_country='������'";
		
		ResultSet kp37_rset = kp37_stmt.executeQuery(kp37_QueryTxt);  //������ ���� �������� stmt�� ���� 
		int kp37_iCnt = 0;
		// 
		while(kp37_rset.next()) {
//			System.out.printf("*(%d)*****************************************************\n",kp37_iCnt++);
			System.out.printf("*(195)*****************************************************\n");
			
			System.out.printf("�����������ȣ   :  %s\n",kp37_rset.getString(1)); //  �� ������ ��� �����������ȣ
			System.out.printf("������� : %s\n",kp37_rset.getString(2)); //  �� ������ ��� ������� �������
			System.out.printf("���������θ��ּ� : %s\n",kp37_rset.getString(3)); //  �� ������ ��� ���������θ��ּ�
			System.out.printf("�����������ּ� : %s\n",kp37_rset.getString(4)); //  �� ������ ��� �����������ּ�
			System.out.printf("������ȹ�� : %s\n",kp37_rset.getString(5)); //  �� ������ ��� ������ȹ��
			System.out.printf("����� : %s\n",kp37_rset.getString(6)); //  �� ������ ��� �����
			System.out.printf("���Ͽ���۽ð� : %s\n",kp37_rset.getString(7)); //  �� ������ ��� ���Ͽ���۽ð�
			System.out.printf("���Ͽ����ð� : %s\n",kp37_rset.getString(8)); //  �� ������ ��� ���Ͽ����ð�
			System.out.printf("������� : %s\n",kp37_rset.getString(9)); //  �� ������ ��� �������
			System.out.printf("���� : %s\n",kp37_rset.getString(10)); //  �� ������ ��� ����
			System.out.printf("�浵 : %s\n",kp37_rset.getString(11)); //  �� ������ ��� ���������
			System.out.printf("��ġ : %s\n",kp37_rset.getString(12)); //  �� ������ ��� �浵
			System.out.printf("�����ͱ������� : %s\n",kp37_rset.getString(13)); //  �� ������ ��� �����ͱ�������
			System.out.printf("�ѹ� : %s\n",kp37_rset.getString(14)); //  �����̸Ӹ�Ű�� ����
			
			System.out.printf("**********************************************************\n");
		}
		
		kp37_rset.close(); //  ResultSet ��ü �ݱ�
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}