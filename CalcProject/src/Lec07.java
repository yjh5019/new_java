import java.io.BufferedReader;
import java.io.*;
public class Lec07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kp37_f = new File("C:\\Users\\pc\\THTSKS010H00.dat"); // ���� ��θ� ����
		
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); // ���� ��ü ����
		//���� ������ ���ڿ� ������ �ش� ������ ī��Ʈ�� ����
		String kp37_readtxt; // ���� ���� ������ ���� ����
		int kp37_LineCnt = 0; // �ش� ������ ���� ���� ������ ����
		int kp37_n = -1; // 
		
		StringBuffer kp37_s = new StringBuffer();
		
		while(true) { // ���� ������ ���� �ش� ������ �о���� ����
			
			//�ش� �迭�� ����� ���ڿ��� �� ���ھ� ��ȸ�ϸ鼭 �ٹٲ� ���ڸ� ������, ���ڿ��� ����ϰ� StringBuffer�� �ʱ�ȭ
			char[] kp37_ch = new char[1000]; // char�� �迭 ����
			kp37_n = kp37_br.read(kp37_ch);
			if(kp37_n == -1)break;
			for(char kp37_c : kp37_ch) {
				if(kp37_c=='\n') { // �ش� ���ڿ��� �ٹٲ��� �ִٸ�
					System.out.printf("[%s]***\n",kp37_s.toString()); //  �ش� ������ ����ϰ�
					kp37_s.delete(0, kp37_s.length()); // �ʱ�ȭ
				}else {
					kp37_s.append(kp37_c); // �װ� �ƴ϶�� �ش� ������ �߰���
				}
				
			}
			kp37_LineCnt++; // ���� ī��Ʈ ����
		}
		System.out.printf("[%s]***\n",kp37_s.toString()); // �ش� ������ ����ϱ� ���� ���ڿ��� ��ȯ�Ͽ� ���
		kp37_br.close();

	}

}
