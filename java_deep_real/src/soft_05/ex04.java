package soft_05;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���߹ݺ����� ���� ������ �ۼ�
		for(int kopo37_i=1; kopo37_i<10; kopo37_i=kopo37_i+3) { // �¿�� ����Ҳ��� 1��,4��, 7������ ���
			System.out.printf("****************\t****************\t****************\t\n");
			System.out.printf("������ %d ��	\t������ %d ��	\t������ %d ��	\t\n",kopo37_i,kopo37_i+1,kopo37_i+2); 
			System.out.printf("****************\t****************\t****************\t\n");
			for(int j=1;j<10;j++) { // �¿� ����� �������� ������ 2�� 5�� 8��, 3�� 6�� 9�� ���� ���
				System.out.printf("%d*%d = %-2d\t\t %d*%d = %-2d\t\t %d*%d = %-2d\t\n",kopo37_i,j,kopo37_i*j,kopo37_i+1,j,(kopo37_i+1)*j,kopo37_i+2,j,(kopo37_i+2)*j);
				
			}//feqfqefeqqefqefqeffeqqefqefefqqef
			
		}
		System.out.println(0x3D);
	}

}
//				System.out.printf("%d*%d = %d\t\t\t %d*%d = %d\t\t %d*%d = %d\t\n",i,j,i*j,(i+1),j,(i+1)*j,(i+2),j,(i+2)*j);
//System.out.printf("%d*%d = %d	\t%d*%d = %d	\t%d*%d = %d	\t",i,j,i*j,i+1,j+1,(i+1)*(j+1),i+2,j+2,(i+2)*(j+2));