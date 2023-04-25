import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class Lec02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kopo37_f = new File("C:\\Users\\pc\\12_04_07_E_���������������.txt"); // �ش� txt ������ ������ f �� ����
		BufferedReader kopo37_br =  new BufferedReader(new FileReader(kopo37_f)); // ���۸��� ��ä ����
		
		String kopo37_readtxt; // ���� ���� ���ڿ� ���� ����
		
		
		if((kopo37_readtxt = kopo37_br.readLine() )== null) { // ���� ���� �о� �ʵ��
			
			System.out.printf("�� ���� �Դϴ�\n");  //  ���� �� ������ ��� ���
			return;
		}
		
		String[] field_name = kopo37_readtxt.split("\t"); // �� �������� �ʵ带 ����
		
		double kopo37_lat = 37.3860521; // ����
		double kopo37_lng = 127.1214038; //  �浵
		
		int kopo37_LineCnt = 0; // ����� �׸� 
		double kopo37_minDist = Double.MAX_VALUE; // �ּ� �Ÿ� ���
        double kopo37_maxDist = Double.MIN_VALUE; //  �ִ� �Ÿ� ���
        String kopo37_nearest = ""; // ���� ������
        String kopo37_farthest = ""; // ���� �հ�
		while((kopo37_readtxt=kopo37_br.readLine())!=null) {
			
			String[] field = kopo37_readtxt.split("\t"); //�� �������� �ʵ带 ����
			System.out.printf("**[%d��° �׸�]********************\n",kopo37_LineCnt);
			System.out.printf("%s : %s\n",field_name[10], field[10]); // 10��° �׸��� ������ ���� �ּ�
			System.out.printf("%s : %s\n",field_name[13], field[13]); // 13�� ° ����
			System.out.printf("%s : %s\n",field_name[14], field[14]); //  14�� ° �浵
			
			double kopo37_dist = Math.sqrt(Math.pow(Double.parseDouble(field[13])-kopo37_lat,2) //  ���� �Ÿ� ����
					+ Math.pow(Double.parseDouble(field[14])-kopo37_lng,2));
			System.out.printf("���������� �Ÿ� : %f\n",kopo37_dist); //  ���� �Ÿ� ���
			
			if (kopo37_dist < kopo37_minDist) {  // ���� ����� �Ÿ� ���
                kopo37_minDist = kopo37_dist;
                kopo37_nearest = String.format("[%d��° �׸�] %s : %s, %s : %s, %s : %s", kopo37_LineCnt, field_name[2], field[2], field_name[13], field[13], field_name[14], field[14]);
            }
            if (kopo37_dist > kopo37_maxDist) { //  ���� �հŸ� ��� 
                kopo37_maxDist = kopo37_dist;
                kopo37_farthest = String.format("[%d��° �׸�] %s : %s, %s : %s, %s : %s", kopo37_LineCnt, field_name[2], field[2], field_name[13], field[13], field_name[14], field[14]);
            }
			System.out.printf("****************************************\n");
			if(kopo37_LineCnt == 100)break; // 100���� �Ǹ� Ż��
			kopo37_LineCnt++;
		}
		System.out.println("���� ����� �� : " + kopo37_nearest);
        System.out.println("���� �� �� : " + kopo37_farthest);
		System.out.printf("���� ����� �Ÿ� : %f\n", kopo37_minDist);
	    System.out.printf("���� �� �Ÿ� : %f\n", kopo37_maxDist);
		kopo37_br.close();
		
	}

}
