import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Basic_Training_2_Other {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	// MySQL JDBC ����̹� Ŭ���� �ε�
        Class.forName("com.mysql.cj.jdbc.Driver");
        // MySQL �����ͺ��̽��� �����ϱ� ���� 
        Connection conn=DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");

        // �� ������ �� ���ϱ�
        // SQL�� ������ ���� Statement ��ü ����
        Statement count_stmt = conn.createStatement();
        //���� ����� �������� ��ü
        ResultSet countRs = count_stmt.executeQuery("SELECT COUNT(*) FROM grades");//��ü �������� ������ ���ϱ� ���� COUNT(*) ������ ����
        countRs.next();
        int totalCount = countRs.getInt(1);
        int numPages = (int) Math.ceil(totalCount / 30.0);//�� ������ ���� ���, ��ü ������ ������ 30���� ������ �ø��� ����
        countRs.close();
        count_stmt.close();

        // �� ���������� ����ϱ�
        for (int i = 0; i < numPages; i++) {
            int offset = i * 30;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT * FROM grades LIMIT 30 OFFSET %d", offset));
            // ������ ��ȣ�� �Է¹޾� �ش� �������� �ش��ϴ� 30���� ���� �������� ����
            // ������ ��ȣ�� 0���� �����ϹǷ�, k4_i ������ 0�� ���� OFFSET 0���� ù ��° �������� ��������,
            // k4_i ������ 1�� ���� OFFSET 30���� �� ��° �������� �����´�.
            System.out.printf("< ������ %d >\n", i + 1);
            System.out.printf("%-10s %-10s %-8s %-8s %-8s %-9s %-10s\n", "�й�", "�̸�", "����", "����", "����", "����", "���");
            int pageTotal = 0;
            while (rs.next()) {
            	int studentId = rs.getInt("student_id");
                String name = rs.getString("name");
                int kor = rs.getInt("kor");
                int eng = rs.getInt("eng");
                int mat =rs.getInt("mat");
                int sum = kor + eng + mat;
                double avg = sum / 3.0;
                System.out.printf("%-10d %-15s %-10d %-10d %-10d %-10d %-10.2f\n", studentId, name, kor, eng, mat, sum, avg);
                pageTotal += sum;
            }
            double pageAvg = pageTotal / 30.0;
            System.out.printf("������ ����: %d, ������ ���: %.2f\n", pageTotal, pageAvg);
            System.out.printf("----------------------------------------------------------------------------------\n");
            rs.close();
            stmt.close();
        }

        // ��ü ����/��� ����ϱ�
        Statement totalStmt = conn.createStatement();
        ResultSet totalRs = totalStmt.executeQuery("SELECT SUM(kor + eng + mat), AVG(kor + eng + mat) FROM grades");
        totalRs.next();
        int totalSum = totalRs.getInt(1);
        double totalAvg = totalRs.getDouble(2);
        totalRs.close();
        totalStmt.close();
        System.out.printf("��ü ����: %d, ��ü ���: %.2f\n", totalSum, totalAvg);

        conn.close();
    }

}