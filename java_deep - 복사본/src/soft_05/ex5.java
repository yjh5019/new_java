package soft_05;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int kopo37_i=1; kopo37_i<4; kopo37_i++) {
			System.out.printf("****************\t****************\t****************\t\n");
			System.out.printf("备备窜 %d 窜	\t备备窜 %d 窜	\t备备窜 %d 窜	\t\n",kopo37_i,kopo37_i+3,kopo37_i+6);
			System.out.printf("****************\t****************\t****************\t\n");
			for(int kopo37_j=1;kopo37_j<10;kopo37_j++) {
				System.out.printf("%d*%d = %-2d\t\t %d*%d = %-2d\t\t %d*%d = %-2d\t\n",
						kopo37_i,kopo37_j,kopo37_i*kopo37_j,kopo37_i+3,kopo37_j,(kopo37_i+3)*kopo37_j,kopo37_i+6,kopo37_j,(kopo37_i+6)*kopo37_j);
			}
		}
	}

}
