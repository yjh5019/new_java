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
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement kp37_stmt = kp37_conn.createStatement();		
		
		File kp37_f = new File("C:\\Users\\pc\\전국무료와이파이표준데이터Refine.txt");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f));
		
		String kp37_readtxt; // 
		
		if((kp37_readtxt = kp37_br.readLine())==null) {  //  첫번째 필드명을 가져옴 없다면 빈파일이라고 출력
			
			System.out.printf("빈 파일 입니다.\n");  // 해당 줄이 없다면 해당 내용 출력
			return;
		}
		
		String[] kp37_field_name = kp37_readtxt.split("\t"); // 필드 명 저장할 배열 string 변수
		int kp37_LineCnt=0; //  데이터 갯수 세기 위한 변수 설정
		
//		stmt.execute("DROP TABLE freewifi;");
		while((kp37_readtxt = kp37_br.readLine())!=null) {
			
			String[] kp37_field = kp37_readtxt.split("\t"); // 각 필드를 탭 을 기준으로 나눠서 배열에 저장
			String kp37_QueryTxt; //  쿼리 날릴 변수를 지정
			
			kp37_QueryTxt = String.format("insert into freewifi("                       // insert를 통해 값을 넣을거다
			        + "inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag," //  각각의 요소 나열
			        + "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land," //  각각의 요소 나열
			        + "manage_office, manage_office_phone, latitude, longitude, write_date" //  각각의 요소 나열
			        + ") values(" 														// 요소 를 넣을거야
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s');",
			        kp37_field[0],kp37_field[1],kp37_field[2],kp37_field[3],kp37_field[4],      //해당 값들의 인덱스 번호에 맞게 넣는다
			        kp37_field[5],kp37_field[6],kp37_field[7],kp37_field[8],kp37_field[9],      //해당 값들의 인덱스 번호에 맞게 넣는다
			        kp37_field[10],kp37_field[11],kp37_field[12],kp37_field[13],kp37_field[14] //해당 값들의 인덱스 번호에 맞게 넣는다
			);
			try { //  에러처리
				kp37_stmt.execute(kp37_QueryTxt); //  쿼리문 실행
				System.out.printf("%d 번째 항목 Insert OK [%s]\n", kp37_LineCnt,kp37_QueryTxt); //  insert 완료시 해당 문구 출력
				
			}catch(SQLException e) {  //  해당 에러를 처리하기 위해 sql구문에서 오류가 난다면
				kp37_stmt.execute("ALTER TABLE freewifi MODIFY COLUMN inst_place_detail VARCHAR(500);"); //  해당 요소의 데이터 값을 변환한다
			}
			kp37_LineCnt++; //  카운트 증가
		}
		kp37_br.close(); // BufferedReader 객체 닫기
		kp37_stmt.close(); // Statement 객체 닫기
		kp37_conn.close(); // 데이터베이스 닫기
	}

}