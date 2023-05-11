import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi_print {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); //  데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();	 //  쿼리문을 수행하기위해 statment 객체 생성 후 변수 저장	
		
		double kp37_lat = 37.3860521;//현재 내위치 위도
		double kp37_lng = 127.1214038; //현재 내위치  경도
		String kp37_QueryTxt; // string 형식으로 받아올 쿼리문 변수 지정
		// 거리 계산 쿼리문
		kp37_QueryTxt =  String.format("select * from freewifi where "+
									"SQRT( POWER(latitude-%f,2) + POWER(longitude-%f,2)) = "+
									"(select MIN( SQRT(POWER( latitude-%f,2) + POWER(longitude-%f,2))) from freewifi);",
									kp37_lat,kp37_lng,kp37_lat,kp37_lng);
		
//		QueryTxt = "select * from freewifi"; //  테이블 조회
//		QueryTxt = "select * from freewifi where service_provider='SKT'"; // skt 인 부분을 테이블 조회해서 모든 항목 출력
//		QueryTxt = "select * from freewifi where inst_country='수원시'"; //  수원시 인 부분을 테이블 조회해서 모든 항목 출력
		
		ResultSet kp37_rset = kp37_stmt.executeQuery(kp37_QueryTxt); //  해당 쿼리문 장성하기 위한 resultset 객체 생성후 변수에 저장
		int kp37_iCnt = 0; //  카운트 세기
		while(kp37_rset.next()) {
//			System.out.println(rset.getString(0));
//			System.out.println("***********\n");
//			System.out.printf("**(%d)*********************",iCnt);
			System.out.printf("*(1328)*****************************************************\n"); //  최단거리 출력 창
//			System.out.printf("*(%d)*****************************************************\n",kp37_iCnt++); //  최단거리 출력 창
			System.out.printf("설치장소명   :  %s\n",kp37_rset.getString(2));       // 그에 관한 정보들을 출력함 설치장소명
			System.out.printf("설치장소상세 : %s\n",kp37_rset.getString(3));       // 그에 관한 정보들을 출력함 설치장소상세
			System.out.printf("설치시도명 : %s\n",kp37_rset.getString(4));       // 그에 관한 정보들을 출력함 설치시도명
			System.out.printf("설치시군구명 : %s\n",kp37_rset.getString(5));       // 그에 관한 정보들을 출력함 설치시군구명
			System.out.printf("설치시설구분 : %s\n",kp37_rset.getString(6));       // 그에 관한 정보들을 출력함 설치시설구분
			System.out.printf("서비스제공사명 : %s\n",kp37_rset.getString(7));       // 그에 관한 정보들을 출력함 서비스제공사명
			System.out.printf("와이파이SSID : %s\n",kp37_rset.getString(8));       // 그에 관한 정보들을 출력함 와이파이
			System.out.printf("설치년월 : %s\n",kp37_rset.getString(9));       // 그에 관한 정보들을 출력함 설치년월
			System.out.printf("소재지도로명주소 : %s\n",kp37_rset.getString(10));       // 그에 관한 정보들을 출력함 소재지도로명주소
			System.out.printf("소재지지번주소 : %s\n",kp37_rset.getString(11));       // 그에 관한 정보들을 출력함 소재지지번주소
			System.out.printf("관리기관명 : %s\n",kp37_rset.getString(12));       // 그에 관한 정보들을 출력함 관리기관명
			System.out.printf("관리기관전화번호 : %s\n",kp37_rset.getString(13));       // 그에 관한 정보들을 출력함 관리기관전화번호
			System.out.printf("위도 : %s\n",kp37_rset.getString(14));       // 그에 관한 정보들을 출력함 위도
			System.out.printf("경도 : %s\n",kp37_rset.getString(15));       // 그에 관한 정보들을 출력함 경도
			System.out.printf("데이터기준일자 : %s\n",kp37_rset.getString(16));       // 그에 관한 정보들을 출력함 데이터기준일자
			
			System.out.printf("**********************************************************\n");
			kp37_iCnt++;
		}
		 
		kp37_rset.close(); //  ResultSet 객체 닫기
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}