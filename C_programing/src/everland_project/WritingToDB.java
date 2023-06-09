package everland_project;
import java.sql.*;
public class WritingToDB {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test";

    // MySQL 데이터베이스 계정 정보
    static final String USER = "root";
    static final String PASS = "123456";
    private Connection conn = null;
    private Statement stmt = null;
    
    WritingToDB() {
    	try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
    }
    
    public void getAmountFromDB() {
    	// 권종별 판매 갯수
    	try {
	    	String sql = "SELECT option1, COUNT(amount) AS num_orders FROM orderlist GROUP BY option1;";
	    	System.out.println("SQL : " + sql);
	    	ResultSet rs = stmt.executeQuery(sql);
	    	// 결과셋 처리
        	while (rs.next()) {
        	   String option = rs.getString("option1");
			   String num_orders = rs.getString("num_orders");
			   System.out.println("option: " + option + ", num_orders: " + num_orders);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//    }
//    
//    public void writeToDB(ListSaving ls) {     
//      try {		 		
//		 // 삽입할 데이터를 정의합니다.
////		 int id = 1;
////		 String name = "John";
////		 int age = 30;
////		
//		 // SQL INSERT 문을 생성하고 실행합니다.
//		 for (OrderList order : ls.getData()) {
//				order.setGenderNum();
//				String sql = "INSERT INTO orderlist VALUES (" + order.getCSV() + ")";
//				System.out.println(sql);
//				stmt.executeUpdate(sql);
//		 }
//	  } catch (Exception e) {
//	  
//	  }
//    }

}
