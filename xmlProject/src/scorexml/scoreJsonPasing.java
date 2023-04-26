package scorexml;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class scoreJsonPasing {

	public static void main(String[] args) throws FileNotFoundException,IOException, ParseException {
		// TODO Auto-generated method stub
		//JSON �ļ� ��ü ���� 
		JSONParser parser = new JSONParser(); // FileReader Ŭ������ �̿��Ͽ� JSON ������ �о�� �Ľ�
		
		Object obj = parser.parse(new FileReader("C:\\Users\\pc\\test.json")); // json ���� �Ľ�
		
		JSONArray array = (JSONArray)obj; // // JSON �迭 ���·� ����
		
		System.out.println("********************************************");
		
		for(int i=0; i<array.size(); i++) { // �迭 ũ�⸸ŭ �ݺ��Ͽ� �� ���
			
			JSONObject result = (JSONObject) array.get(i); // 
			System.out.println("�̸� : "+result.get("name")); // �̸� ���
			System.out.println("�й� : "+result.get("studentid")); //  �й� ���
			
			
			JSONArray score = (JSONArray) result.get("score"); // ������ ����, ��� ���
			long kor = (long)score.get(0);
			long eng = (long)score.get(1);
			long mat = (long)score.get(2);
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + mat);
			System.out.println("���� : " + (kor+eng+mat));
			System.out.println("��� : " + (kor+eng+mat)/3.0);
			System.out.println("********************************************");
			
			
			
			
			
			
			
			
		}
	}

}
