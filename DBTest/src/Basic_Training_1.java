import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); //  드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//데이터베이스 연결
		// 해당 ip로 
		Statement kp37_stmt = kp37_conn.createStatement();	// SQL문 실행을 위한 Statement 객체 생성	
		kp37_stmt.execute("DROP TABLE parkingTable;"); // 기존 테이블 존재할때 테이블 삭제하고 다시 테이블 생성
		
		kp37_stmt.execute("CREATE TABLE parkingTable (" +  //  테이블 생성 쿼리 문
				"Parking_Management_Number  varchar(50)  , " + // 주차장관리번호 0
                "Parking_Lot_Name varchar(50), " + // 주차장명 1
                "Road_Address varchar(50), " + // 소재지도로명주소 4
                "Parcel_Address varchar(50), " + // 소재지지번주소  5
                "Number_of_Parking_Spaces varchar(50), " + // 주차구획수  6
                "Operating_Days varchar(50), " +  //운영요일 9
                "Weekday_Operating_Start_Time varchar(50), " + // 평일운영시작시각 10
                "Weekday_Operating_End_Time varchar(50), " + // 평일운영종료시각  11
                "Fee_Information varchar(50), " + // 요금정보 16
                "Latitude double, " + // 위도 28
                "Longitude double, " + //  경도 29
                "Providing_Agency_Name varchar(50), " + // 제공기관명 32
                "write_date date, " + // 데이터기준일자  30
//                "NUM INT NOT NULL PRIMARY KEY" + // 33
                "NUM INT NOT NULL PRIMARY KEY " + // 33
                ") DEFAULT CHARSET=utf8"
        );
		
		
		kp37_stmt.close(); // Statement 객체  닫기
		kp37_conn.close(); // 데이터베이스 연결 닫기 
	}

}
