import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Lec01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File kopo37_f = new File("C:\\Users\\pc\\12_04_07_E_���������������.csv"); // �ش� txt ������ ������ f �� ����
		BufferedReader kopo37_br =  new BufferedReader(new FileReader(kopo37_f)); // ���۸��� ��ä ����
		
		String kopo37_readtxt; // �б� ���� ���� ����
		
		
		if((kopo37_readtxt = kopo37_br.readLine() )== null) { //  �� ������ ��� ����
			
			System.out.printf("�� ���� �Դϴ�\n");
			return;
		}
		String [] field_name = kopo37_readtxt.split(","); // , �� �������� ������ ����
		
		int kopo37_LineCnt = 0; // ī��Ʈ ���� ����
		
		while((kopo37_readtxt = kopo37_br.readLine()) != null) {
			
			String[] kopo37_field = kopo37_readtxt.split(",");  // , �� �������� ������ ����
			
			System.out.printf("**[%d��° �׸�]***************\n",kopo37_LineCnt); //  �׸� ���
			
			for(int j=0; j<field_name.length; j++) { // �ݺ����� ���� �ش� �׸�� ���
				System.out.printf("%s : %s\n",field_name[j], kopo37_field[j]);
			}
			
			System.out.printf("******************************\n");
			if(kopo37_LineCnt == 100) break; // 100�� ��½� �ݺ��� ����
			kopo37_LineCnt++; // ī��Ʈ ����
			
		}
		kopo37_br.close(); //  BufferedReader ����
		

	}

}
