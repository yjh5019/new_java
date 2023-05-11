
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class StockDailyPrice_Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();	// 쿼리 실행을 위한 Statement 객체 생성	
		kp37_stmt.execute("DROP TABLE StockDailyPrice2;");
		
		kp37_stmt.execute("CREATE TABLE StockDailyPrice2 (" + // StockDailyPrice1 테이블 생성
		        "Code VARCHAR(50) NOT NULL, " + // 종목명
		        "Date VARCHAR(50) NOT NULL, " + // 날짜
		        "OpenPrice INT, " + // 시가
		        "HighPrice INT, " + // 고가
		        "LowPrice INT, " + // 저가
		        "ClosePrice INT, " + // 종가
		        "Volume DOUBLE, " + // 거래량
		        "Transaction_Amount DOUBLE ," + // 거래대금
		        "PRIMARY KEY (Date, Code), " + // 복합 P-KEY  date 와 code 를 복합키로 설정해 중복 방지
		        "UNIQUE KEY (Date, Code)" + // 복합 P-KEY
		        ") DEFAULT CHARSET=utf8"    // utf8로 언어 설정
		);
		
		
		kp37_stmt.close(); // Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}




















































//import java.sql.*;
//
//public class StockDailyPrice_Main {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
//		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234"); 
//		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
//		Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성
//		
//		
//		// 단축코드, 일자, 	              시가,         고가,       저가,      종가,         거래량,          거래대금
//		// code,     transaction_date, open_price, high_price, low_price, close_price, trading_volume, trading_amount
//		// field[0],  field[1]			field[4]    field[5]    field[6]     field[3]	   field[11]	  field[12]
//		k05_stmt.execute("create table stock(" + "Stockcode varchar(50) not null,"+ "transaction_date date not null,"
//				+ "open_price int," +"high_price int,"+ "low_price int,"
//				+ "close_price int," + "trading_volume int," + "trading_amount bigint,"
//				+ "primary key(Stockcode, transaction_date))"
//				+ "DEFAULT CHARSET=utf8;");
//		// stock이라는 table을 (fieldname  저장형태)의 형식으로 table 생성
//		
//		
//		k05_stmt.close(); // 에러가 발생하지않기 위해 객체닫기
//		k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기
//	}
//	
//}

