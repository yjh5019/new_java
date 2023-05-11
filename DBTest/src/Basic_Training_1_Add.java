import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1_Add {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();		// 쿼리 실행을 위한 Statement 객체 생성	
		
		File kp37_f = new File("C:\\Users\\pc\\전국주차장정보표준데이터2 - 복사본.txt"); //  파일 가져오기
//		File f = new File("C:\\Users\\pc\\전국무료와이파이표준데이터_날짜수정2.csv");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); //  파일 읽기
		
		String kp37_readtxt;//  읽어올 내용을 변수 설정
		
		if((kp37_readtxt = kp37_br.readLine())==null) {
			
			System.out.printf("빈 파일 입니다.\n");  // 해당 줄이 없다면 해당 내용 출력
			return;
		}
		 
		String[] kp37_field_name = kp37_readtxt.split("\t"); // 필드 명 저장할 배열 string 변수 탭를 기준으로 나눔
//		String[] field_name = readtxt.split(","); // 필드 명 저장할 배열 string 변수
		int kp37_LineCnt=0; //  카운트 세기
		while((kp37_readtxt = kp37_br.readLine())!=null) { //  한줄씩 읽어 올거야
			
			String[] kp37_field = kp37_readtxt.split("\t"); //탭를 기준으로 나눔
//			String[] field = readtxt.split(",");
			String kp37_QueryTxt;
			kp37_QueryTxt = String.format("insert into parkingTable("   // 
			        + "Parking_Management_Number,Parking_Lot_Name, Road_Address, Parcel_Address, Number_of_Parking_Spaces, Operating_Days,"
			        + "Weekday_Operating_Start_Time, Weekday_Operating_End_Time, Fee_Information, Latitude, Longitude,"
			        + "Providing_Agency_Name, write_date, NUM"
			        + ") values("
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s');",
			        kp37_field[0],kp37_field[1],kp37_field[4],kp37_field[5],kp37_field[6],
			        kp37_field[9],kp37_field[10],kp37_field[11],kp37_field[16],kp37_field[28],
			        kp37_field[29],kp37_field[32],kp37_field[30],kp37_field[33]
			);
			try {
				kp37_stmt.execute(kp37_QueryTxt);  // 쿼리문 실행
				System.out.printf("%d 번째 항목 Insert OK [%s]\n", kp37_LineCnt,kp37_QueryTxt); //  해당 쿼리문 실행 후 출력
				
			}catch(SQLException e) { //  에러처리 
				kp37_stmt.execute("ALTER TABLE parkingTable MODIFY COLUMN Road_Address VARCHAR(500);"); // Road_Address의 데이터 형식 변환
			}
			kp37_LineCnt++; //  카운트 세기
		}
		kp37_br.close(); //  BufferedReader 객체 닫기
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}

