import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			file f = new File("C:\\Users\\pc\\test.txt");
			FileWriter fw =  new FileWriter(f);
			
			fw.wirte("�ȳ� ����\n");
			fw.wirte("hello ���\n");
			
			fw.close();
			
			FileReader fr = new FileReader(f);
			
			int n = -1;
			char[] ch;
			
			while(true) {
				
				ch = new char [100];
				n = fr.read(ch);
				
				if(n == -1)break;
				
				for(int i=0; i<n; i++) {
					
					System.out.printf("%c",ch[i]);
					
				}
			}
			fr.close();
			System.out.printf("\n FILE READ END");
			
		}catch(Exception e) {
			System.out.printf("�� ����[%s]\n",e);
		}
	}

}
