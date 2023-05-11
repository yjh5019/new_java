import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi_insert_info {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement kp37_stmt = kp37_conn.createStatement();		
		
		File kp37_f = new File("C:\\Users\\pc\\���������������ǥ�ص�����Refine.txt");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f));
		
		String kp37_readtxt; // 
		
		if((kp37_readtxt = kp37_br.readLine())==null) {  //  ù��° �ʵ���� ������ ���ٸ� �������̶�� ���
			
			System.out.printf("�� ���� �Դϴ�.\n");  // �ش� ���� ���ٸ� �ش� ���� ���
			return;
		}
		
		String[] kp37_field_name = kp37_readtxt.split("\t"); // �ʵ� �� ������ �迭 string ����
		int kp37_LineCnt=0; //  ������ ���� ���� ���� ���� ����
		
//		stmt.execute("DROP TABLE freewifi;");
		while((kp37_readtxt = kp37_br.readLine())!=null) {
			
			String[] kp37_field = kp37_readtxt.split("\t"); // �� �ʵ带 �� �� �������� ������ �迭�� ����
			String kp37_QueryTxt; //  ���� ���� ������ ����
			
			kp37_QueryTxt = String.format("insert into freewifi("                       // insert�� ���� ���� �����Ŵ�
			        + "inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag," //  ������ ��� ����
			        + "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land," //  ������ ��� ����
			        + "manage_office, manage_office_phone, latitude, longitude, write_date" //  ������ ��� ����
			        + ") values(" 														// ��� �� �����ž�
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s');",
			        kp37_field[0],kp37_field[1],kp37_field[2],kp37_field[3],kp37_field[4],      //�ش� ������ �ε��� ��ȣ�� �°� �ִ´�
			        kp37_field[5],kp37_field[6],kp37_field[7],kp37_field[8],kp37_field[9],      //�ش� ������ �ε��� ��ȣ�� �°� �ִ´�
			        kp37_field[10],kp37_field[11],kp37_field[12],kp37_field[13],kp37_field[14] //�ش� ������ �ε��� ��ȣ�� �°� �ִ´�
			);
			try { //  ����ó��
				kp37_stmt.execute(kp37_QueryTxt); //  ������ ����
				System.out.printf("%d ��° �׸� Insert OK [%s]\n", kp37_LineCnt,kp37_QueryTxt); //  insert �Ϸ�� �ش� ���� ���
				
			}catch(SQLException e) {  //  �ش� ������ ó���ϱ� ���� sql�������� ������ ���ٸ�
				kp37_stmt.execute("ALTER TABLE freewifi MODIFY COLUMN inst_place_detail VARCHAR(500);"); //  �ش� ����� ������ ���� ��ȯ�Ѵ�
			}
			kp37_LineCnt++; //  ī��Ʈ ����
		}
		kp37_br.close(); // BufferedReader ��ü �ݱ�
		kp37_stmt.close(); // Statement ��ü �ݱ�
		kp37_conn.close(); // �����ͺ��̽� �ݱ�
	}

}