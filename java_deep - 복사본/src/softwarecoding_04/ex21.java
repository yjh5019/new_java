package softwarecoding_04;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �޸� ���ֱ�
		int[] kopo37_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31}; // array�� �� ���������� ���ڸ� ���������� ����
		
		for (int kopo37_i=1;kopo37_i<13;kopo37_i++) { // 1��~12�� ���� �ݺ���
			System.out.printf("%d��=>", kopo37_i);
			for(int kopo37_j=1; kopo37_j<32; kopo37_j++) { 
				System.out.printf("%d",kopo37_j);
				if(kopo37_iLMD[kopo37_i-1]==kopo37_j) // ���� ���������� �ϼ��� j �ݺ����� ������ �ϼ��� ���ٸ�
					break; // �޸��� ���� �ʰ� ����
				System.out.printf(","); // ��ҿ� �޸��� ��ٰ�
	}
			System.out.printf("\n");
		}
}
	}
