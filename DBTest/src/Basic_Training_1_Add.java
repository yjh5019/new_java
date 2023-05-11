import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class Basic_Training_1_Add {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//�����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();		// ���� ������ ���� Statement ��ü ����	
		
		File kp37_f = new File("C:\\Users\\pc\\��������������ǥ�ص�����2 - ���纻.txt"); //  ���� ��������
//		File f = new File("C:\\Users\\pc\\���������������ǥ�ص�����_��¥����2.csv");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); //  ���� �б�
		
		String kp37_readtxt;//  �о�� ������ ���� ����
		
		if((kp37_readtxt = kp37_br.readLine())==null) {
			
			System.out.printf("�� ���� �Դϴ�.\n");  // �ش� ���� ���ٸ� �ش� ���� ���
			return;
		}
		 
		String[] kp37_field_name = kp37_readtxt.split("\t"); // �ʵ� �� ������ �迭 string ���� �Ǹ� �������� ����
//		String[] field_name = readtxt.split(","); // �ʵ� �� ������ �迭 string ����
		int kp37_LineCnt=0; //  ī��Ʈ ����
		while((kp37_readtxt = kp37_br.readLine())!=null) { //  ���پ� �о� �ðž�
			
			String[] kp37_field = kp37_readtxt.split("\t"); //�Ǹ� �������� ����
//			String[] field = readtxt.split(",");
			String kp37_QueryTxt;
			kp37_QueryTxt = String.format("insert into parkingTable("   // 
			        + "Parking_Management_Number,Parking_Lot_Name, Road_Address, Parcel_Address, Number_of_Parking_Spaces, Operating_Days,"
			        + "Weekday_Operating_Start_Time, Weekday_Operating_End_Time, Fee_Information, Latitude, Longitude,"
			        + "Providing_Agency_Name, write_date, NUM"
			        + ") values("
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s');",
			        kp37_field[0],kp37_field[1],kp37_field[4],kp37_field[5],kp37_field[6],
			        kp37_field[9],kp37_field[10],kp37_field[11],kp37_field[16],kp37_field[28],
			        kp37_field[29],kp37_field[32],kp37_field[30],kp37_field[33]
			);
			try {
				kp37_stmt.execute(kp37_QueryTxt);  // ������ ����
				System.out.printf("%d ��° �׸� Insert OK [%s]\n", kp37_LineCnt,kp37_QueryTxt); //  �ش� ������ ���� �� ���
				
			}catch(SQLException e) { //  ����ó�� 
				kp37_stmt.execute("ALTER TABLE parkingTable MODIFY COLUMN Road_Address VARCHAR(500);"); // Road_Address�� ������ ���� ��ȯ
			}
			kp37_LineCnt++; //  ī��Ʈ ����
		}
		kp37_br.close(); //  BufferedReader ��ü �ݱ�
		kp37_stmt.close();// Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}

