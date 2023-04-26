import java.io.*;
public class SamSungMaxMin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kp37_f = new File("C:\\Users\\pc\\A005930.csv"); // �Ｚ���� ���� �ְ��� ���� csv ����
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); // ��ü ����
		
		String kp37_readtxt; //  �о�� ���� ���ڿ� ���� ���� 
		int kp37_Samsung_max = Integer.MIN_VALUE; //  ���� ���� �ְ�
		int kp37_Samsung_min = Integer.MAX_VALUE; //  ���� ���� ������
		
		while((kp37_readtxt=kp37_br.readLine())!=null) {
			String[] kp37_field = kp37_readtxt.split(","); // , �������� ������ �о��
			if(kp37_field[1].substring(0,4).equals("2012")) { // 2012��
				int kp37_stock_max = Integer.parseInt(kp37_field[3]);
				
				if(kp37_stock_max > kp37_Samsung_max) { // �ְ� ����
					kp37_Samsung_max = kp37_stock_max;
				}
				if(kp37_stock_max < kp37_Samsung_min) { //  ������ ����
					kp37_Samsung_min = kp37_stock_max;
				}
				
			}
			
			
		}
		kp37_br.close(); // ���� �ݱ�
		System.out.println("�Ｚ ���� ���� ���� �ְ� : "+kp37_Samsung_max + "��"); // ���
		System.out.println("�Ｚ ���� ���� ���� ������ : "+kp37_Samsung_min + "��"); //  ���

	}

}
