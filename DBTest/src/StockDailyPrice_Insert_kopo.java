import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class StockDailyPrice_Insert_kopo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();	
		
		String QueryTxt = "insert into StockDailyPrice1(" + "Code," + "Date," + "OpenPrice," + "HighPrice," + "LowPrice,"
				+ "ClosePrice," + "Volume," + "Transaction_Amount)" + "values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(QueryTxt);
		
		
		
		
		File f = new File("C:\\Users\\pc\\StockDailyPrice.csv"); // 파일을 읽어오기
//		File f = new File("C:\\Users\\pc\\전국무료와이파이표준데이터_날짜수정2.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		
		if((readtxt = br.readLine())==null) {
			
			System.out.printf("빈 파일 입니다.\n");
			return;
		}
		
		String[] field_name = readtxt.split(","); // 필드 명 저장할 배열 string 변수
//		String[] field_name = readtxt.split(","); // 필드 명 저장할 배열 string 변수
		int LineCnt=0;
		conn.setAutoCommit(false);
		long startTime = System.currentTimeMillis();
		
		System.out.println();
//		stmt.execute("DROP TABLE freewifi;");
		while((readtxt = br.readLine())!=null) {
			
			String[] field = readtxt.split(",");
//			String[] field = readtxt.split(",");
			pstmt.setString(1, field[2]);
			pstmt.setString(2, field[1]);
			pstmt.setString(3, field[4]);
			pstmt.setString(4, field[5]);
			pstmt.setString(5, field[6]);
			pstmt.setString(6, field[3]);
			pstmt.setString(7, field[11]);
			pstmt.setString(8, field[12]);
			
			pstmt.addBatch(); // 캐시에 sql 명령문 담기
			pstmt.clearParameters();
			LineCnt++;
			try {
				if(LineCnt%10000 == 0) {
					System.out.printf("%d번째 항목 Insert OK\n", LineCnt);
					pstmt.executeBatch();
					conn.commit();
					}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
//		try {
//		    pstmt.executeBatch();
//		} catch (SQLException e) {
//		    if (e.getMessage().contains("Data truncated for column 'Transaction_Amount'")) {
//		        System.out.println("Transaction_Amount 컬럼의 데이터 타입이 올바르지 않습니다. 데이터 타입을 변경합니다.");
//		        stmt.execute("ALTER TABLE StockDailyPrice1 MODIFY COLUMN Transaction_Amount VARCHAR(50);");
//		    } else {
//		        e.printStackTrace();
//		    }
//		}
		try {
			pstmt.executeBatch();
			
		}catch(SQLException e1) {
		    e1.printStackTrace();
//		    stmt.execute("ALTER TABLE StockDailyPrice MODIFY COLUMN Transaction_Amount DOUBLE(50);");
		}
		conn.commit();
		conn.setAutoCommit(true);
		long endTime = System.currentTimeMillis();
		
		System.out.printf("Insert End\n");
		System.out.printf("total : %d\n",LineCnt);
		System.out.printf("time : %dms\n",endTime-startTime);
			
			
//			QueryTxt = String.format("insert into StockDailyPrice("
//			        + "Code,Parking_Lot_Name, Date, OpenPrice, HighPrice, LowPrice,"
//			        + "ClosePrice, Volume, Transaction_Amount,"
//			        + ") values("
//			        + "'%s','%s','%s','%s','%s',"
//			        + "'%s','%s','%s');",
//			        field[1],field[0],field[2],field[3],field[4],
//			        field[5],field[10],field[11]
//			);
			////////////////////////////////////////////////////
//			try {
//				stmt.execute(QueryTxt);
//				System.out.printf("%d 번째 항목 Insert OK [%s]\n", LineCnt,QueryTxt);
//				
//			}catch(SQLException e) {
//				stmt.execute("ALTER TABLE StockDailyPrice MODIFY COLUMN Transaction_Amount INT(50);");
//			}
//			LineCnt++;
//		}
		br.close();
		pstmt.close();
//		stmt.close();
		conn.close();
	}

}

