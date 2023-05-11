import java.io.UnsupportedEncodingException;
import java.sql.*;
public class DBTest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// 드라이버 로드
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//데이터베이스 연결
		Statement kp37_stmt = kp37_conn.createStatement();// 쿼리 실행을 위한 Statement 객체 생성	
		// 테이블을 생성하는 쿼리문 작성
//		kp37_stmt.execute("CREATE TABLE examtable1(" +  //  examtable1 을 만들고
//	             "name VARCHAR(20), " +               // 이름을 문자형(20)으로
//	             "studentid INT NOT NULL PRIMARY KEY, " + //  학번을 프라이머리 키로 지정 정수형 변수
//	             "kor INT, " +                            //  국어 
//	             "eng INT, " +                            //	영어
//	             "mat INT) " +                            //	수학
//	             "DEFAULT CHARSET=utf8;");                            // utf8로 설정
		
		
//		kp37_stmt.execute("delete from examtable1;"); //  만든 테이블 삭제
		// 만들어 놓은 테이블 형식에 각각의 데이터를 넣는다
		//쿼리문 실행
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('효민',209901,95,100,95);"  ); // insert를 이용해 examtable에 각각의 데이터 값을 넣는다
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('보람',209902,95,95,95);"  ); // insert를 이용해 examtable에 각각의 데이터 값을 넣는다
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('은정',209903,100,100,100);"  ); // insert를 이용해 examtable에 각각의 데이터 값을 넣는다
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('지연',209904,100,95,90);"  ); // insert를 이용해 examtable에 각각의 데이터 값을 넣는다
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('소연',209905,90,80,80);"  ); // insert를 이용해 examtable에 각각의 데이터 값을 넣는다
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('큐리',209906,100,95,80);"  ); // insert를 이용해 examtable에 각각의 데이터 값을 넣는다
//		kp37_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('화영',209907,70,70,70);"  ); // insert를 이용해 examtable에 각각의 데이터 값을 넣는다
		
		
		ResultSet rset = kp37_stmt.executeQuery("select * from examtable1;"); //  select 문을 통해 해당 테이블의 쿼리
		System.out.printf("  이름  학번  국어  영어  수학\n"); //  각 항목 출력
		while(rset.next()) {									// 각 항목을 출력
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n",
								rset.getString(1), rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5)); //  해당 데이터 값을 getString을 통해 받아온다
		}
		rset.close(); // ResultSet 객체 닫기
		kp37_stmt.close();// Statement 객체 닫기
		kp37_conn.close(); //데이터베이스 연결 닫기
	}

}
