package soft_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k37_df = new DecimalFormat("###,###,###");
		Calendar k37_calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		int kopo37_iPrice= 59000; // �հ踦 ��Ÿ���� ������ ����
		int kopo37_Price = Math.round(kopo37_iPrice / 1.1f); // �ΰ� ���� ���� ������ ����ؼ� ������ �ݿø��Ͽ� ������ ����
		////////////// ������ �������� ���� ������ ����ó���� �������� ���� �����ϵ��� ������
		String kopo37_danmalgi = "2N68665898";
		String kopo37_gameng = "������������";
		String kopo37_address = "��� ������ �д籸 Ȳ�����351���� 10,1��";
		String kopo37_ceo = "������";
		String kopo37_business = "752-53-00558";
		String kopo37_tel = "7055695";
		String kopo37_phone_num = "041218";
		String kopo37_appro = "70404427"; 
		String kopo37_deal_num = "357734873739";
		
		
		System.out.printf("�ſ����\n");
		System.out.printf("�ܸ��� : %s    ��ȭ��ȣ : %s\n",kopo37_danmalgi,kopo37_phone_num); // �ܸ��� �� ��ȭ��ȣ ���� ���
		System.out.printf("������ : %s\n",kopo37_gameng); // ������ ��ȣ
		System.out.printf("�ּ� : %s\n",kopo37_address); // �ּ� ���
		System.out.printf("��ǥ�� : %s\n",kopo37_ceo); // ��ǥ�� ���
		System.out.printf("����� : %s      TEL : %s\n",kopo37_business,kopo37_tel); // ����ڿ� ���� ������ ������ �����Ͽ� ���
		System.out.printf("----------------------------------------\n");
		System.out.printf("��  ��%32s��\n",k37_df.format((int)(kopo37_Price))); // �ݾ��� 32������ �ΰ� ���, 
		System.out.printf("�ΰ���%32s��\n",k37_df.format((int)(kopo37_iPrice-kopo37_Price)));
		System.out.printf("��  ��%32s��\n",k37_df.format(kopo37_iPrice));
		System.out.printf("----------------------------------------\n");
		System.out.printf(" �츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S) �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", sdt.format(k37_calt.getTime()));
		System.out.printf("���ι�ȣ : %s\n",kopo37_appro);
		System.out.printf("�ŷ���ȣ : %s\n",kopo37_deal_num);
		System.out.printf("���� : ��ī���  ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ \n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("             * �����մϴ� *\n");
		System.out.printf("                      ǥ��v2.08_20200212");

	}

}