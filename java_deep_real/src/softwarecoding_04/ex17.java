package softwarecoding_04;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo37_iVal;
		for (int kopo37_i=0; kopo37_i<300; kopo37_i++) {  // ���ǹ� �ݺ����� 0~1500 ���� ��������
			kopo37_iVal = 5 * kopo37_i;
			if(kopo37_iVal>=0 && kopo37_iVal<100)
				System.out.printf("�� %d\n",kopo37_iVal); // ��Ʈ������ & �� &&�� ���̴� ���� ����� 
			// ������ ������ & �� ���� ���ǽ��� false ���� ���� ���ǽ��� true���� false ���� �Ǻ��Ѵ�. ������ ����� false�ε��� ���̴�.
			// && �� ���� ���ǽ��� false ���, ���� ���ǽ��� true���� false���� �Ű澲�� �ʴ´�. ������ ����� false�̱� �����̴�.
			else if(kopo37_iVal>=10 && kopo37_iVal<100) // 10�̻� 100 �̸��� ���� ������ ���
				System.out.printf("�� %d\n",kopo37_iVal);
			else if(kopo37_iVal>=100 && kopo37_iVal<1000) // 100�̻� 1000 �̸��� ���� ������ ���
				System.out.printf("�� %d\n",kopo37_iVal);
			else // �׿� ������ õ���� ���
				System.out.printf("õ %d\n",kopo37_iVal);
			
		}
	}

}
