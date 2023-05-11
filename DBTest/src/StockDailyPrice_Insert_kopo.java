import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class StockDailyPrice_Insert_kopo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();	 // 쿼리 실행을 위한 Statement 객체 생성	
		
		String kp37_QueryTxt = "insert into StockDailyPrice2(" + "Code," + "Date," + "OpenPrice," + "HighPrice," + "LowPrice,"
				+ "ClosePrice," + "Volume," + "Transaction_Amount)" + "values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement kp37_pstmt = kp37_conn.prepareStatement(kp37_QueryTxt); // PreparedStatement 객체 쿼리문에서 매개변수가 들어갈 자리에?를 사용하여 SQL 쿼리문 작성
		
		File kp37_f = new File("C:\\Users\\pc\\StockDailyPrice.csv"); // 파일 가져오기
//		File f = new File("C:\\Users\\pc\\전국무료와이파이표준데이터_날짜수정2.csv");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); //  파일을 가져와  BufferedReader로 해당 내용을 읽기
		
		String kp37_readtxt; //  읽어올 내용을 변수 설정
		SimpleDateFormat k37_sdt = new SimpleDateFormat("HH:mm:ss");
		 // 해당 줄이 없다면 해당 내용 출력
//		if((kp37_readtxt = kp37_br.readLine())==null) {
//			
//			System.out.printf("빈 파일 입니다.\n");
//			return;
//		}
//		String[] field_name = kp37_readtxt.split(","); // 필드 명 저장할 배열 string 변수 ,를 기준으로 나눔
//		String[] field_name = readtxt.split(","); // 필드 명 저장할 배열 string 변수
		int kp37_LineCnt=0; //  데이터 갯수 세기 위한 변수 설정
		kp37_conn.setAutoCommit(false); //  오토커밋을 false로 설정
		long startTime = System.currentTimeMillis(); //  작업 시작시 start time 찍기
        Calendar start = new GregorianCalendar();
        String startTime1 = k37_sdt.format(start.getTime());
		while((kp37_readtxt = kp37_br.readLine())!=null) {
			
			String[] kp37_field = kp37_readtxt.split(",");
//			String[] field = readtxt.split(",");
			kp37_pstmt.setString(1, kp37_field[2]); //  첫번째 ? 에 3번째 필드 내용을 넣는다
			kp37_pstmt.setString(2, kp37_field[1]); //  두번째 ? 에 2번째 필드 내용을 넣는다
			kp37_pstmt.setString(3, kp37_field[4]); //  세번째 ? 에 5번째 필드 내용을 넣는다
			kp37_pstmt.setString(4, kp37_field[5]); //  네번째 ? 에 6번째 필드 내용을 넣는다
			kp37_pstmt.setString(5, kp37_field[6]); //  다섯번째 ? 에 7번째 필드 내용을 넣는다
			kp37_pstmt.setString(6, kp37_field[3]); //  여섯번째 ? 에 4번째 필드 내용을 넣는다
			kp37_pstmt.setString(7, kp37_field[11]); //  일곱번째 ? 에 12번째 필드 내용을 넣는다
			kp37_pstmt.setString(8, kp37_field[12]); //  여덟번째 ? 에 13번째 필드 내용을 넣는다
			
			kp37_pstmt.addBatch(); //  SQL 문을 배치로 캐시에 추가하는 메소드, 캐시에 sql 명령문 담기
			kp37_pstmt.clearParameters(); //  해당 명령문을 초기화 하고 while문을 통해 다시 새로운 값을 받아온다
			kp37_LineCnt++;
			try {
				if(kp37_LineCnt%50000 == 0) { //  10000번째 라면 해당 데이터가 잘 들어갔는지 확인
					System.out.printf("%d번째 항목 Insert OK\n", kp37_LineCnt);
					kp37_pstmt.executeBatch(); //executeBatch() 메서드는 addBatch()를 사용하여 배치에 추가된 SQL 명령문을 실행
					kp37_conn.commit(); //  현재까지 실행된 쿼리문을 확정 짓는 명령어
					}
			}catch(Exception e) { //  에러 try catch 
				e.printStackTrace(); // 예외가 발생한 지점과 예외 정보를 출력하는 메소드
			}
		}
		try {
			kp37_pstmt.executeBatch(); //executeBatch() 메서드는 addBatch()를 사용하여 배치에 추가된 SQL 명령문을 실행
			
		}catch(Exception e) {
		    e.printStackTrace(); // 예외가 발생한 지점과 예외 정보를 출력하는 메소드
		}
		kp37_conn.commit(); //  현재까지 실행된 쿼리문을 확정 짓는 명령어
		kp37_conn.setAutoCommit(true); //  오토커밋 true 로 변경
		long kp37_endTime = System.currentTimeMillis(); //  해당 작업 완료시 시간 찍기
		Calendar end = new GregorianCalendar();
        String endTime1 = k37_sdt.format(end.getTime());
		System.out.printf("Insert End\n"); //  해당 작업 완료시 출력
		System.out.printf("total : %d\n",kp37_LineCnt);  //  총 데이터의 갯수 
		System.out.printf("start time : %d\n",startTime1); // 시작 시간
		System.out.printf("end time : %d\n",endTime1); // 작업 완료시간
		System.out.printf("time : %dms\n",kp37_endTime-startTime); //  총 걸린시간을 ms로 출력

		kp37_br.close(); // 
		kp37_pstmt.close(); // 
		kp37_conn.close(); // 데이터베이스 닫기
	}

}

