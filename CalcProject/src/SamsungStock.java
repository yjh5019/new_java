import java.io.*;
public class SamsungStock {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File kp37_f = new File("C:\\Users\\pc\\StockDailyPrice.csv");  // �о�� ���� ��� ����
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f));// // ���� ��ü ����
		
		File kp37_f1 = new File("C:\\Users\\pc\\A005930.csv");// �о�� ������ �������� �ۼ��� ���� ��� 
		BufferedWriter kp37_bw1 = new BufferedWriter(new FileWriter(kp37_f1));// ���� ��ü ����
		
		
		String kp37_readtxt;// ���� ���� ������ ���� ����
		
		while((kp37_readtxt=kp37_br.readLine())!=null) {// ���� ���� �о���� while�� �ۼ�
			StringBuffer kp37_s = new StringBuffer();// StringBuffer ��ü ����
			String[] kp37_field = kp37_readtxt.split(",");//  �ش� ���ڸ� �������� �ʵ带 ����
			
			if(kp37_field[2].equals("A005930")) { // �Ｚ���� ������̶�� �� ���ڸ� �������� ������
				for(int i=0; i<kp37_field.length;i++) { // �ݺ����� ���� �ش� ������ ���Ͽ� �����Ѵ�
					kp37_s.append(kp37_field[i]+","); //  ���� �����߰�
				}
				kp37_bw1.write(kp37_s.toString());kp37_bw1.newLine();// ���ڿ��� ��ȯ�ѵ� ���� �ۼ�
			}
			
		}
		kp37_br.close();// �о�� ���� �ݱ�
		kp37_bw1.close();//  �ۼ� ���� �ݱ�			
	}

}
