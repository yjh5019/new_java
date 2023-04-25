import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Lec03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo37_f = new File("C:\\Users\\pc\\��������������ǥ�ص�����.txt"); // �ش� txt ������ ������ f �� ����
		BufferedReader kopo37_br = new BufferedReader(new FileReader(kopo37_f)); // ���۸��� ��ä ����

		String kopo37_readtxt; // ���� ���� ���ڿ� ���� ����

		if ((kopo37_readtxt = kopo37_br.readLine()) == null) { // ���� ���� �о� �ʵ��

			System.out.printf("�� ���� �Դϴ�\n"); // ���� �� ������ ��� ���
			return;
		}
		String[] kopo37_field_name = kopo37_readtxt.split("\t"); // �� �������� �ʵ带 ����

		double kopo37_lat = 37.3860521; // ����
		double kopo37_lng = 127.1214038; // �浵

		int kopo37_LineCnt = 0; // ����� �׸�
		double kopo37_minDist = Double.MAX_VALUE; // �ּ� �Ÿ� ���
		double kopo37_maxDist = Double.MIN_VALUE; // �ִ� �Ÿ� ���
		String kopo37_nearest = ""; // ���� ������
		String kopo37_farthest = ""; // ���� �հ�

		while ((kopo37_readtxt = kopo37_br.readLine()) != null) {
			try { //  �� �����Ϳ� ���� ���� ��� ���� try catch fiallay 
				String[] kopo37_field = kopo37_readtxt.split("\t"); // �� �������� �ʵ带 ����
				System.out.printf("**[%d��° �׸�]*******************************************\n", kopo37_LineCnt);
				System.out.printf("%s : %s\n", kopo37_field_name[4], kopo37_field[4]); // 10��° �׸��� ������ ���� �ּ�
				System.out.printf("%s : %s\n", kopo37_field_name[28], kopo37_field[28]); // 29�� ° ����
				System.out.printf("%s : %s\n", kopo37_field_name[29], kopo37_field[29]); // 30�� ° �浵

				double kopo37_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo37_field[28]) - kopo37_lat, 2) // ���� �Ÿ� ����
						+ Math.pow(Double.parseDouble(kopo37_field[29]) - kopo37_lng, 2));
				System.out.printf("���������� �Ÿ� : %f\n", kopo37_dist); // ���� �Ÿ� ���

				if (kopo37_dist < kopo37_minDist) { // ���� ����� �Ÿ� ���
					kopo37_minDist = kopo37_dist;
					kopo37_nearest = String.format("[%d��° �׸�] %s : %s, %s : %s, %s : %s", kopo37_LineCnt, kopo37_field_name[4], kopo37_field[4],
							kopo37_field_name[28], kopo37_field[28], kopo37_field_name[29], kopo37_field[29]);
				}
				if (kopo37_dist > kopo37_maxDist) { // ���� �հŸ� ���
					kopo37_maxDist = kopo37_dist;
					kopo37_farthest = String.format("[%d��° �׸�] %s : %s, %s : %s, %s : %s", kopo37_LineCnt, kopo37_field_name[4], kopo37_field[4],
							kopo37_field_name[28], kopo37_field[28], kopo37_field_name[29], kopo37_field[29]);
				}
				System.out.printf("**********************************************************\n");
			} catch (Exception e) {
			} finally {
				if(kopo37_LineCnt == 100)break; // 100���� �Ǹ� Ż��
				kopo37_LineCnt++;
			}
//			if(LineCnt == 100)break; // 100���� �Ǹ� Ż��

		}
		
		System.out.println("���� ����� �� : " + kopo37_nearest); // ���� ������ �׸�, ���θ�, ����, �浵 ���
		System.out.println("���� �� �� : " + kopo37_farthest);
		System.out.printf("���� ����� �Ÿ� : %f\n", kopo37_minDist); // ���� ����� �Ÿ� ��� ��� 
		System.out.printf("���� �� �Ÿ� : %f\n", kopo37_maxDist); // ���� �� �Ÿ� ��� ���
		kopo37_br.close();

	}

}
