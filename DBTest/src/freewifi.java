import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); //  드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();		// 쿼리 실행을 위한 Statement 객체 생성	
//		kp37_stmt.execute("DROP TABLE freewifi;"); // 기존 테이블 삭제 후 다시 만들기 위한 drop table 명령어
		
		kp37_stmt.execute("CREATE TABLE freewifi (" +
				"wifi_Id  varchar(50) NOT NULL PRIMARY KEY , " + //  프라이머리키 지정
                "inst_place varchar(50), " + // inst_place
                "inst_place_detail varchar(50), " + //inst_place_detail
                "inst_city varchar(50), " + //inst_city
                "inst_country varchar(50), " + // inst_country
                "inst_place_flag varchar(50), " + // inst_place_flag
                "service_provider varchar(50), " + // service_provider
                "wifi_ssid varchar(50), " + // wifi_ssid
                "inst_date varchar(50), " + // inst_date
                "place_addr_road varchar(200), " + // place_addr_road
                "place_addr_land varchar(200), " + // place_addr_land
                "manage_office varchar(50), " + // manage_office
                "manage_office_phone varchar(50), " + //manage_office_phone
                "latitude double, " + // 위도
                "longitude double, " + // 경도
                "write_date date " + // 날짜
                ") DEFAULT CHARSET=utf8"
        );
		
		
		
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}