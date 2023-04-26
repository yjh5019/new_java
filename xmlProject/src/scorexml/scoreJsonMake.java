package scorexml;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class scoreJsonMake {
	
	// �ϳ��� ������ ���ڵ带 �����ϴ� �Լ�
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject dataObject = new JSONObject();
		
		dataObject.put("name", name); // name ���� 
		dataObject.put("studentid", studentid); // �й� ����
		
		JSONArray score = new JSONArray(); // ���̽���� ��ü ����
		
		score.add(kor); score.add(eng); score.add(mat); //  �� ���� �߰�
		
		dataObject.put("score", score);// ������ ���ڵ忡 ���� �迭 �߰�
		
		
		return dataObject; // dataObject ��ȯ
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new JSONObject();   // JSON ��ü ����
		JSONArray datasArray = new JSONArray();   // JSON �迭 ����
		JSONObject dataObject = new JSONObject();   // ������ ���ڵ带 ���� JSON ��ü ����
		dataObject.put("name", "����");// ������ ���ڵ��� �̸� �Ӽ� �߰�
		dataObject.put("studentid", 209901); // ������ ���ڵ��� �й� �Ӽ� �߰�
		
		//
		
		JSONArray score = new JSONArray();
		
		score.add(90);score.add(100); score.add(95);
		
		dataObject.put("score", score);
		datasArray.add(dataObject);
		
		datasArray.add(oneRec("����", 209902,100,85,75));
		datasArray.add(oneRec("���", 209903,90,85,75));
		datasArray.add(oneRec("�糪", 209904,80,85,75));
		datasArray.add(oneRec("��ȿ", 209905,100,90,75));
		datasArray.add(oneRec("�̳�", 209906,90,85,75));
		datasArray.add(oneRec("�ٿ�", 209907,80,85,75));
		datasArray.add(oneRec("ä��", 209908,75,85,100));
		datasArray.add(oneRec("����", 209909,80,90,75));
		
		
		try {
			FileWriter file = new FileWriter ("C:\\Users\\pc\\test.json"); // json ������ ������ ��� ����
			file.write(datasArray.toJSONString()); // datasArray�� string ���·� �б�
			file.flush(); // JSON ��ü�� �̿��� score �����͸� �����ϴ� ���α׷�
			file.close(); // ���� �ݱ�
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON ����� : "+datasArray);
		
		
		
	}

}

