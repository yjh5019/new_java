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
		
		double lat = 37.3860521;//현재 내위치 위도
		double lng = 127.1214038; //현재 내위치  경도
		String QueryTxt;
		
		QueryTxt =  String.format("select * from parkingTable where "+
									"SQRT( POWER(Latitude-%f,2) + POWER(Longitude-%f,2)) = "+
									"(select MIN( SQRT(POWER( Latitude-%f,2) + POWER(Longitude-%f,2))) from parkingTable);",
									lat,lng,lat,lng);
		
//		QueryTxt = "select * from freewifi";
//		QueryTxt = "select * from freewifi where service_provider='SKT'";
//		QueryTxt = "select * from freewifi where inst_country='수원시'";
		
		ResultSet rset = stmt.executeQuery(QueryTxt);
		int iCnt = 0;
		
		while(rset.next()) {
			System.out.printf("*(%d)*****************************************************\n",iCnt++);
			
			System.out.printf("주차장관리번호   :  %s\n",rset.getString(1));
			System.out.printf("주차장명 : %s\n",rset.getString(2));
			System.out.printf("소재지도로명주소 : %s\n",rset.getString(4));
			System.out.printf("소재지지번주소 : %s\n",rset.getString(5));
			System.out.printf("주차구획수 : %s\n",rset.getString(6));
			System.out.printf("운영요일 : %s\n",rset.getString(9));
			System.out.printf("평일운영시작시각 : %s\n",rset.getString(10));
			System.out.printf("평일운영종료시각 : %s\n",rset.getString(11));
			System.out.printf("요금정보 : %s\n",rset.getString(16));
			System.out.printf("위도 : %s\n",rset.getString(28));
			System.out.printf("관리기관명 : %s\n",rset.getString(29));
			System.out.printf("경도 : %s\n",rset.getString(32));
			System.out.printf("데이터기준일자 : %s\n",rset.getString(30));
			System.out.printf("넘버 : %s\n",rset.getString(33));
			
			System.out.printf("**********************************************************\n");
		}
		
		rset.close();
		stmt.close();
		conn.close();
	}

}