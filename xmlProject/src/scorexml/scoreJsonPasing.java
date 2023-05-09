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
		JSONParser kp37_parser = new JSONParser(); // FileReader Ŭ������ �̿��Ͽ� JSON ������ �о�� �Ľ�
		
		Object kp37_obj = kp37_parser.parse(new FileReader("C:\\Users\\pc\\test.json")); // json ���� �Ľ�
		
		JSONArray kp37_array = (JSONArray)kp37_obj; // // JSON �迭 ���·� ����
		
		System.out.println("********************************************");
		
		for(int kp37_i=0; kp37_i<kp37_array.size(); kp37_i++) { // �迭 ũ�⸸ŭ �ݺ��Ͽ� �� ���
			
			JSONObject result = (JSONObject) kp37_array.get(kp37_i); // 
			System.out.println("�̸� : "+result.get("name")); // �̸� ���
			System.out.println("�й� : "+result.get("studentid")); //  �й� ���
			
			
			JSONArray kp37_score = (JSONArray) result.get("score"); // ������ ����, ��� ���
			long kp37_kor = (long)kp37_score.get(0);
			long kp37_eng = (long)kp37_score.get(1);
			long kp37_mat = (long)kp37_score.get(2);
			System.out.println("���� : " + kp37_kor);
			System.out.println("���� : " + kp37_eng);
			System.out.println("���� : " + kp37_mat);
			System.out.println("���� : " + (kp37_kor+kp37_eng+kp37_mat));
			System.out.println("��� : " + (kp37_kor+kp37_eng+kp37_mat)/3.0);
			System.out.println("********************************************");
			
			
			
			
			
			
			
			
		}
	}

}
