import java.io.*;
import java.io.BufferedReader;
public class Buffered {
	public static void FileWrite() throws IOException{
		//���۴� �����͸� �� ������ �ٸ� �� ������ �����ϴ� ���� �Ͻ������� 
		//�� �����͸� �����ϴ� �޸��� ����
		File kopo37_f = new File("C:\\Users\\pc\\test.txt");  // ���� ��ü ����
		BufferedWriter kopo37_bw =  new BufferedWriter(new FileWriter(kopo37_f));
		
		kopo37_bw.write("�ȳ� ����"); // ���� ���� ����
		kopo37_bw.newLine(); // �ٹٲ�
		kopo37_bw.write("hello ���"); // ���� ���� ����
		kopo37_bw.newLine(); //  �ٹٲ�
		
		kopo37_bw.close(); //  ����write �ݱ�
		
		
		
	}
	public static void FileRead() throws IOException{
		File kopo37_f = new File("C:\\Users\\pc\\test.txt"); // �ش� txt ������ ������ f �� ����
		BufferedReader kopo37_br =  new BufferedReader(new FileReader(kopo37_f)); // ���۸��� ��ä ����
		
		String kopo37_readtxt; //  ���� string ������ ���� ����
		
		while((kopo37_readtxt = kopo37_br.readLine()) != null) { // readLine�� ���� ���پ� �о��
			System.out.printf("%s\n", kopo37_readtxt); // �ش� ������ �а� ���
		}
		
		kopo37_br.close(); // BufferedReader �ݱ�
		
		
	}
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWrite(); // ���� ���� ���� ����
		FileRead(); //  ���� ���� �а� ��� ����
		

	}

}
