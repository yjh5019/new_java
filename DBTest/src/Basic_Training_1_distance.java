import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1_distance {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//  데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement(); // SQL문 실행을 위한 Statement 객체 생성		
		
		double kp37_lat = 37.3860521;//현재 내위치 위도
		double kp37_lng = 127.1214038; //현재 내위치  경도
		String kp37_QueryTxt;
		
		kp37_QueryTxt =  String.format("select * from parkingTable where "+  // 쿼리문을 string.foramt을 통해 작성하고
									"SQRT( POWER(Latitude-%f,2) + POWER(Longitude-%f,2)) = "+ // 거리 구하는 공식을 테이블로부터 가져와
									"(select MIN( SQRT(POWER( Latitude-%f,2) + POWER(Longitude-%f,2))) from parkingTable);", //  변수에 담기
									kp37_lat,kp37_lng,kp37_lat,kp37_lng);
		
//		QueryTxt = "select * from freewifi";
//		QueryTxt = "select * from freewifi where service_provider='SKT'";
//		QueryTxt = "select * from freewifi where inst_country='수원시'";
		
		ResultSet kp37_rset = kp37_stmt.executeQuery(kp37_QueryTxt);  //변수에 담은 쿼리문을 stmt를 통해 
		int kp37_iCnt = 0;
		// 
		while(kp37_rset.next()) {
//			System.out.printf("*(%d)*****************************************************\n",kp37_iCnt++);
			System.out.printf("*(195)*****************************************************\n");
			
			System.out.printf("주차장관리번호   :  %s\n",kp37_rset.getString(1)); //  각 데이터 출력 주차장관리번호
			System.out.printf("주차장명 : %s\n",kp37_rset.getString(2)); //  각 데이터 출력 주차장명 주차장명
			System.out.printf("소재지도로명주소 : %s\n",kp37_rset.getString(3)); //  각 데이터 출력 소재지도로명주소
			System.out.printf("소재지지번주소 : %s\n",kp37_rset.getString(4)); //  각 데이터 출력 소재지지번주소
			System.out.printf("주차구획수 : %s\n",kp37_rset.getString(5)); //  각 데이터 출력 주차구획수
			System.out.printf("운영요일 : %s\n",kp37_rset.getString(6)); //  각 데이터 출력 운영요일
			System.out.printf("평일운영시작시각 : %s\n",kp37_rset.getString(7)); //  각 데이터 출력 평일운영시작시각
			System.out.printf("평일운영종료시각 : %s\n",kp37_rset.getString(8)); //  각 데이터 출력 평일운영종료시각
			System.out.printf("요금정보 : %s\n",kp37_rset.getString(9)); //  각 데이터 출력 요금정보
			System.out.printf("위도 : %s\n",kp37_rset.getString(10)); //  각 데이터 출력 위도
			System.out.printf("경도 : %s\n",kp37_rset.getString(11)); //  각 데이터 출력 관리기관명
			System.out.printf("위치 : %s\n",kp37_rset.getString(12)); //  각 데이터 출력 경도
			System.out.printf("데이터기준일자 : %s\n",kp37_rset.getString(13)); //  각 데이터 출력 데이터기준일자
			System.out.printf("넘버 : %s\n",kp37_rset.getString(14)); //  프라이머리키로 지정
			
			System.out.printf("**********************************************************\n");
		}
		
		kp37_rset.close(); //  ResultSet 객체 닫기
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}