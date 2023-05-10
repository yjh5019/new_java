
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class StockDailyPrice_Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		stmt.execute("DROP TABLE StockDailyPrice1;");
		
		stmt.execute("CREATE TABLE StockDailyPrice1 (" +
		        "Code VARCHAR(50) NOT NULL, " + // �����
		        "Date VARCHAR(50) NOT NULL, " + // ��¥
		        "OpenPrice INT, " + // �ð�
		        "HighPrice INT, " + // ��
		        "LowPrice INT, " + // ����
		        "ClosePrice INT, " + // ����
		        "Volume DOUBLE, " + // �ŷ���
		        "Transaction_Amount DOUBLE ," + // �ŷ����
		        "PRIMARY KEY (Date, Code), " + // ���� P-KEY
		        "UNIQUE KEY (Date, Code)" + // ���� P-KEY
		        ") DEFAULT CHARSET=utf8"
		);
		
		
		stmt.close();
		conn.close();
	}

}




















































//import java.sql.*;
//
//public class StockDailyPrice_Main {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
//		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234"); 
//		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
//		Statement k05_stmt = k05_conn.createStatement(); // JDBC�� �Է��� ��ü�� ����
//		
//		
//		// �����ڵ�, ����, 	              �ð�,         ��,       ����,      ����,         �ŷ���,          �ŷ����
//		// code,     transaction_date, open_price, high_price, low_price, close_price, trading_volume, trading_amount
//		// field[0],  field[1]			field[4]    field[5]    field[6]     field[3]	   field[11]	  field[12]
//		k05_stmt.execute("create table stock(" + "Stockcode varchar(50) not null,"+ "transaction_date date not null,"
//				+ "open_price int," +"high_price int,"+ "low_price int,"
//				+ "close_price int," + "trading_volume int," + "trading_amount bigint,"
//				+ "primary key(Stockcode, transaction_date))"
//				+ "DEFAULT CHARSET=utf8;");
//		// stock�̶�� table�� (fieldname  ��������)�� �������� table ����
//		
//		
//		k05_stmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
//		k05_conn.close(); // ������ �߻������ʱ� ���� �������
//	}
//	
//}

