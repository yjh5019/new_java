package soft_05;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kopo37_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ�����)";
		String kopo37_itemcode1 = "[1031615]";
		int kopo37_price1 = 1400;
		int kopo37_amount1 = 1;
		String kopo37_itemname2 = "�����̵�ĸ���(������)(100ȣ)";
		String kopo37_itemcode2 = "[11008152]";
		int kopo37_price2 = 2500;
		int kopo37_amount2 = 1;
		String k37_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String k37_itemcode3 = "[1020800]";
		int k37_pricme3 = 9700;
		int k37_amount3 = 1;
		
		int k37_sum = ((kopo37_price1*kopo37_amount1)+(kopo37_price2*kopo37_amount2)+(k37_pricme3*k37_amount3));
		int k37_Price = Math.round(k37_sum / 1.1f);		
		DecimalFormat df = new DecimalFormat("###,###,###"); // ���� �޸� ��� ���� ����
		Calendar k37_calendar = new GregorianCalendar();// ���� �ð��� ��������
		Calendar k37_calt = Calendar.getInstance();
		SimpleDateFormat k37_SDF = new SimpleDateFormat("MM�� dd��"); // ��¥ ���� ����
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ��¥ ���� ����
		//////���ȭ��
		System.out.printf("           \"���ΰ���, ���̼�\"\n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (������)\n");
		System.out.printf("========================================\n");
		System.out.printf("     �Һ����߽ɰ濵(CCM) �������\n");
		System.out.printf("    ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("========================================\n");
		k37_calendar.add(Calendar.DATE, 14); // Ķ������ ������ ����ð����� 14�� ���� ��¥ �޾ƿ�
//		chkDate = SDF.format(calendar.getTime());
		System.out.printf("      ��ȯ/ȯ�� 14��(%s)�̳�,\n",k37_SDF.format(k37_calendar.getTime())); // �޾ƿ³�¥�� ���
		System.out.printf("     (����)������, ����ī�� ���� ��\n");
		System.out.printf("           ���Ը��忡�� ����\n");
		System.out.printf("    ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("      üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("========================================\n");
		System.out.printf("[POS 1058231]        %s\n",k37_sdt.format(k37_calt.getTime())); // ���� �ð� ��¥�� ������
		System.out.printf("========================================\n");
		System.out.printf("%.14s %s %d %s\n",kopo37_itemname1,df.format(kopo37_price1),kopo37_amount1,df.format((int)(kopo37_price1*kopo37_amount1))); // ��ǰ��, ����, ����,�հ踦 ���
		System.out.printf("%s\n",kopo37_itemcode1); // �ش� ǰ���� �ѹ��� ������
		System.out.printf("%.14s   %s %d %s\n",kopo37_itemname2,df.format(kopo37_price2),kopo37_amount2,df.format((int)(kopo37_price2*kopo37_amount2))); // ��ǰ ����������
		System.out.printf("%s\n",kopo37_itemcode2);
		System.out.printf("%.14s %s %d %s\n",k37_itemname3,df.format(k37_pricme3),k37_amount3,df.format((int)(k37_pricme3*k37_amount3))); // ��ǰ������ ������ ��
		System.out.printf("%s\n",k37_itemcode3);
		System.out.printf("              �����հ�            %.10000000s\n",df.format(k37_Price)); // �ΰ��� ���� ������ ���
		System.out.printf("              �ΰ���               %.10000000s\n",df.format(k37_sum-k37_Price)); // �ΰ��� ���
		System.out.printf("----------------------------------------\n");
		System.out.printf("�Ǹ��հ�                          %.10000000s\n",df.format(k37_sum)); // ��� �հ踦 sum���� ������ �־� ���
		System.out.printf("========================================\n");
		System.out.printf("�ſ�ī��                          %.10000000s\n",df.format(k37_sum)); // ���� ���������� �����ؼ� ���
		System.out.printf("----------------------------------------\n");
		System.out.printf("�츮ī��                538720**********\n");
		System.out.printf("���ι�ȣ 77982843(0)     ���αݾ� %.10000000s\n",df.format(k37_sum));
		System.out.printf("========================================\n");
		System.out.printf("       %s �д缭����\n",k37_sdt.format(k37_calt.getTime())); // ���� �ð��� ������
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-440\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("             2112820610158231\n"); // ���ڵ� �ѹ� ���
		System.out.printf("----------------------------------------\n");
		System.out.printf("�´��̼� ����� �� �Ǵ� Ȩ�������� �����ϼ�\n");
		System.out.printf(" �� ȸ������ �� �پ��� ������ ����������!��\n");
	}

}