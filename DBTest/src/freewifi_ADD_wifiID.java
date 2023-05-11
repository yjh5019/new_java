import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi_ADD_wifiID {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement kp37_stmt = kp37_conn.createStatement();		
		
		File kp37_f = new File("C:\\Users\\pc\\전국무료와이파이표준데이터Refine.txt"); //  파일 가져오기
//		File f = new File("C:\\Users\\pc\\전국무료와이파이표준데이터_날짜수정2.csv");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); //  가져온 파일을 한줄한줄 읽기위해 버퍼리더 객체 생성하고 사용
		
		String kp37_readtxt; // 읽어올 텍스트 변수 지정
		
		if((kp37_readtxt = kp37_br.readLine())==null) { //  읽어올 내용이 없다면 빈파일 출력
			
			System.out.printf("빈 파일 입니다.\n");
			return;
		}
		
		String[] field_name = kp37_readtxt.split("\t"); // 필드 명 저장할 배열 string 변수
//		String[] field_name = readtxt.split(","); // 필드 명 저장할 배열 string 변수
		int kp37_LineCnt=0;
		
//		stmt.execute("DROP TABLE freewifi;");
		while((kp37_readtxt = kp37_br.readLine())!=null) {
			
			String[] kp37_field = kp37_readtxt.split("\t");
//			String[] field = readtxt.split(",");
			String kp37_QueryTxt;
			// insert 쿼리문
			// 각 필드에 해당하는 내용들을 string format으로 지정후 string 형식의 변수에 저장
			kp37_QueryTxt = String.format("insert into freewifi("
			        + "wifi_Id,inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
			        + "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
			        + "manage_office, manage_office_phone, latitude, longitude, write_date"
			        + ") values("
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s','%s');",
			        kp37_field[0],kp37_field[1],kp37_field[2],kp37_field[3],kp37_field[4],
			        kp37_field[5],kp37_field[6],kp37_field[7],kp37_field[8],kp37_field[9],
			        kp37_field[10],kp37_field[11],kp37_field[12],kp37_field[13],kp37_field[14],kp37_field[15]
			);
			try {
				kp37_stmt.execute(kp37_QueryTxt); // 저장된변수의 쿼리 내용을 실행
				System.out.printf("%d 번째 항목 Insert OK [%s]\n", kp37_LineCnt,kp37_QueryTxt); // 값이 잘 들어갔는지 확인
				
			}catch(SQLException e) { //  에러처리 쿼리문에대한
				kp37_stmt.execute("ALTER TABLE freewifi MODIFY COLUMN inst_place_detail VARCHAR(500);"); //  에러가 뜬다면 형식을 바꿔 다시 실행
			}
			kp37_LineCnt++; //  카운트 증가
		}
		kp37_br.close(); // 버퍼 리더 닫기
		kp37_stmt.close(); // Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}
