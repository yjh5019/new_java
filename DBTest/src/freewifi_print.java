import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi_print {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); //  �����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();	 //  �������� �����ϱ����� statment ��ü ���� �� ���� ����	
		
		double kp37_lat = 37.3860521;//���� ����ġ ����
		double kp37_lng = 127.1214038; //���� ����ġ  �浵
		String kp37_QueryTxt; // string �������� �޾ƿ� ������ ���� ����
		// �Ÿ� ��� ������
		kp37_QueryTxt =  String.format("select * from freewifi where "+
									"SQRT( POWER(latitude-%f,2) + POWER(longitude-%f,2)) = "+
									"(select MIN( SQRT(POWER( latitude-%f,2) + POWER(longitude-%f,2))) from freewifi);",
									kp37_lat,kp37_lng,kp37_lat,kp37_lng);
		
//		QueryTxt = "select * from freewifi"; //  ���̺� ��ȸ
//		QueryTxt = "select * from freewifi where service_provider='SKT'"; // skt �� �κ��� ���̺� ��ȸ�ؼ� ��� �׸� ���
//		QueryTxt = "select * from freewifi where inst_country='������'"; //  ������ �� �κ��� ���̺� ��ȸ�ؼ� ��� �׸� ���
		
		ResultSet kp37_rset = kp37_stmt.executeQuery(kp37_QueryTxt); //  �ش� ������ �强�ϱ� ���� resultset ��ü ������ ������ ����
		int kp37_iCnt = 0; //  ī��Ʈ ����
		while(kp37_rset.next()) {
//			System.out.println(rset.getString(0));
//			System.out.println("***********\n");
//			System.out.printf("**(%d)*********************",iCnt);
			System.out.printf("*(1328)*****************************************************\n"); //  �ִܰŸ� ��� â
//			System.out.printf("*(%d)*****************************************************\n",kp37_iCnt++); //  �ִܰŸ� ��� â
			System.out.printf("��ġ��Ҹ�   :  %s\n",kp37_rset.getString(2));       // �׿� ���� �������� ����� ��ġ��Ҹ�
			System.out.printf("��ġ��һ� : %s\n",kp37_rset.getString(3));       // �׿� ���� �������� ����� ��ġ��һ�
			System.out.printf("��ġ�õ��� : %s\n",kp37_rset.getString(4));       // �׿� ���� �������� ����� ��ġ�õ���
			System.out.printf("��ġ�ñ����� : %s\n",kp37_rset.getString(5));       // �׿� ���� �������� ����� ��ġ�ñ�����
			System.out.printf("��ġ�ü����� : %s\n",kp37_rset.getString(6));       // �׿� ���� �������� ����� ��ġ�ü�����
			System.out.printf("����������� : %s\n",kp37_rset.getString(7));       // �׿� ���� �������� ����� �����������
			System.out.printf("��������SSID : %s\n",kp37_rset.getString(8));       // �׿� ���� �������� ����� ��������
			System.out.printf("��ġ��� : %s\n",kp37_rset.getString(9));       // �׿� ���� �������� ����� ��ġ���
			System.out.printf("���������θ��ּ� : %s\n",kp37_rset.getString(10));       // �׿� ���� �������� ����� ���������θ��ּ�
			System.out.printf("�����������ּ� : %s\n",kp37_rset.getString(11));       // �׿� ���� �������� ����� �����������ּ�
			System.out.printf("��������� : %s\n",kp37_rset.getString(12));       // �׿� ���� �������� ����� ���������
			System.out.printf("���������ȭ��ȣ : %s\n",kp37_rset.getString(13));       // �׿� ���� �������� ����� ���������ȭ��ȣ
			System.out.printf("���� : %s\n",kp37_rset.getString(14));       // �׿� ���� �������� ����� ����
			System.out.printf("�浵 : %s\n",kp37_rset.getString(15));       // �׿� ���� �������� ����� �浵
			System.out.printf("�����ͱ������� : %s\n",kp37_rset.getString(16));       // �׿� ���� �������� ����� �����ͱ�������
			
			System.out.printf("**********************************************************\n");
			kp37_iCnt++;
		}
		 
		kp37_rset.close(); //  ResultSet ��ü �ݱ�
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}