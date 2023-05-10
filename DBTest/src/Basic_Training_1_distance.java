import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1_distance {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		
		double lat = 37.3860521;//���� ����ġ ����
		double lng = 127.1214038; //���� ����ġ  �浵
		String QueryTxt;
		
		QueryTxt =  String.format("select * from parkingTable where "+
									"SQRT( POWER(Latitude-%f,2) + POWER(Longitude-%f,2)) = "+
									"(select MIN( SQRT(POWER( Latitude-%f,2) + POWER(Longitude-%f,2))) from parkingTable);",
									lat,lng,lat,lng);
		
//		QueryTxt = "select * from freewifi";
//		QueryTxt = "select * from freewifi where service_provider='SKT'";
//		QueryTxt = "select * from freewifi where inst_country='������'";
		
		ResultSet rset = stmt.executeQuery(QueryTxt);
		int iCnt = 0;
		
		while(rset.next()) {
			System.out.printf("*(%d)*****************************************************\n",iCnt++);
			
			System.out.printf("�����������ȣ   :  %s\n",rset.getString(1));
			System.out.printf("������� : %s\n",rset.getString(2));
			System.out.printf("���������θ��ּ� : %s\n",rset.getString(3));
			System.out.printf("�����������ּ� : %s\n",rset.getString(4));
			System.out.printf("������ȹ�� : %s\n",rset.getString(5));
			System.out.printf("����� : %s\n",rset.getString(6));
			System.out.printf("���Ͽ���۽ð� : %s\n",rset.getString(7));
			System.out.printf("���Ͽ����ð� : %s\n",rset.getString(8));
			System.out.printf("������� : %s\n",rset.getString(9));
			System.out.printf("���� : %s\n",rset.getString(10));
			System.out.printf("��������� : %s\n",rset.getString(11));
			System.out.printf("�浵 : %s\n",rset.getString(12));
			System.out.printf("�����ͱ������� : %s\n",rset.getString(13));
			System.out.printf("�ѹ� : %s\n",rset.getString(14));
			
			System.out.printf("**********************************************************\n");
		}
		
		rset.close();
		stmt.close();
		conn.close();
	}

}