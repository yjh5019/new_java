import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Basic_Training_2_Other {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	// MySQL JDBC 드라이버 클래스 로드
        Class.forName("com.mysql.cj.jdbc.Driver");
        // MySQL 데이터베이스에 연결하기 위해 
        Connection conn=DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc");

        // 총 페이지 수 구하기
        // SQL문 실행을 위한 Statement 객체 생성
        Statement count_stmt = conn.createStatement();
        //쿼리 결과를 가져오는 객체
        ResultSet countRs = count_stmt.executeQuery("SELECT COUNT(*) FROM grades");//전체 데이터의 개수를 구하기 위해 COUNT(*) 쿼리를 실행
        countRs.next();
        int totalCount = countRs.getInt(1);
        int numPages = (int) Math.ceil(totalCount / 30.0);//총 페이지 수를 계산, 전체 데이터 개수를 30으로 나누고 올림을 적용
        countRs.close();
        count_stmt.close();

        // 각 페이지마다 출력하기
        for (int i = 0; i < numPages; i++) {
            int offset = i * 30;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT * FROM grades LIMIT 30 OFFSET %d", offset));
            // 페이지 번호를 입력받아 해당 페이지에 해당하는 30개의 행을 가져오는 역할
            // 페이지 번호가 0부터 시작하므로, k4_i 변수가 0일 때는 OFFSET 0으로 첫 번째 페이지를 가져오고,
            // k4_i 변수가 1일 때는 OFFSET 30으로 두 번째 페이지를 가져온다.
            System.out.printf("< 페이지 %d >\n", i + 1);
            System.out.printf("%-10s %-10s %-8s %-8s %-8s %-9s %-10s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균");
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
            System.out.printf("페이지 총점: %d, 페이지 평균: %.2f\n", pageTotal, pageAvg);
            System.out.printf("----------------------------------------------------------------------------------\n");
            rs.close();
            stmt.close();
        }

        // 전체 총점/평균 출력하기
        Statement totalStmt = conn.createStatement();
        ResultSet totalRs = totalStmt.executeQuery("SELECT SUM(kor + eng + mat), AVG(kor + eng + mat) FROM grades");
        totalRs.next();
        int totalSum = totalRs.getInt(1);
        double totalAvg = totalRs.getDouble(2);
        totalRs.close();
        totalStmt.close();
        System.out.printf("전체 총점: %d, 전체 평균: %.2f\n", totalSum, totalAvg);

        conn.close();
    }

}