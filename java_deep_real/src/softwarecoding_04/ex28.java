package softwarecoding_04;

import java.text.DecimalFormat;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ĭ ���߱� �ǽ�
		String kopo37_item = "���"; // ���ڿ� ���� ����
		int kopo37_unit_price = 5000; // �ܰ�
		int num = 500; // ����
		int kopo37_total = 0; // �հ��̹Ƿ� 0�� ������ ������ �׾� ��������
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat���� ���� ����
		
		// ��� ���
		System.out.printf("=====================================================\n");
		// 20, 8,8,8 �� ��ŭ�� ������ Ȯ���� ĭ ���߱�
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","ǰ��","�ܰ�","����","�հ�");
		System.out.printf("=====================================================\n");
		// �� ��� // 20, 10, 10, 10 // DecimalFormat���� �޸� ��� ����
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",
				kopo37_item,df.format(kopo37_unit_price),df.format(num),df.format(kopo37_unit_price*num));
		
		System.out.printf("=====================================================\n");
		
	}

}
