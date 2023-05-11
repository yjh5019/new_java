import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); //  데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement(); //  쿼리문을 수행하기위해 statment 객체 생성 후 변수 저장
		kp37_stmt.execute("DROP TABLE grades;");
		// 성적 테이블 만들기
		kp37_stmt.execute("CREATE TABLE grades (" +
				"student_id INT NOT NULL PRIMARY KEY , " + // 주차장관리번호 0
                "name VARCHAR(50) NOT NULL, " + // 주차장명 1
                "kor INT, " + // 소재지도로명주소 4
                "eng INT, " + // 소재지지번주소  5
                "mat INT " + // 주차구획수  6
                ") DEFAULT CHARSET=utf8" //  utf 8로 변환
        );
		
		
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기;
	}

}




