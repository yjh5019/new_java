import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class StockDailyPrice_Insert_kopo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // ����̹� �ε�
		Connection kp37_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");//�����ͺ��̽� ����
		Statement kp37_stmt = kp37_conn.createStatement();	 // ���� ������ ���� Statement ��ü ����	
		
		String kp37_QueryTxt = "insert into StockDailyPrice2(" + "Code," + "Date," + "OpenPrice," + "HighPrice," + "LowPrice,"
				+ "ClosePrice," + "Volume," + "Transaction_Amount)" + "values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement kp37_pstmt = kp37_conn.prepareStatement(kp37_QueryTxt); // PreparedStatement ��ü ���������� �Ű������� �� �ڸ���?�� ����Ͽ� SQL ������ �ۼ�
		
		File kp37_f = new File("C:\\Users\\pc\\StockDailyPrice.csv"); // ���� ��������
//		File f = new File("C:\\Users\\pc\\���������������ǥ�ص�����_��¥����2.csv");
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); //  ������ ������  BufferedReader�� �ش� ������ �б�
		
		String kp37_readtxt; //  �о�� ������ ���� ����
		SimpleDateFormat k37_sdt = new SimpleDateFormat("HH:mm:ss");
		 // �ش� ���� ���ٸ� �ش� ���� ���
//		if((kp37_readtxt = kp37_br.readLine())==null) {
//			
//			System.out.printf("�� ���� �Դϴ�.\n");
//			return;
//		}
//		String[] field_name = kp37_readtxt.split(","); // �ʵ� �� ������ �迭 string ���� ,�� �������� ����
//		String[] field_name = readtxt.split(","); // �ʵ� �� ������ �迭 string ����
		int kp37_LineCnt=0; //  ������ ���� ���� ���� ���� ����
		kp37_conn.setAutoCommit(false); //  ����Ŀ���� false�� ����
		long startTime = System.currentTimeMillis(); //  �۾� ���۽� start time ���
        Calendar start = new GregorianCalendar();
        String startTime1 = k37_sdt.format(start.getTime());
		while((kp37_readtxt = kp37_br.readLine())!=null) {
			
			String[] kp37_field = kp37_readtxt.split(",");
//			String[] field = readtxt.split(",");
			kp37_pstmt.setString(1, kp37_field[2]); //  ù��° ? �� 3��° �ʵ� ������ �ִ´�
			kp37_pstmt.setString(2, kp37_field[1]); //  �ι�° ? �� 2��° �ʵ� ������ �ִ´�
			kp37_pstmt.setString(3, kp37_field[4]); //  ����° ? �� 5��° �ʵ� ������ �ִ´�
			kp37_pstmt.setString(4, kp37_field[5]); //  �׹�° ? �� 6��° �ʵ� ������ �ִ´�
			kp37_pstmt.setString(5, kp37_field[6]); //  �ټ���° ? �� 7��° �ʵ� ������ �ִ´�
			kp37_pstmt.setString(6, kp37_field[3]); //  ������° ? �� 4��° �ʵ� ������ �ִ´�
			kp37_pstmt.setString(7, kp37_field[11]); //  �ϰ���° ? �� 12��° �ʵ� ������ �ִ´�
			kp37_pstmt.setString(8, kp37_field[12]); //  ������° ? �� 13��° �ʵ� ������ �ִ´�
			
			kp37_pstmt.addBatch(); //  SQL ���� ��ġ�� ĳ�ÿ� �߰��ϴ� �޼ҵ�, ĳ�ÿ� sql ��ɹ� ���
			kp37_pstmt.clearParameters(); //  �ش� ��ɹ��� �ʱ�ȭ �ϰ� while���� ���� �ٽ� ���ο� ���� �޾ƿ´�
			kp37_LineCnt++;
			try {
				if(kp37_LineCnt%50000 == 0) { //  10000��° ��� �ش� �����Ͱ� �� ������ Ȯ��
					System.out.printf("%d��° �׸� Insert OK\n", kp37_LineCnt);
					kp37_pstmt.executeBatch(); //executeBatch() �޼���� addBatch()�� ����Ͽ� ��ġ�� �߰��� SQL ��ɹ��� ����
					kp37_conn.commit(); //  ������� ����� �������� Ȯ�� ���� ��ɾ�
					}
			}catch(Exception e) { //  ���� try catch 
				e.printStackTrace(); // ���ܰ� �߻��� ������ ���� ������ ����ϴ� �޼ҵ�
			}
		}
		try {
			kp37_pstmt.executeBatch(); //executeBatch() �޼���� addBatch()�� ����Ͽ� ��ġ�� �߰��� SQL ��ɹ��� ����
			
		}catch(Exception e) {
		    e.printStackTrace(); // ���ܰ� �߻��� ������ ���� ������ ����ϴ� �޼ҵ�
		}
		kp37_conn.commit(); //  ������� ����� �������� Ȯ�� ���� ��ɾ�
		kp37_conn.setAutoCommit(true); //  ����Ŀ�� true �� ����
		long kp37_endTime = System.currentTimeMillis(); //  �ش� �۾� �Ϸ�� �ð� ���
		Calendar end = new GregorianCalendar();
        String endTime1 = k37_sdt.format(end.getTime());
		System.out.printf("Insert End\n"); //  �ش� �۾� �Ϸ�� ���
		System.out.printf("total : %d\n",kp37_LineCnt);  //  �� �������� ���� 
		System.out.printf("start time : %d\n",startTime1); // ���� �ð�
		System.out.printf("end time : %d\n",endTime1); // �۾� �Ϸ�ð�
		System.out.printf("time : %dms\n",kp37_endTime-startTime); //  �� �ɸ��ð��� ms�� ���

		kp37_br.close(); // 
		kp37_pstmt.close(); // 
		kp37_conn.close(); // �����ͺ��̽� �ݱ�
	}

}

