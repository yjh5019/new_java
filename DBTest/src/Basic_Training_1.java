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
				"Parking_Management_Number  varchar(50)  , " + // �����������ȣ 0
                "Parking_Lot_Name varchar(50), " + // ������� 1
                "Road_Address varchar(50), " + // ���������θ��ּ� 4
                "Parcel_Address varchar(50), " + // �����������ּ�  5
                "Number_of_Parking_Spaces varchar(50), " + // ������ȹ��  6
                "Operating_Days varchar(50), " +  //����� 9
                "Weekday_Operating_Start_Time varchar(50), " + // ���Ͽ���۽ð� 10
                "Weekday_Operating_End_Time varchar(50), " + // ���Ͽ����ð�  11
                "Fee_Information varchar(50), " + // ������� 16
                "Latitude double, " + // ���� 28
                "Longitude double, " + //  �浵 29
                "Providing_Agency_Name varchar(50), " + // ��������� 32
                "write_date date, " + // �����ͱ�������  30
//                "NUM INT NOT NULL PRIMARY KEY" + // 33
                "NUM INT NOT NULL PRIMARY KEY " + // 33
                ") DEFAULT CHARSET=utf8"
        );
		
		
		stmt.close();
		conn.close();
	}

}
