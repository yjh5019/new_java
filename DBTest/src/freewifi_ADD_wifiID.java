import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
public class freewifi_ADD_wifiID {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		Statement kp37_stmt = kp37_conn.createStatement();		
		
		File kp37_f = new File("C:\\Users\\pc\\���������������ǥ�ص�����Refine.txt"); //  ���� ��������
//		File f = new File("C:\\Users\\pc\\���������������ǥ�ص�����_��¥����2.csv");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); //  ������ ������ �������� �б����� ���۸��� ��ü �����ϰ� ���
		
		String kp37_readtxt; // �о�� �ؽ�Ʈ ���� ����
		
		if((kp37_readtxt = kp37_br.readLine())==null) { //  �о�� ������ ���ٸ� ������ ���
			
			System.out.printf("�� ���� �Դϴ�.\n");
			return;
		}
		
		String[] field_name = kp37_readtxt.split("\t"); // �ʵ� �� ������ �迭 string ����
//		String[] field_name = readtxt.split(","); // �ʵ� �� ������ �迭 string ����
		int kp37_LineCnt=0;
		
//		stmt.execute("DROP TABLE freewifi;");
		while((kp37_readtxt = kp37_br.readLine())!=null) {
			
			String[] kp37_field = kp37_readtxt.split("\t");
//			String[] field = readtxt.split(",");
			String kp37_QueryTxt;
			// insert ������
			// �� �ʵ忡 �ش��ϴ� ������� string format���� ������ string ������ ������ ����
			kp37_QueryTxt = String.format("insert into freewifi("
			        + "wifi_Id,inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
			        + "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
			        + "manage_office, manage_office_phone, latitude, longitude, write_date"
			        + ") values("
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s',"
			        + "'%s','%s','%s','%s','%s','%s');",
			        kp37_field[0],kp37_field[1],kp37_field[2],kp37_field[3],kp37_field[4],
			        kp37_field[5],kp37_field[6],kp37_field[7],kp37_field[8],kp37_field[9],
			        kp37_field[10],kp37_field[11],kp37_field[12],kp37_field[13],kp37_field[14],kp37_field[15]
			);
			try {
				kp37_stmt.execute(kp37_QueryTxt); // ����Ⱥ����� ���� ������ ����
				System.out.printf("%d ��° �׸� Insert OK [%s]\n", kp37_LineCnt,kp37_QueryTxt); // ���� �� ������ Ȯ��
				
			}catch(SQLException e) { //  ����ó�� ������������
				kp37_stmt.execute("ALTER TABLE freewifi MODIFY COLUMN inst_place_detail VARCHAR(500);"); //  ������ ��ٸ� ������ �ٲ� �ٽ� ����
			}
			kp37_LineCnt++; //  ī��Ʈ ����
		}
		kp37_br.close(); // ���� ���� �ݱ�
		kp37_stmt.close(); // Statement ��ü �ݱ�
		kp37_conn.close(); //�����ͺ��̽� ���� �ݱ�
	}

}
