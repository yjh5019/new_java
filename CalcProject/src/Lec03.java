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

		String readtxt; // ���� ���� ���ڿ� ���� ����

		if ((readtxt = kopo37_br.readLine()) == null) { // ���� ���� �о� �ʵ��

			System.out.printf("�� ���� �Դϴ�\n"); // ���� �� ������ ��� ���
			return;
		}
		String[] field_name = readtxt.split("\t"); // �� �������� �ʵ带 ����

		double lat = 37.3860521; // ����
		double lng = 127.1214038; // �浵

		int LineCnt = 0; // ����� �׸�
		double minDist = Double.MAX_VALUE; // �ּ� �Ÿ� ���
		double maxDist = Double.MIN_VALUE; // �ִ� �Ÿ� ���
		String nearest = ""; // ���� ������
		String farthest = ""; // ���� �հ�

		while ((readtxt = kopo37_br.readLine()) != null) {
			try { //  �� �����Ϳ� ���� ���� ��� ���� try catch fiallay 
				String[] field = readtxt.split("\t"); // �� �������� �ʵ带 ����
				System.out.printf("**[%d��° �׸�]********************\n", LineCnt);
				System.out.printf("%s : %s\n", field_name[4], field[4]); // 10��° �׸��� ������ ���� �ּ�
				System.out.printf("%s : %s\n", field_name[28], field[28]); // 29�� ° ����
				System.out.printf("%s : %s\n", field_name[29], field[29]); // 30�� ° �浵

				double dist = Math.sqrt(Math.pow(Double.parseDouble(field[28]) - lat, 2) // ���� �Ÿ� ����
						+ Math.pow(Double.parseDouble(field[29]) - lng, 2));
				System.out.printf("���������� �Ÿ� : %f\n", dist); // ���� �Ÿ� ���

				if (dist < minDist) { // ���� ����� �Ÿ� ���
					minDist = dist;
					nearest = String.format("[%d��° �׸�] %s : %s, %s : %s, %s : %s", LineCnt, field_name[4], field[4],
							field_name[28], field[28], field_name[29], field[29]);
				}
				if (dist > maxDist) { // ���� �հŸ� ���
					maxDist = dist;
					farthest = String.format("[%d��° �׸�] %s : %s, %s : %s, %s : %s", LineCnt, field_name[4], field[4],
							field_name[28], field[28], field_name[29], field[29]);
				}
				System.out.printf("****************************************\n");
			} catch (Exception e) {
			} finally {
				if(LineCnt == 100)break; // 100���� �Ǹ� Ż��
				LineCnt++;
			}
//			if(LineCnt == 100)break; // 100���� �Ǹ� Ż��

		}
		
		System.out.println("���� ����� �� : " + nearest); // ���� ������ �׸�, ���θ�, ����, �浵 ���
		System.out.println("���� �� �� : " + farthest);
		System.out.printf("���� ����� �Ÿ� : %f\n", minDist); // ���� ����� �Ÿ� ��� ��� 
		System.out.printf("���� �� �Ÿ� : %f\n", maxDist); // ���� �� �Ÿ� ��� ���
		kopo37_br.close();

	}

}
