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
            int id = i + 1;
            String name = "Student_" + id;
            int korean = rand.nextInt(101);
            int english = rand.nextInt(101);
            int math = rand.nextInt(101);

            String query = String.format("INSERT INTO scoreTable VALUES ('%s', '%s', '%d', '%d', '%d')", id, name, korean, english, math);
            stmt.execute(query);
        }
		
		stmt.close();
		conn.close();
	}

}

