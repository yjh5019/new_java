import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class StockDailyPrice_INSERT {

	private static final int BATCH_SIZE = 10000;
	// 10000���� �޸𸮿� �����ؼ� �ѹ��� database�� �ֱ����� ��������

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
//		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234"); 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		// ���۽ð��� ������ �ð��� �����ϱ� ���� DateFormat ����
		SimpleDateFormat k37_sdt = new SimpleDateFormat("HH:mm:ss");
		kp37_conn.setAutoCommit(false); // disable auto-commit

		PreparedStatement pstmt = kp37_conn.prepareStatement(
				"insert into StockDailyPrice(" + "Code," + "Date," + "OpenPrice," + "HighPrice," + "LowPrice,"
						+ "ClosePrice," + "Volume," + "Transaction_Amount)" + "values(?,?,?,?,?,?,?,?)");
		// JDBC�� �Է��� PreparedStatement ��ü�� ����
		
		File kp37_f = new File("C:\\Users\\pc\\StockDailyPrice.txt"); // ������ �о����
		BufferedReader br = new BufferedReader(new FileReader(kp37_f));
		// �о�� ������ BufferedReader�� �б�
		String kp37_readtxt; // ������ ���پ� ������ ���� ����


		if((kp37_readtxt = br.readLine())==null) {
			
			System.out.printf("�� ���� �Դϴ�.\n");
			return;
		}
		// ���� �ҷ��������� ù���� �о����� ���̶�� �������Դϴٸ� ����ϸ鼭 ����
		
		Date date_start = new Date(System.currentTimeMillis()); // ���۽ð� ����
	
		String date_startdf = formatter.format(date_start); // ���۽ð��� DateFormat���·� ����

		int kp37_lineCnt = 1;  // Line�� ������ ���� ����
		int kp37_batchCnt = 0; // 10000���� �޸𸮿� �����ؼ� �ѹ��� database�� �ֱ����� ��������
		System.out.println();
		
		while ((kp37_readtxt = br.readLine()) != null) { // ���پ� �о���鼭 ���� ������������ �ݺ�
			String[] field = kp37_readtxt.split("\t");
			// field������ csv�� �����Ա� ������ ,������ �迭�� ����
			String dateyear = field[0].substring(0, 4);
			String datemonth = field[0].substring(4, 6);
			String dateday = field[0].substring(6, 8);
			String date = dateyear + "-" + datemonth + "-" + dateday;
			// mysql�� date�������� ��ȯ�ϱ����ؼ� 20230509 �̷������� �� date��
			// 2023-05-09�������� ��ȯ
			//  �ش� �����͸� ��������
			pstmt.setString(1, field[1]); //  �ش� �����͸� ��������
			pstmt.setString(2, date);
			pstmt.setString(3, field[2]);
			pstmt.setString(4, field[3]);
			pstmt.setString(5, field[4]);
			pstmt.setString(6, field[5]);
			pstmt.setString(7, field[10]);
			pstmt.setString(8, field[11]);
			// PreparedStatement��ü�� ?������ ������� ä����
			pstmt.addBatch(); // ����pstmt�� batch�� �߰�

			if (++kp37_batchCnt % BATCH_SIZE == 0) {
				pstmt.executeBatch();
				kp37_conn.commit();
				System.out.printf("%d-%d��° �׸� Insert OK\n", kp37_lineCnt - BATCH_SIZE + 1, kp37_lineCnt);
			}
			// batch�� 10000���϶� database�� ������ ��ŭ �������� ���

			kp37_lineCnt++;// ������ �����Ҷ����� 1���߰�
		}


		if (kp37_batchCnt % BATCH_SIZE != 0) {
			pstmt.executeBatch(); 
			kp37_conn.commit();
			System.out.printf("%d-%d��° �׸� Insert OK\n", kp37_lineCnt - kp37_batchCnt % BATCH_SIZE,kp37_lineCnt - 1); 
		}
		// batch�� 10000���� �����߱� ������ ���� ������ ����
		


		Date date_end = new Date(System.currentTimeMillis()); // �������� �����ð� ����
		String date_enddf = formatter.format(date_end); // �����ð��� DateFormat�� �°� ����
		k37_sdt.format(calt.getTime())
		System.out.println("���۽ð� : " + date_startdf);
		System.out.println("�����ð� : " + date_enddf);
		System.out.println("ó������ : " + (kp37_lineCnt - 1));
		// ���۽ð�, �����ð�, ó���� ���� ���
		
		br.close();	// BufferedReader�ݱ�
		pstmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
		kp37_conn.close(); // ������ �߻������ʱ� ���� ������� 
	}
}
