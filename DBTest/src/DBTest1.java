import java.io.UnsupportedEncodingException;
import java.sql.*;
public class DBTest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();
//		stmt.execute("CREATE TABLE examtable1(" +
//	             "name VARCHAR(20), " +
//	             "studentid INT NOT NULL PRIMARY KEY, " +
//	             "kor INT, " +
//	             "eng INT, " +
//	             "mat INT) " +
//	             "DEFAULT CHARSET=utf8;");
		
		
//		stmt.execute("delete from examtable;");
		
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('ȿ��',209901,95,100,95);"  );
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����',209902,95,95,95);"  );
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����',209903,100,100,100);"  );
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����',209904,100,95,90);"  );
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('�ҿ�',209905,90,80,80);"  );
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('ť��',209906,100,95,80);"  );
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('ȭ��',209907,70,70,70);"  );
		
		
//		ResultSet rset = stmt.executeQuery("select * from examtable;");
//		System.out.printf("  �̸�  �й�  ����  ����  ����\n");
//		while(rset.next()) {
//			System.out.printf("%4s  %6s  %3d  %3d  %3d \n",
//								rset.getString(1), rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
//		}
//		rset.close();
		stmt.close();
		conn.close();
	}

}
