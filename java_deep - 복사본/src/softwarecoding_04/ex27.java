package softwarecoding_04;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo37_n,kopo37_m; // ���� ����
		kopo37_n = 1; // 1�� �ʱ�ȭ
		kopo37_m = 20; // 20���� �ʱ�ȭ
		
		while(true) {
			
			for(int kopo37_i=0; kopo37_i<kopo37_m; kopo37_i++) System.out.printf(" "); // 0~20���� ����=>
															// m���� 20���� 1�� �پ��� ������ ���Ⱑ �پ��
			for(int i=0; i<kopo37_n; i++) System.out.printf("*"); // n+2�̱� ������ ���� ������ 2���� ����
			System.out.printf("\n"); // �ٹٲ�
			
			kopo37_m = kopo37_m-1;
			kopo37_n = kopo37_n+2;
			if(kopo37_m<0) break; // m���� ��� �پ��鼭 m���� ������ �Ǹ� ���α׷� ����
		}
	}

}
