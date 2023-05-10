import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StockDailyPrice_INSERT {

	private static final int BATCH_SIZE = 10000;
	// 10000개씩 메모리에 저장해서 한번에 database에 넣기위해 변수선언

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
//		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234"); 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		// 시작시간과 끝나는 시간을 저장하기 위해 DateFormat 지정
		
		conn.setAutoCommit(false); // disable auto-commit

		PreparedStatement pstmt = conn.prepareStatement(
				"insert into StockDailyPrice(" + "Code," + "Date," + "OpenPrice," + "HighPrice," + "LowPrice,"
						+ "ClosePrice," + "Volume," + "Transaction_Amount)" + "values(?,?,?,?,?,?,?,?)");
		// JDBC에 입력할 PreparedStatement 객체를 생성
		
		File f = new File("C:\\Users\\pc\\StockDailyPrice.txt"); // 파일을 읽어오기
		BufferedReader br = new BufferedReader(new FileReader(f));
		// 읽어온 파일을 BufferedReader로 읽기
		String readtxt; // 파일을 한줄씩 저장할 변수 선언


		if((readtxt = br.readLine())==null) {
			
			System.out.printf("빈 파일 입니다.\n");
			return;
		}
		// 만약 불러온파일의 첫줄을 읽었을때 빈값이라면 빈파일입니다를 출력하면서 종료
		
		Date date_start = new Date(System.currentTimeMillis()); // 시작시간 선언
		String date_startdf = formatter.format(date_start); // 시작시간을 DateFormat형태로 저장

		int lineCnt = 1;  // Line을 세어줄 변수 선언
		int batchCnt = 0; // 10000개씩 메모리에 저장해서 한번에 database에 넣기위해 변수선언
		System.out.println();
		
		while ((readtxt = br.readLine()) != null) { // 한줄씩 읽어오면서 빈값이 나오기전까지 반복
			String[] field = readtxt.split("\t");
			// field값들을 csv로 가져왔기 때문에 ,단위로 배열에 저장
			String dateyear = field[0].substring(0, 4);
			String datemonth = field[0].substring(4, 6);
			String dateday = field[0].substring(6, 8);
			String date = dateyear + "-" + datemonth + "-" + dateday;
			// mysql의 date형식으로 변환하기위해서 20230509 이런식으로 된 date를
			// 2023-05-09형식으로 변환
			
			pstmt.setString(1, field[1]);
			pstmt.setString(2, date);
			pstmt.setString(3, field[2]);
			pstmt.setString(4, field[3]);
			pstmt.setString(5, field[4]);
			pstmt.setString(6, field[5]);
			pstmt.setString(7, field[10]);
			pstmt.setString(8, field[11]);
			// PreparedStatement객체에 ?값들을 순서대로 채워줌
			pstmt.addBatch(); // 만든pstmt를 batch에 추가

			if (++batchCnt % BATCH_SIZE == 0) {
				pstmt.executeBatch();
				conn.commit();
				System.out.printf("%d-%d번째 항목 Insert OK\n", lineCnt - BATCH_SIZE + 1, lineCnt);
			}
			// batch가 10000개일때 database에 저장후 얼만큼 저장한지 출력

			lineCnt++;// 한줄을 저장할때마다 1씩추가
		}


		if (batchCnt % BATCH_SIZE != 0) {
			pstmt.executeBatch(); 
			conn.commit();
			System.out.printf("%d-%d번째 항목 Insert OK\n", lineCnt - batchCnt % BATCH_SIZE,lineCnt - 1); 
		}
		// batch가 10000개씩 저장했기 때문에 남은 값들을 저장
		


		Date date_end = new Date(System.currentTimeMillis()); // 끝났을때 끝난시간 저장
		String date_enddf = formatter.format(date_end); // 끝난시간을 DateFormat에 맞게 저장
		System.out.println("시작시간 : " + date_startdf);
		System.out.println("끝난시간 : " + date_enddf);
		System.out.println("처리개수 : " + (lineCnt - 1));
		// 시작시간, 끝난시간, 처리한 개수 출력
		
		br.close();	// BufferedReader닫기
		pstmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기 
	}
}
