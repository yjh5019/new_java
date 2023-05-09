package scorexml;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class scoreJsonMake {
	
	// �ϳ��� ������ ���ڵ带 �����ϴ� �Լ�
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject kp37_dataObject = new JSONObject();
		
		kp37_dataObject.put("name", name); // name ���� 
		kp37_dataObject.put("studentid", studentid); // �й� ����
		
		JSONArray kp37_score = new JSONArray(); // ���̽���� ��ü ����
		
		kp37_score.add(kor); kp37_score.add(eng); kp37_score.add(mat); //  �� ���� �߰�
		
		kp37_dataObject.put("score", kp37_score);// ������ ���ڵ忡 ���� �迭 �߰�
		
		
		return kp37_dataObject; // dataObject ��ȯ
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject kp37_jsonObject = new JSONObject();   // JSON ��ü ����
		JSONArray kp37_datasArray = new JSONArray();   // JSON �迭 ����
		JSONObject kp37_dataObject = new JSONObject();   // ������ ���ڵ带 ���� JSON ��ü ����
		kp37_dataObject.put("name", "����");// ������ ���ڵ��� �̸� �Ӽ� �߰�
		kp37_dataObject.put("studentid", 209901); // ������ ���ڵ��� �й� �Ӽ� �߰�
		
		//
		
		JSONArray score = new JSONArray();
		
		score.add(90);score.add(100); score.add(95);
		
		kp37_dataObject.put("score", score);
		kp37_datasArray.add(kp37_dataObject);
		
		kp37_datasArray.add(oneRec("����", 209902,100,85,75));
		kp37_datasArray.add(oneRec("���", 209903,90,85,75));
		kp37_datasArray.add(oneRec("�糪", 209904,80,85,75));
		kp37_datasArray.add(oneRec("��ȿ", 209905,100,90,75));
		kp37_datasArray.add(oneRec("�̳�", 209906,90,85,75));
		kp37_datasArray.add(oneRec("�ٿ�", 209907,80,85,75));
		kp37_datasArray.add(oneRec("ä��", 209908,75,85,100));
		kp37_datasArray.add(oneRec("����", 209909,80,90,75));
		
		
		try {
			FileWriter file = new FileWriter ("C:\\Users\\pc\\test.json"); // json ������ ������ ��� ����
			file.write(kp37_datasArray.toJSONString()); // datasArray�� string ���·� �б�
			file.flush(); // JSON ��ü�� �̿��� score �����͸� �����ϴ� ���α׷�
			file.close(); // ���� �ݱ�
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON ����� : "+kp37_datasArray);
		
		
		
	}

}

