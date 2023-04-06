package soft_05;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###,###,###");
		Calendar calendar = new GregorianCalendar();
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat SDF = new SimpleDateFormat("MM�� dd��");
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		
		SimpleDateFormat sde = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat sde1 = new SimpleDateFormat("YYYYMMdd");
		
//		String str = "�ȳ��ϼ���, Hello!";
//
//        // ����Ʈ ������ 10~20 ����Ʈ ������ ���ڿ��� ����
//        String substr = substringByBytes(str, 10, 20);
//        System.out.println(substr); // ���: "o, Hello"
//
//        // ����Ʈ ������ 0~5 ����Ʈ ������ ���ڿ��� ����
//        substr = substringByBytes(str, 0, 5);
//        System.out.println(substr); // ���: "�ȳ�"
//		
		/////////////////////////////////////////////
		//��ǰ �׸�
		String[] itemname = {"�������̤�����","�ٳ�������","������","�������ֽ�","���ڿ���",
							"��������","���ڿ���","����","����ֽ�","���⿡��",
							"�ٳ�������","�������","����","�����ֽ�","����",
							"������餡��1","��� �Ŷ�� 39431g �̺�Ʈ1r13r1r13r3","������ġ��311��13","��������","����̿���",
							"���","��ġ������","¥�İ�Ƽ","�ֵ���","ĩ��",
							"�߰�����","����ƾ","��Ǫ","����","�Կ���",
							"ġ��","�鵵��"};
		int[] num = 		{3,2,1,5,3,
							2,1,1,1,2,
							1,1,3,2,1,
							2,1,3,3,1,
							1,1,1,1,2,
							1,3};
		
		int[] price = 		{1000,2500,33300,2000,1500,
							1000,13311100,4300,2500,1300,
							1300,1500,70300,1710,1700,
							1600,3000,24300,3738,4300,
							13000,35300,50300,1000,1300,
							1800,900,53030,5000,200,
							6000,4500};
		
		
		boolean[] taxfree = {true,true,false,true,true,
							false,false,false,true,false,
							true,true,true,true,false,
							true,false,false,false,true,
							true,true,false,true,true,
							true,false};
		int item_num_sum = 0;		
		int taxfree_sum = 0; // �鼼 �հ�
		int non_taxfree_sum = 0; // ��鼼 �հ�
		
		
//		int vat = Math.round(non_taxfree_sum * 0.1f);
		/////////////////////////////////////////////
		// 5������ ------���� �����Ҽ��ְ� ����
		// ������ǰ 10���� �ϸ� �Ҽ��� �ø�
		//  26��    ====�ѱ� 13��
		// õ���� ���� ���� �ܰ�
		// ���ڵ� �ؿ� ��¥�� ������ �־��ֽð�
		// ����Ʈ ¥����� ������ ����
		//
		//
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.printf("emart \n");
		System.out.printf("�̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("206-86-50913 ����\n");
		System.out.printf("���� ������ ������� 552\n");
		System.out.printf("������ ������ ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/�Ѻ� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[����]%s     POS:0011-9861\n",sdt.format(calt.getTime()));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("�� ǰ ��           �� ��  ����     �� ��\n");
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num.length; i++) {
//			String substr = itemname[i];
			String str = itemname[i];
			int endbyte = 13;// ��ǰ�� ��� ����Ʈ��
			String substr = substringByBytes(str, 1, endbyte);
//			System.out.printf("%s\n",str.getBytes().length);
			if(str.getBytes().length<=endbyte) {
				
				substr += " ".repeat(endbyte - substr.getBytes().length);
			}
			
			
//			if(substr.length()<endbyte) {
//				substr += " ".repeat(endbyte-substr.length());
//			}
			item_num_sum+= num[i];
			if (taxfree[i]) {
		        substr = "*" + substr;
		        taxfree_sum+=price[i];
		    }else {
		    	
		    	substr = " " + substr;
		    	non_taxfree_sum+=price[i];
		    }
			System.out.printf("%s|%10s %3d %10s\n", substr,df.format(price[i]),num[i],df.format(price[i]*num[i]));
			if((i+1)%5==0) {
				System.out.printf("\n");
				System.out.printf("----------------------------------------\n");
				System.out.printf("\n");
			}
		}
		int vat = Math.round(non_taxfree_sum * 0.1f);
		System.out.printf("\n");
		System.out.printf("              �� ��ǰ ���� %13d\n",item_num_sum);
		System.out.printf("           (*)�� ��  �� ǰ %13.10000000s\n",df.format(taxfree_sum));
		System.out.printf("              �� ��  �� ǰ %13.10000000s\n",df.format(non_taxfree_sum));
		System.out.printf("              ��   ��   �� %13.10000000s\n",df.format(vat));
		System.out.printf("              ��        �� %13.10000000s\n", df.format(taxfree_sum+non_taxfree_sum+vat));
		System.out.printf("�� �� �� �� �� ��%23.10000000s\n",df.format(taxfree_sum+non_taxfree_sum+vat));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("0012 KEB �ϳ�      541707**0484/35860658\n");
		System.out.printf("ī�����(IC)           �Ͻú�/%10s\n",df.format(taxfree_sum+non_taxfree_sum+vat));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("          [�ż�������Ʈ ����]\n");
		System.out.printf("������ �������� ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ    9350**9995         164\n");
		System.out.printf("����(����)����Ʈ      5637        (5637)\n");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("������ȣ :                      34��****\n");
		System.out.printf("�����ð� : %29s\n",sde.format(calt.getTime()));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("ĳ��:084599 ��OO                    1150\n");
		System.out.printf("%15s/00119861/00164980/31\n",sde1.format(calt.getTime()));
		
	}
	
	public static String substringByBytes(String str, int beginBytes, int endBytes) {
	    if (str == null || str.length() == 0) {
	        return "";
	    }
	 

	     if (beginBytes < 0) {
	        beginBytes = 0;
	    }

	    if (endBytes < 1) {
	        return "";
	    }

	    int len = str.length();

	    int beginIndex = -1;
	    int endIndex = 0;

	    int curBytes = 0;
	    String ch = null;
	    for (int i = 0; i < len; i++) {
	        ch = str.substring(i, i + 1);
	        curBytes += ch.getBytes().length;

	        if (beginIndex == -1 && curBytes >= beginBytes) {
	            beginIndex = i;
	        }

	        if (curBytes > endBytes) {
	            break;
	        } else {
	            endIndex = i + 1;
	        }
	        
	    }
	 

	    return str.substring(beginIndex, endIndex);
	}
}

