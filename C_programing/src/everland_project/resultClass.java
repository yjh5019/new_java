package everland_project;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class resultClass {
	
	
	public void reportCsv() throws IOException {
		
		File file = new File("C:\\Users\\pc\\everland1.csv");
		BufferedReader br =  new BufferedReader(new FileReader(file));
		
		String readtxt;
		
		
		if((readtxt = br.readLine() )== null) { //  �� ������ ��� ����
			
			System.out.printf("�� ���� �Դϴ�\n");
			return;
		}
		String [] field_name = readtxt.split(",");
		for(int i=0; i<field_name.length;i++) {
			
			System.out.printf("%s\t",field_name[i]);
		}
		System.out.println();
		while((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			
			
			for(int j=0; j<field_name.length; j++) { // �ݺ����� ���� �ش� �׸�� ���
				System.out.printf("%s\t", field[j]);
			}
			System.out.println("\n");
			
		}
		br.close();
		
	}
	

}
