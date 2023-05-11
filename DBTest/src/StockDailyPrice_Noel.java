import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StockDailyPrice_Noel {
	public static void main(String[] args) {
		String dbUrl = "dbUrl";
		String dbUsername = "dbUsername";
		String dbPassword = "dbPassword";
		List<String> csvFilePaths = new ArrayList<>();
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_00.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_01.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_02.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_03.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_04.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_05.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_06.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_07.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_08.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_09.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_10.csv");
		csvFilePaths.add("C:\\Users\\노을\\Documents\\GitHub\\KOPO-database\\DatabaseTest\\txt\\StockDaily_11.csv");

		ExecutorService executorService = Executors.newFixedThreadPool(12);
		
		System.out.println("CSV 파일 적재를 시작합니다.");
		
		for (String csvFilePath : csvFilePaths) {
			CSVLoader csvLoader = new CSVLoader(csvFilePath, dbUrl, dbUsername, dbPassword);
			executorService.execute(csvLoader);
		}
		executorService.shutdown();
	}
}

class CSVLoader implements Runnable {

	private String csvFilePath;
	private String dbUrl;
	private String dbUsername;
	private String dbPassword;

	public CSVLoader(String csvFilePath, String dbUrl, String dbUsername, String dbPassword) {
		this.csvFilePath = csvFilePath;
		this.dbUrl = dbUrl;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
				Connection kopo11_conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
				PreparedStatement kopo11_pstmt = kopo11_conn.prepareStatement(
						"insert into stockDailyPrice (stockCODE,Daily,opening_price,high_price,low_price,closing_price,trading_volume,trading_amount) "
						+ "values (?,?,?,?,?,?,?,?)")) {
			String kopo11_readtxt;
//			if ((kopo11_readtxt = br.readLine()) == null) {
//				System.out.printf("빈 파일입니다.\n");
//				return;
//			}
			int kopo11_LineCnt = 0;
			kopo11_conn.setAutoCommit(false);
			long kopo11_startTime = System.currentTimeMillis();
			System.out.println(csvFilePath + " 파일 적재를 시작합니다.");
			while ((kopo11_readtxt = br.readLine()) != null) {
				
			    String[] kopo11_field = kopo11_readtxt.split(",");
			    try {
			        kopo11_pstmt.setString(1, kopo11_field[2]);
			        kopo11_pstmt.setString(2, kopo11_field[1]);
			        kopo11_pstmt.setString(3, kopo11_field[4]);
			        kopo11_pstmt.setString(4, kopo11_field[5]);
			        kopo11_pstmt.setString(5, kopo11_field[6]);
			        kopo11_pstmt.setString(6, kopo11_field[3]);
			        kopo11_pstmt.setString(7, kopo11_field[11]);
			        kopo11_pstmt.setString(8, kopo11_field[12]);
			        kopo11_pstmt.addBatch();
			        kopo11_LineCnt++;

			        if (kopo11_LineCnt % 10000 == 0) {
			            kopo11_pstmt.executeBatch();
			            kopo11_conn.commit();
			            System.out.printf("%d번째 항목 addBatch OK\n", kopo11_LineCnt);
			        }
			    } catch (Exception e) {
			        e.printStackTrace();
			        kopo11_conn.rollback();			    	
			    }
			}
			// 마지막으로 남은 배치를 실행
			kopo11_pstmt.executeBatch();
			kopo11_conn.commit();

			long kopo11_endTime = System.currentTimeMillis();
			
			System.out.println(csvFilePath + " 파일 적재가 완료되었습니다.");
			System.out.printf("Insert End\n");
			System.out.printf("total   : %d\n", kopo11_LineCnt);
			System.out.printf("time    : %dms\n", kopo11_endTime - kopo11_startTime);

			kopo11_pstmt.close();
			br.close();
			kopo11_conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
