package soft_05;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이중반복문을 통해 구구단 작성
		for(int kopo37_i=1; kopo37_i<10; kopo37_i=kopo37_i+3) { // 좌우로 출력할껀데 1단,4단, 7단으로 출력
			System.out.printf("****************\t****************\t****************\t\n");
			System.out.printf("구구단 %d 단	\t구구단 %d 단	\t구구단 %d 단	\t\n",kopo37_i,kopo37_i+1,kopo37_i+2); 
			System.out.printf("****************\t****************\t****************\t\n");
			for(int j=1;j<10;j++) { // 좌우 출력을 기준으로 밑으로 2단 5단 8단, 3단 6단 9단 으로 출력
				System.out.printf("%d*%d = %-2d\t\t %d*%d = %-2d\t\t %d*%d = %-2d\t\n",kopo37_i,j,kopo37_i*j,kopo37_i+1,j,(kopo37_i+1)*j,kopo37_i+2,j,(kopo37_i+2)*j);
				
			}//feqfqefeqqefqefqeffeqqefqefefqqef
			
		}
		System.out.println(0x3D);
	}

}
//				System.out.printf("%d*%d = %d\t\t\t %d*%d = %d\t\t %d*%d = %d\t\n",i,j,i*j,(i+1),j,(i+1)*j,(i+2),j,(i+2)*j);
//System.out.printf("%d*%d = %d	\t%d*%d = %d	\t%d*%d = %d	\t",i,j,i*j,i+1,j+1,(i+1)*(j+1),i+2,j+2,(i+2)*(j+2));