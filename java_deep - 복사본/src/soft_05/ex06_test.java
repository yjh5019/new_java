package soft_05;
public class ex06_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 달력 인쇄
	      int k10_iWeekday = 5; // 요일에따라 값이 달라지는 변수 iWeekday 5로 초기화
	      // 각 달마다 마지막 날을 넣은 배열 iEnd 초기화
	      int[] k10_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	      for (int k10_iMon = 0; k10_iMon < 12; k10_iMon++) { // iMon이 0부터 11까지 1씩 증가하며 작동하는 반복문 실행
	         System.out.printf("\n\n        %2d월\n", k10_iMon + 1); // 월 출력
	         System.out.printf("=====================\n"); // ================= 출력
	         System.out.printf(" 일 월 화 수 목 금 토\n"); // 요일 출력
	         for (int k10_j = 1; k10_j <= k10_iWeekday; k10_j++) { // Weekday의 카운트에 따라 공백을 출력하는 for문
	            System.out.printf("%3s", " "); // 공백 출력
	         }
	         
	         // iMon이 x일때, iEnd의 iEnd[x]번째에 있는 숫자 y가 있다고 치면
	         // i가 1부터 y까지 1씩 증가하며 작동하는 반복문 실행 
	         for (int k10_i = 1; k10_i <= k10_iEnd[k10_iMon]; k10_i++) {
	            System.out.printf("%3d", k10_i); // 요일 출력
	            k10_iWeekday++; // iWeekday 1씩 증가
	            if (k10_iWeekday % 7 == 0) { // iWeekday가 7이라면 
	               System.out.println(); // 개행
	               k10_iWeekday = 0; // 개행 후 iWeekday 0으로 초기화
	            }
	         }
	      }
	}

}
