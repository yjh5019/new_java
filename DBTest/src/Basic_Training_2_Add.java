import java.sql.*;
import java.util.Random;
public class Basic_Training_2_Add {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");// 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); //  데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();	 //  쿼리문을 수행하기위해 statment 객체 생성 후 변수 저장		
		
		Random kp37_rand = new Random(); //  랜덤으로 학생 성적을 입력하기 위해 랜던 객체 생성
        for (int kp37_i = 0; kp37_i < 1000; kp37_i++) {
            int kp37_student_id = kp37_i + 1; //  학번
            String name = "Student_" + kp37_student_id; //  이름
            int kor = kp37_rand.nextInt(101); //  국어
            int eng = kp37_rand.nextInt(101); // 영어
            int mat = kp37_rand.nextInt(101); //  수학

            String kp37_query = String.format("INSERT INTO grades VALUES ('%s', '%s', '%d', '%d', '%d')", kp37_student_id, name, kor, eng, mat); // 각 데이터를 넣기 위해 쿼리문 수행
            kp37_stmt.execute(kp37_query); //  위의 쿼리문 실행
        }
		
        kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}

