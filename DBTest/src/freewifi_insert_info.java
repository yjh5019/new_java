import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi_insert_info {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		
		File f = new File("C:\\Users\\pc\\전국무료와이파이표준데이터Refine.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		
		if((readtxt = br.readLine())==null) {
			
			System.out.printf("빈 파일 입니다.\n");
			return;
		}
		
		String[] field_name = readtxt.split("\t"); // 필드 명 저장할 배열 string 변수
		int LineCnt=0;
		
//		stmt.execute("DROP TABLE freewifi;");
		while((readtxt = br.readLine())!=null) {
			
			String[] field = readtxt.split("\t");
			String QueryTxt;
			
			QueryTxt = String.format("insert into freewifi("
			        + "inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
			        + "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
			        + "manage_office, manage_office_phone, latitude, longitude, write_date"
			        + ") values("
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s');",
			        field[0],field[1],field[2],field[3],field[4],
			        field[5],field[6],field[7],field[8],field[9],
			        field[10],field[11],field[12],field[13],field[14]
			);
			try {
				stmt.execute(QueryTxt);
				System.out.printf("%d 번째 항목 Insert OK [%s]\n", LineCnt,QueryTxt);
				
			}catch(SQLException e) {
				stmt.execute("ALTER TABLE freewifi MODIFY COLUMN inst_place_detail VARCHAR(500);");
			}
			LineCnt++;
		}
		br.close();
		stmt.close();
		conn.close();
	}

}