package softwarecoding_04;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kopo37_fSin; // �Ǽ��� ���� ����
		for(int kopo37_i=0; kopo37_i<360; kopo37_i++) { // i�� �����ν� 360�� ���� ǥ��
			kopo37_fSin = Math.sin(kopo37_i*3.141592/180); // �Ǽ��� ������ sin�Լ�==> 1���� �������� ǥ��   [��]=����/180 ���� ǥ��
			System.out.printf("%d sin==>%f\n",kopo37_i,kopo37_fSin); // �� ���� ���� sin �Լ��� ���
		}
		// sin 360�� ���� �׸���
		for(int kopo37_i=0; kopo37_i<360; kopo37_i++) {
			kopo37_fSin = Math.sin(kopo37_i*3.141592/180); // �Ǽ��� ������ sin�Լ�==> 1���� �������� ǥ��   [��]=����/180 ���� ǥ��
			int iSpace = (int)((1.0-kopo37_fSin)*50); // iSpace = ���� ���� ���� ���⸦ ���� sin�Լ��� �׸� �� �ִ�
			for(int j=0; j<iSpace; j++) System.out.printf(" "); // iSpace ���� ũ�� ���Ⱑ ��������, ���� ������ ���� ���ڰ� ������
			System.out.printf("*[%f][%d]\n",kopo37_fSin, iSpace); // sin ���� ������ iSpace�� ���
		}
	}

}
