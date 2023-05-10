import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi_print {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		
		double lat = 37.3860521;//���� ����ġ ����
		double lng = 127.1214038; //���� ����ġ  �浵
		String QueryTxt;
		
		QueryTxt =  String.format("select * from freewifi where "+
									"SQRT( POWER(latitude-%f,2) + POWER(longitude-%f,2)) = "+
									"(select MIN( SQRT(POWER( latitude-%f,2) + POWER(longitude-%f,2))) from freewifi);",
									lat,lng,lat,lng);
		
//		QueryTxt = "select * from freewifi";
//		QueryTxt = "select * from freewifi where service_provider='SKT'";
//		QueryTxt = "select * from freewifi where inst_country='������'";
		
		ResultSet rset = stmt.executeQuery(QueryTxt);
		int iCnt = 0;
		while(rset.next()) {
//			System.out.println(rset.getString(0));
//			System.out.println("***********\n");
//			System.out.printf("**(%d)*********************",iCnt);
			System.out.printf("*(%d)*****************************************************\n",iCnt++);
			System.out.printf("��ġ��Ҹ�   :  %s\n",rset.getString(2));
			System.out.printf("��ġ��һ� : %s\n",rset.getString(3));
			System.out.printf("��ġ�õ��� : %s\n",rset.getString(4));
			System.out.printf("��ġ�ñ����� : %s\n",rset.getString(5));
			System.out.printf("��ġ�ü����� : %s\n",rset.getString(6));
			System.out.printf("����������� : %s\n",rset.getString(7));
			System.out.printf("��������SSID : %s\n",rset.getString(8));
			System.out.printf("��ġ��� : %s\n",rset.getString(9));
			System.out.printf("���������θ��ּ� : %s\n",rset.getString(10));
			System.out.printf("�����������ּ� : %s\n",rset.getString(11));
			System.out.printf("��������� : %s\n",rset.getString(12));
			System.out.printf("���������ȭ��ȣ : %s\n",rset.getString(13));
			System.out.printf("���� : %s\n",rset.getString(14));
			System.out.printf("�浵 : %s\n",rset.getString(15));
			System.out.printf("�����ͱ������� : %s\n",rset.getString(16));
			
			System.out.printf("**********************************************************\n");
			iCnt++;
		}
		
		rset.close();
		stmt.close();
		conn.close();
	}

}