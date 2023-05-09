import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		stmt.execute("DROP TABLE freewifi;");
		
		stmt.execute("CREATE TABLE freewifi (" +
				"wifi_Id  varchar(50) NOT NULL PRIMARY KEY , " +
                "inst_place varchar(50), " +
                "inst_place_detail varchar(50), " +
                "inst_city varchar(50), " +
                "inst_country varchar(50), " +
                "inst_place_flag varchar(50), " +
                "service_provider varchar(50), " +
                "wifi_ssid varchar(50), " +
                "inst_date varchar(50), " +
                "place_addr_road varchar(200), " +
                "place_addr_land varchar(200), " +
                "manage_office varchar(50), " +
                "manage_office_phone varchar(50), " +
                "latitude double, " +
                "longitude double, " +
                "write_date date " +
                ") DEFAULT CHARSET=utf8"
        );
		
		
		stmt.close();
		conn.close();
	}

}