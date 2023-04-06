
package soft_05;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex9_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat k37_df = new DecimalFormat("###,###,###"); // ���� �޸� ��� ���� ����
		Calendar k37_calendar = new GregorianCalendar(); // ���� �ð��� ��������
		Calendar k37_calt = Calendar.getInstance();
		SimpleDateFormat k37_SDF = new SimpleDateFormat("MM�� dd��"); // ��¥ ���� ����
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");// ��¥ ���� ����
		SimpleDateFormat k37_sde = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // ��¥ ���� ����
		SimpleDateFormat k37_sde1 = new SimpleDateFormat("YYYYMMdd"); //  ��¥ ���� ����
		
		/////////////////////////////////////////////
		//��ǰ �׸�
		String[] k37_itemname = {"�δ��","��ġ�aa������","�������","�������ֽ�","���ڿ���",
				"1������鰡����","��� �Ŷ�� 39431g �̺�Ʈ","������ġ����arjt","��������","����̿���",
							"��������","���ڿ���1������������","����","����ֽ�","���⿡��",
							"�߰�����","����ƾ","��Ǫ","����","�Կ���",
							"�ٳ�������","���ο�������(renew)","�������","�����ֽ�","����",
							"���","��ġ������","¥�İ�Ƽ","�ֵ���","ĩ��",
							"ġ��","�鵵��"};
		//����
		int[] k37_num = 		{1,21,1,5,3,
								1,1,3,2,1,
								1,1,1,1,2,
								2,1,1,1,2,
								2,3,2,1,1,
								2,1,3,3,1,
								1,3};
		// ����
		int[] k37_price = 		{3330,2540,33300,2000,1500,
				1800,900,53031,5000,200,
				1300,1500,70300,1710,1700,
							1103,3234300,4300,2500,1300,
							53000,35300,50300,1000,1300,
							1600,30030,24300,3738,4300,
							6000,4500};
		// �鼼 ��ǰ ���
		boolean[] k37_taxfree = {false,true,false,true,true,
				false,false,false,true,false,
							true,true,true,true,false,
							true,true,false,true,true,
							true,false,false,false,true,
							false,false,false,true,false,
							true,false};
		int k37_taxfree_sum = 0; // �鼼 �հ�
		int k37_non_taxfree_sum = 0; // ��鼼 �հ� ���� ���� �� �ʱ�ȭ
		double k37_tax = 0;
		System.out.printf("              �̸�Ʈ ������(031)888-1234\n");
		System.out.printf("    Emart     206-86-50913 ����\n");
		System.out.printf("              ���� ������ ������� 552\n");
		System.out.printf("������ ������ ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������) \n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[�� ��]%s     POS:0011-9861\n",k37_sdt.format(k37_calt.getTime())); // ������ ��� �ð��� calt.getTime�� ���� ������ sdt.format�������� ���
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  �� ǰ ��           �� �� ����     �� ��\n");
		System.out.printf("-----------------------------------------\n");
		for(int k37_i=0;k37_i<k37_itemname.length; k37_i++) {
			String k37_str = k37_itemname[k37_i];
			k37_str = k37_str+"           "; // str ���ڿ� ���� �߰�
			byte[] k37_bb = k37_str.getBytes(); // ����Ʈ �迭 ���� �� str ���ڸ� ����Ʈ�� ��ȯ
			k37_str = new String(k37_bb,0,14); // str string ������ ��ȯ�� bb�� 0~14���� �ڸ���
			int k37_count = 0;
			// bb�� ����ִ� ���� ���� - �� ������ �ѱ۷� �Ǵ�
			// �ѱ��� ������ ��� �� ������ Ȧ�� �϶� 
			for (int k37_j = 0; k37_j < 14; k37_j++) { // j�� 0���� 13���� �ݺ� j�� �������� 1�� ����
				if (k37_bb[k37_j] < 0) { // ���� j��° ����Ʈ�迭�� 0���� ������
					k37_count++; // count�� 1�������Ѽ� �ѱ��� ������ ī��Ʈ
				}
			}
			if (k37_count % 2 == 1) { // ī��Ʈ ������ 2�� �������� �������� 1�̸�
				if (k37_bb[13] < 0) { //  13��° ����Ʈ�迭�� 0����������
					k37_str = new String(k37_bb, 0, 13) + " "; // 14��°�� �����߰�
				} else { // �װԾƴϸ� �׳� ���
					k37_str = new String(k37_bb, 0, 13);

				}
			}
						
			// �鼼��ǰ �� ��� *�� �߰��Ͽ� ����ϴ� ���ǹ�
			if (k37_taxfree[k37_i]==true) {
		        k37_str = "* " + k37_str;
		        k37_taxfree_sum+=k37_price[k37_i]*k37_num[k37_i]; // �鼼���ݿ� ������ ���� �� �鼼 ��ǰ�� ������ ���
		    // �ƴ϶��, * ��ŭ�� ������ �߰��Ͽ� �ٸ���
		    }else if(k37_taxfree[k37_i]==false) {
		    	
		    	k37_str = "  " + k37_str;
		    	k37_non_taxfree_sum+=k37_price[k37_i]*k37_num[k37_i]; // ������ǰ�� ���� ���� ������ǰ ���� ����ϴ� ���� ����
		    	k37_tax = (double)(k37_non_taxfree_sum/11.0); // ���ݰ��� ������ ���� ���س���, ����������/11�� ������ �Ǽ������� ����ȯ
		    	if(k37_tax == (int)k37_tax) { // �� ���� ������ tax���� ���Ƹ�
		    		k37_tax = (int)k37_tax; // �״�� ���
		    	}else  { // �ƴ϶��
		    		k37_tax = (int)k37_tax + 1;
		    	}
		    }
			System.out.printf("%s %10s %2d %10s\n", k37_str,k37_df.format(k37_price[k37_i]),k37_num[k37_i],k37_df.format(k37_price[k37_i]*k37_num[k37_i])); // ��ǰ��,�ܰ�,����,�ݾ� ���
			if((k37_i+1)%5==0) {
				System.out.printf("-----------------------------------------\n");
			}
		}
		int k37_th_point = 164;
		int k37_point = 5639;
		System.out.printf("\n");
		System.out.printf("                �� ��ǰ ���� %12d\n",k37_itemname.length); // sum�� ���� �� ��ǰ ������ ���
		System.out.printf("             (*)�� ��  �� ǰ %12.10000000s\n",k37_df.format(k37_taxfree_sum)); //  �鼼 ��ǰ �� ���� �ջ��Ͽ� ���
		System.out.printf("                �� ��  �� ǰ %12.10000000s\n",k37_df.format(k37_non_taxfree_sum-k37_tax)); //���� ��ǰ �Ѿ��� �ջ��Ͽ� ���
		System.out.printf("                ��   ��   �� %12.10000000s\n",k37_df.format(k37_tax)); // ������ǰ�� ���� �ΰ��� ���
		System.out.printf("                ��        �� %12.10000000s\n", k37_df.format(k37_taxfree_sum+k37_non_taxfree_sum)); // �� ������ �׸���� �հ�
		System.out.printf("�� �� �� �� �� �� %23.10000000s\n",k37_df.format(k37_taxfree_sum+k37_non_taxfree_sum)); // �հ�
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB �ϳ�       541707**0484/35860658\n");
		System.out.printf("ī�����(IC)            �Ͻú�/%10s\n",k37_df.format(k37_taxfree_sum+k37_non_taxfree_sum));// �հ踦 �޸� �������� ���
		System.out.printf("-----------------------------------------\n");
		System.out.printf("          [�ż�������Ʈ ����]\n");
		System.out.printf("��*�� �������� ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ    9350**9995       %6s\n",k37_df.format(k37_th_point));
		System.out.printf("����(����)����Ʈ      %9s(  %6s)\n",k37_df.format(k37_point),k37_df.format(k37_point)); // ��������Ʈ ���� �޸� �������� ���
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο� \n");
		System.out.printf("������ȣ :                       34��****\n");
		System.out.printf("�����ð� :  %29s\n",k37_sde.format(k37_calt.getTime())); // ���� �ð��� ������ ������ �����Ͽ� ���
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��OO                     1150\n");
		System.out.printf("%14s/00119861/00164980/31\n",k37_sde1.format(k37_calt.getTime())); // ���� �ð� ���
		
	}
	}



