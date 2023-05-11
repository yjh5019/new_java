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
        Class.forName("com.mysql.cj.jdbc.Driver"); //  mysql 드라이버 로드
        Connection kp37_conn=DriverManager.getConnection("jdbc:mysql://192.168.23.229:33060/kopo37","root","kopoctc"); // 데이터베이스에 연결

        // 총 페이지 수 구하기
        Statement kp37_count_stmt = kp37_conn.createStatement(); // SQL문 실행을 위한 Statement 객체 생성
        //쿼리 결과를 가져오는 객체
        ResultSet kp37_countRs = kp37_count_stmt.executeQuery("SELECT COUNT(*) FROM grades");//전체 데이터의 개수를 구하기 위해 COUNT(*) 쿼리를 실행
        kp37_countRs.next();
        int kp37_totalCount = kp37_countRs.getInt(1);
        int kp37_numPages = (int) Math.ceil(kp37_totalCount / 30.0);//총 페이지 수를 계산, 전체 데이터 개수를 30으로 나누고 올림을 적용
        kp37_countRs.close();
        kp37_count_stmt.close();
        Calendar calt = Calendar.getInstance();
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        // 각 페이지마다 출력하기
        for (int i = 0; i < kp37_numPages; i++) {
            int kp37_offset = i * 30; //  offset을 통해 30개의 데이터씩 출력하는 쿼리문을 작성할것임
            Statement kp37_stmt = kp37_conn.createStatement();
            ResultSet kp37_readtxt = kp37_stmt.executeQuery(String.format("SELECT * FROM grades LIMIT 30 OFFSET %d", kp37_offset)); //  쿼리문 작성
            // 여기서 limit는 받아올 데이터의 갯수를 지정한것이고, offset은 해당 데이터에서 시작하는 것
            // 페이지 번호를 입력받아 해당 페이지에 해당하는 30개의 행을 가져오는 역할
            // 페이지 번호가 0부터 시작하므로, k4_i 변수가 0일 때는 OFFSET 0으로 첫 번째 페이지를 가져오고,
            // k4_i 변수가 1일 때는 OFFSET 30으로 두 번째 페이지를 가져온다.
//            System.out.printf("< 페이지 %d >\n", i + 1);
            System.out.printf("PAGE : %d                                     출력 일자   %15s\n",i + 1, k37_sdt.format(calt.getTime()));
            System.out.printf("=============================================================================\n");
            System.out.printf("%-10s %-10s %-8s %-8s %-8s %-9s %-10s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균");
            System.out.printf("=============================================================================\n");
            int kp37_pageTotal = 0;
            while (kp37_readtxt.next()) {  // 파일 읽어오기
            	int studentId = kp37_readtxt.getInt("student_id"); // 해당 데이터를 int로 받아와 studentid에 저장
                String name = kp37_readtxt.getString("name"); // 해당 데이터를 String로 받아와 name에 저장
                int kp37_kor = kp37_readtxt.getInt("kor"); // 해당 데이터를 int로 받아와 kor에 저장
                int kp37_eng = kp37_readtxt.getInt("eng"); // 해당 데이터를 int로 받아와 eng에 저장
                int kp37_mat =kp37_readtxt.getInt("mat"); // 해당 데이터를 int로 받아와 mat에 저장
                int kp37_sum = kp37_kor + kp37_eng + kp37_mat; // 해당 데이터를 int로 받아와 sum에 저장
                double avg = kp37_sum / 3.0; // 합계를 3으로 나눠 평균을 구함 --> double 형으로 저장
                System.out.printf("%-10d %-15s %-10d %-10d %-10d %-10d %-10.2f\n", studentId, name, kp37_kor, kp37_eng, kp37_mat, kp37_sum, avg); //  해당 값들 출력
                kp37_pageTotal += kp37_sum; //  페이지별 총 합계를 구하기 위해 변수에 저장
            }
            double pageAvg = kp37_pageTotal / 30.0; //  페이지별 총 합계의 평균
            System.out.printf("=============================================================================\n");
            System.out.printf("현재 페이지\n");
            System.out.printf("페이지 총점: %d\n", kp37_pageTotal);
            System.out.printf("페이지 평균: %.2f\n", pageAvg);
//            System.out.printf("===================================================================\n");
            kp37_readtxt.close(); //  다읽었으면 닫기
            kp37_stmt.close(); //  객체 닫기
        }

        // 전체 총점/평균 출력하기
        Statement kp37_totalStmt = kp37_conn.createStatement(); // SQL문 실행을 위한 Statement 객체 생성
        ResultSet kp37_totalreadtxt = kp37_totalStmt.executeQuery("SELECT SUM(kor + eng + mat), AVG(kor + eng + mat) FROM grades"); // 해당 쿼리문 수행
        kp37_totalreadtxt.next(); // next 메서드를 이용해 해당 쿼리 수행
        int totalSum = kp37_totalreadtxt.getInt(1); //  합계 가져오기
        double totalAvg = kp37_totalreadtxt.getDouble(2); // 평균 가져오기
        kp37_totalreadtxt.close(); // 
        kp37_totalStmt.close(); // 
        System.out.printf("=============================================================================\n");
        System.out.printf("누적 페이지\n");
        System.out.printf("누적 총점: %d\n", totalSum);
        System.out.printf("누적 평균: %.2f\n", totalAvg);
        System.out.println();

        kp37_conn.close(); //  에러가 발생하지않기 위해 연결끊기 
    }

}