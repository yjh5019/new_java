//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.*;
//import com.mysql.cj.xdevapi.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		System.out.println("qefqe");
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");// 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");// 데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();// 쿼리 실행을 위한 Statement 객체 생성
		
		ResultSet kp37_rset = kp37_stmt.executeQuery("show databases;"); //  내가 현제 만들어 놓은 데이터베이스 조회
		
		while(kp37_rset.next()) {
			System.out.println("값 : " + kp37_rset.getString(1)); //  해당 테이블의 첫번째 값을 reset을 통해 가져와 출력함
		}
		// 열어 놓으면 에러가 생길 가능성이 있기 때문에 닫는다
		kp37_rset.close();// ResultSet 객체 닫기
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close();//데이터베이스 닫기
		
		
		

	}

}
