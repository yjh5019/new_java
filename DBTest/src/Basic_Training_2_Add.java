import java.sql.*;
import java.util.Random;
public class Basic_Training_2_Add {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		
		Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int student_id = i + 1;
            String name = "Student_" + student_id;
            int kor = rand.nextInt(101);
            int eng = rand.nextInt(101);
            int mat = rand.nextInt(101);

            String query = String.format("INSERT INTO grades VALUES ('%s', '%s', '%d', '%d', '%d')", student_id, name, kor, eng, mat);
            stmt.execute(query);
        }
		
		stmt.close();
		conn.close();
	}

}

