package softwarecoding_04;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kopo37_units = {"��","��","��","��","��","��","��","ĥ","��","��"}; // ���� �迭 ����
		for (int kopo37_i=0;kopo37_i<101; kopo37_i++) { // �ݺ���
			if(kopo37_i>=0 && kopo37_i<10) { // 1~9 ���� ���ڿ� ���
				System.out.printf("���� �ڸ� : %s\n", kopo37_units[kopo37_i]);

			}else if(kopo37_i >=10 && kopo37_i<100) {
				int kopo37_i10,kopo37_i0; // �����ڸ�, �����ڸ� ����
				kopo37_i10 = kopo37_i/10; // ���� �ڸ� 
				kopo37_i0 = kopo37_i%10; // ���� �ڸ�
				if(kopo37_i0==0) {
					System.out.printf("�����ڸ� : %s��\n",kopo37_units[kopo37_i10]);
				}else {
					System.out.printf("�����ڸ� : %s��%s\n",kopo37_units[kopo37_i10],kopo37_units[kopo37_i0]);
				}
			}else
				System.out.printf("==>%d\n",kopo37_i);
			
		}
	}

}
