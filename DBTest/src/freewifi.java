import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); //  ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//�����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();		// ���� ������ ���� Statement ��ü ����	
//		kp37_stmt.execute("DROP TABLE freewifi;"); // ���� ���̺� ���� �� �ٽ� ����� ���� drop table ��ɾ�
		
		kp37_stmt.execute("CREATE TABLE freewifi (" +
				"wifi_Id  varchar(50) NOT NULL PRIMARY KEY , " + //  �����̸Ӹ�Ű ����
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
                "latitude double, " + // ����
                "longitude double, " + // �浵
                "write_date date " + // ��¥
                ") DEFAULT CHARSET=utf8"
        );
		
		
		
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}