import java.io.UnsupportedEncodingException;
import java.sql.*;
public class DBTest2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();	// 쿼리 실행을 위한 Statement 객체 생성		
		
		ResultSet kp37_rset = kp37_stmt.executeQuery("select * from examtable;"); //  select 를 통해 examtable 에서 쿼리를 수행하기위해 변수에 담기
		System.out.printf("  이름  학번   국어  영어  수학\n"); //  프린트 출력
		while(kp37_rset.next()) {
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n", //  reset에 값을 담은 것들을 getstring을 통해 가져옴
								kp37_rset.getString(1), kp37_rset.getInt(2),kp37_rset.getInt(3),kp37_rset.getInt(4),kp37_rset.getInt(5));
		}
		kp37_rset.close(); // ResultSet 객체 닫기
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}
