import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try { // try ������ ���� ���� �߻��ȳ������� ����
			
			File kopo37_f = new File("C:\\Users\\pc\\test.txt"); // ���� ��ü ����
			FileWriter kopo37_fw =  new FileWriter(kopo37_f); // ���Ͼ��� ��ü ����
			
			kopo37_fw.write("�ȳ� ����\n"); // ���� ���� ����
			kopo37_fw.write("hello ���\n");
			
			kopo37_fw.close(); // ���� �ݱ�
			
			FileReader kopo37_fr = new FileReader(kopo37_f); // ���� �б� ��ü ����
			
			int kopo37_n = -1; // ���� n ���� �� -1 �� �ʱ�ȭ
			char[] kopo37_ch; // �迭 char �� ���� ����
			
			while(true) { // �ݺ��� ����
				
				kopo37_ch = new char [100]; // 100���� �迭 ����
				kopo37_n = kopo37_fr.read(kopo37_ch); // ���� n �� �Ʊ� ���� ���� ���� �б�
				
				if(kopo37_n == -1)break; //  ���Ͽ� �ش� ������ ������ while�� break
				
				for(int i=0; i<kopo37_n; i++) { // ���� ������ �ִٸ�
					
					System.out.printf("%c",kopo37_ch[i]); //  �ش� ������ ���
					
				}
			}
			kopo37_fr.close(); // ���� �б� �ݱ�
			System.out.printf("\nFILE READ END"); // �ش� ���� ��� ����ϸ� ���
			
		}catch(Exception e) { // ���� ó��
			System.out.printf("�� ����[%s]\n",e); // ���� ó���Ǿ����� ������ ���â
			
		}

	}

}

