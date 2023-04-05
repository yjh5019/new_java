package soft_05;

public class ex06 {

    public static void main(String[] args) {
        int kopo37_iWeekday = 5; // 1월 시작 요일
        int[] kopo37_iEnd = {31,29,31,30,31,30,31,31,30,31,30,31};
        //이중 반복문을 통해 프로그램 작성
        for(int kopo_37_iMon=0; kopo_37_iMon<12; kopo_37_iMon++) { // 1월~12월까지 출력
            System.out.printf("\n\n        %2d월\n",kopo_37_iMon+1); // 월 출력
            System.out.printf("============================\n");
            System.out.printf("   일  월  화   수   목  금  토\n"); // 요일 출력
            
            for(int kopo37_j=1; kopo37_j<=kopo37_iWeekday; kopo37_j++) { //1월은 금요일 부터 1일이 시작됨으로 빈칸인 iWeekday=5는 빈칸으로 작성
                System.out.printf("%4s", " "); // 공백
            }
            
            for(int kopo37_i=1; kopo37_i<=kopo37_iEnd[kopo_37_iMon]; kopo37_i++) { // 공백작성 후 위에서 언급한 마지막일수를 반복문을 통해 출력
                System.out.printf("%4d",kopo37_i); // 각 일자를 출력
                kopo37_iWeekday++; // 1씩 증가
                //개행 조건문 작성
                if (kopo37_iWeekday % 7 == 0) { // iWeekday가 7이라면 
                    System.out.println(); // 개행 줄바꿈
                    kopo37_iWeekday = 0; // 개행 후 iWeekday 0으로 초기화
                }
            }
        }
    }
}