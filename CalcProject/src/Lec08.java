import java.io.*;
public class Lec08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kp37_f = new File("C:\\Users\\pc\\THTSKS010H00.dat"); // �о�� ���� ��� ����
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); // // ���� ��ü ����
		
		File kp37_f1 = new File("C:\\Users\\pc\\StockDailyPrice.csv"); // �о�� ������ �������� �ۼ��� ���� ��� �� ���� �̸� ����
		BufferedWriter kp37_bw1 = new BufferedWriter(new FileWriter(kp37_f1)); // ���� ��ü ����
		
		String kp37_readtxt;// ���� ���� ������ ���� ����
		int kp37_cnt=0; int kp37_wcnt=0; // ī��Ʈ ���� ����
		
		while((kp37_readtxt=kp37_br.readLine())!=null) { // ���� ���� �о���� while�� �ۼ�
			
			StringBuffer kp37_s = new StringBuffer(); // StringBuffer ��ü ����
			String[] kp37_field = kp37_readtxt.split("%_%"); //  �ش� ���ڸ� �������� �ʵ带 ����
			
			if(kp37_field.length>2&&kp37_field[2].replace("^", "").trim().substring(0,1).equals("A")) { // �� ������ ���ְ�, �ش� �ʵ��� 0��° ���� A�ϰ�� �ݺ��� ����
				for(int j=1; j<kp37_field.length;j++) { // �ݺ��� ����
					kp37_s.append(","+kp37_field[j].replace("^", "").trim()); // �ش� ������ �����Ҷ� ^�� ���ְ�, ������ ���ص� kp37_s ������ ����
				}
				kp37_bw1.write(kp37_s.toString());kp37_bw1.newLine(); // ���ڿ��� ��ȯ�ѵ� ���� �ۼ�
				kp37_wcnt++; // ī��Ʈ ����
			}
			kp37_cnt++; //  ī��Ʈ ����
		}
		kp37_br.close(); // �о�� ���� �ݱ�
		kp37_bw1.close(); //  �ۼ� ���� �ݱ�
		System.out.printf("Program End[%d][% d]records\n",kp37_cnt,kp37_wcnt);  // �ش� ���� ��� ����
	}

}
