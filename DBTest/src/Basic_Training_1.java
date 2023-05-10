import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		stmt.execute("DROP TABLE parkingTable;");
		
		stmt.execute("CREATE TABLE parkingTable (" +
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
		
		
		stmt.close();
		conn.close();
	}

}
