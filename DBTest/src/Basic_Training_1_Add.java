import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1_Add {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement stmt = conn.createStatement();		
		
		File f = new File("C:\\Users\\pc\\��������������ǥ�ص�����1.txt");
//		File f = new File("C:\\Users\\pc\\���������������ǥ�ص�����_��¥����2.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		
		if((readtxt = br.readLine())==null) {
			
			System.out.printf("�� ���� �Դϴ�.\n");
			return;
		}
		
		String[] field_name = readtxt.split("\t"); // �ʵ� �� ������ �迭 string ����
//		String[] field_name = readtxt.split(","); // �ʵ� �� ������ �迭 string ����
		int LineCnt=0;
		
//		stmt.execute("DROP TABLE freewifi;");
		while((readtxt = br.readLine())!=null) {
			
			String[] field = readtxt.split("\t");
//			String[] field = readtxt.split(",");
			String QueryTxt;
			QueryTxt = String.format("insert into parkingTable("
			        + "Parking_Management_Number,Parking_Lot_Name, Road_Address, Parcel_Address, Number_of_Parking_Spaces, Operating_Days,"
			        + "Weekday_Operating_Start_Time, Weekday_Operating_End_Time, Fee_Information, Latitude, Longitude,"
			        + "Providing_Agency_Name, write_date, NUM"
			        + ") values("
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s');",
			        field[0],field[1],field[4],field[5],field[6],
			        field[9],field[10],field[11],field[16],field[28],
			        field[29],field[32],field[30],field[33]
			);
			try {
				stmt.execute(QueryTxt);
				System.out.printf("%d ��° �׸� Insert OK [%s]\n", LineCnt,QueryTxt);
				
			}catch(SQLException e) {
				stmt.execute("ALTER TABLE parkingTable MODIFY COLUMN Road_Address VARCHAR(500);");
			}
			LineCnt++;
		}
		br.close();
		stmt.close();
		conn.close();
	}

}

