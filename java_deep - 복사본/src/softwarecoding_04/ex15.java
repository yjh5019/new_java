package softwarecoding_04;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo37_iA,kopo37_iB; // ������ ���� ����
		
		kopo37_iA = 0; // ���� �ʱ�ȭ
		while(true) { // ���� ����
			kopo37_iB = 0; // �ʱ�ȭ
			while(true) {
				System.out.printf("*"); // �� ���
				
				if(kopo37_iA==kopo37_iB) break; // ���� iA�� iB�� ���ٸ� �ݺ��� Ż��
				kopo37_iB++; // iB 1 ����
			}
			System.out.printf("\n"); // ������ break�� �ɸ��� �ݺ����� Ż���ϰ� �ٹٲ�
			kopo37_iA++; // iA 1�� ����
			if(kopo37_iA==30)break; // �� 30�� ���������� �ݺ�
		} 
	}

}
