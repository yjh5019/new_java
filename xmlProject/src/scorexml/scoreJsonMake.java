package scorexml;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class scoreJsonMake {
	
	// 하나의 데이터 레코드를 생성하는 함수
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject kp37_dataObject = new JSONObject();
		
		kp37_dataObject.put("name", name); // name 변수 
		kp37_dataObject.put("studentid", studentid); // 학번 변수
		
		JSONArray kp37_score = new JSONArray(); // 제이슨어레이 객체 생성
		
		kp37_score.add(kor); kp37_score.add(eng); kp37_score.add(mat); //  각 과목 추가
		
		kp37_dataObject.put("score", kp37_score);// 데이터 레코드에 점수 배열 추가
		
		
		return kp37_dataObject; // dataObject 반환
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject kp37_jsonObject = new JSONObject();   // JSON 객체 생성
		JSONArray kp37_datasArray = new JSONArray();   // JSON 배열 생성
		JSONObject kp37_dataObject = new JSONObject();   // 데이터 레코드를 담을 JSON 객체 생성
		kp37_dataObject.put("name", "나연");// 데이터 레코드의 이름 속성 추가
		kp37_dataObject.put("studentid", 209901); // 데이터 레코드의 학번 속성 추가
		
		//
		
		JSONArray score = new JSONArray();
		
		score.add(90);score.add(100); score.add(95);
		
		kp37_dataObject.put("score", score);
		kp37_datasArray.add(kp37_dataObject);
		
		kp37_datasArray.add(oneRec("정연", 209902,100,85,75));
		kp37_datasArray.add(oneRec("모모", 209903,90,85,75));
		kp37_datasArray.add(oneRec("사나", 209904,80,85,75));
		kp37_datasArray.add(oneRec("지효", 209905,100,90,75));
		kp37_datasArray.add(oneRec("미나", 209906,90,85,75));
		kp37_datasArray.add(oneRec("다연", 209907,80,85,75));
		kp37_datasArray.add(oneRec("채영", 209908,75,85,100));
		kp37_datasArray.add(oneRec("쯔위", 209909,80,90,75));
		
		
		try {
			FileWriter file = new FileWriter ("C:\\Users\\pc\\test.json"); // json 파일을 저장할 경로 설정
			file.write(kp37_datasArray.toJSONString()); // datasArray를 string 형태로 읽기
			file.flush(); // JSON 객체를 이용해 score 데이터를 생성하는 프로그램
			file.close(); // 파일 닫기
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON 만든것 : "+kp37_datasArray);
		
		
		
	}

}

