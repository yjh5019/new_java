import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Basic_Training_2_Other {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //  mysql ����̹� �ε�
        Connection kp37_conn=DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); // �����ͺ��̽��� ����

        // �� ������ �� ���ϱ�
        Statement kp37_count_stmt = kp37_conn.createStatement(); // SQL�� ������ ���� Statement ��ü ����
        //���� ����� �������� ��ü
        ResultSet kp37_countRs = kp37_count_stmt.executeQuery("SELECT COUNT(*) FROM grades");//��ü �������� ������ ���ϱ� ���� COUNT(*) ������ ����
        kp37_countRs.next();
        int kp37_totalCount = kp37_countRs.getInt(1);
        int kp37_numPages = (int) Math.ceil(kp37_totalCount / 30.0);//�� ������ ���� ���, ��ü ������ ������ 30���� ������ �ø��� ����
        kp37_countRs.close();
        kp37_count_stmt.close();
        Calendar calt = Calendar.getInstance();
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        // �� ���������� ����ϱ�
        for (int i = 0; i < kp37_numPages; i++) {
            int kp37_offset = i * 30; //  offset�� ���� 30���� �����;� ����ϴ� �������� �ۼ��Ұ���
            Statement kp37_stmt = kp37_conn.createStatement();
            ResultSet kp37_readtxt = kp37_stmt.executeQuery(String.format("SELECT * FROM grades LIMIT 30 OFFSET %d", kp37_offset)); //  ������ �ۼ�
            // ���⼭ limit�� �޾ƿ� �������� ������ �����Ѱ��̰�, offset�� �ش� �����Ϳ��� �����ϴ� ��
            // ������ ��ȣ�� �Է¹޾� �ش� �������� �ش��ϴ� 30���� ���� �������� ����
            // ������ ��ȣ�� 0���� �����ϹǷ�, k4_i ������ 0�� ���� OFFSET 0���� ù ��° �������� ��������,
            // k4_i ������ 1�� ���� OFFSET 30���� �� ��° �������� �����´�.
//            System.out.printf("< ������ %d >\n", i + 1);
            System.out.printf("PAGE : %d                                     ��� ����   %15s\n",i + 1, k37_sdt.format(calt.getTime()));
            System.out.printf("=============================================================================\n");
            System.out.printf("%-10s %-10s %-8s %-8s %-8s %-9s %-10s\n", "�й�", "�̸�", "����", "����", "����", "����", "���");
            System.out.printf("=============================================================================\n");
            int kp37_pageTotal = 0;
            while (kp37_readtxt.next()) {  // ���� �о����
            	int studentId = kp37_readtxt.getInt("student_id"); // �ش� �����͸� int�� �޾ƿ� studentid�� ����
                String name = kp37_readtxt.getString("name"); // �ش� �����͸� String�� �޾ƿ� name�� ����
                int kp37_kor = kp37_readtxt.getInt("kor"); // �ش� �����͸� int�� �޾ƿ� kor�� ����
                int kp37_eng = kp37_readtxt.getInt("eng"); // �ش� �����͸� int�� �޾ƿ� eng�� ����
                int kp37_mat =kp37_readtxt.getInt("mat"); // �ش� �����͸� int�� �޾ƿ� mat�� ����
                int kp37_sum = kp37_kor + kp37_eng + kp37_mat; // �ش� �����͸� int�� �޾ƿ� sum�� ����
                double avg = kp37_sum / 3.0; // �հ踦 3���� ���� ����� ���� --> double ������ ����
                System.out.printf("%-10d %-15s %-10d %-10d %-10d %-10d %-10.2f\n", studentId, name, kp37_kor, kp37_eng, kp37_mat, kp37_sum, avg); //  �ش� ���� ���
                kp37_pageTotal += kp37_sum; //  �������� �� �հ踦 ���ϱ� ���� ������ ����
            }
            double pageAvg = kp37_pageTotal / 30.0; //  �������� �� �հ��� ���
            System.out.printf("=============================================================================\n");
            System.out.printf("���� ������\n");
            System.out.printf("������ ����: %d\n", kp37_pageTotal);
            System.out.printf("������ ���: %.2f\n", pageAvg);
//            System.out.printf("===================================================================\n");
            kp37_readtxt.close(); //  ���о����� �ݱ�
            kp37_stmt.close(); //  ��ü �ݱ�
        }

        // ��ü ����/��� ����ϱ�
        Statement kp37_totalStmt = kp37_conn.createStatement(); // SQL�� ������ ���� Statement ��ü ����
        ResultSet kp37_totalreadtxt = kp37_totalStmt.executeQuery("SELECT SUM(kor + eng + mat), AVG(kor + eng + mat) FROM grades"); // �ش� ������ ����
        kp37_totalreadtxt.next(); // next �޼��带 �̿��� �ش� ���� ����
        int totalSum = kp37_totalreadtxt.getInt(1); //  �հ� ��������
        double totalAvg = kp37_totalreadtxt.getDouble(2); // ��� ��������
        kp37_totalreadtxt.close(); // 
        kp37_totalStmt.close(); // 
        System.out.printf("=============================================================================\n");
        System.out.printf("���� ������\n");
        System.out.printf("���� ����: %d\n", totalSum);
        System.out.printf("���� ���: %.2f\n", totalAvg);
        System.out.println();

        kp37_conn.close(); //  ������ �߻������ʱ� ���� ������� 
    }

}