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
		//JSON 파서 객체 생성 
		JSONParser kp37_parser = new JSONParser(); // FileReader 클래스를 이용하여 JSON 파일을 읽어와 파싱
		
		Object kp37_obj = kp37_parser.parse(new FileReader("C:\\Users\\pc\\test.json")); // json 파일 파싱
		
		JSONArray kp37_array = (JSONArray)kp37_obj; // // JSON 배열 형태로 저장
		
		System.out.println("********************************************");
		
		for(int kp37_i=0; kp37_i<kp37_array.size(); kp37_i++) { // 배열 크기만큼 반복하여 값 출력
			
			JSONObject result = (JSONObject) kp37_array.get(kp37_i); // 
			System.out.println("이름 : "+result.get("name")); // 이름 출력
			System.out.println("학번 : "+result.get("studentid")); //  학번 출력
			
			
			JSONArray kp37_score = (JSONArray) result.get("score"); // 점수와 총점, 평균 출력
			long kp37_kor = (long)kp37_score.get(0);
			long kp37_eng = (long)kp37_score.get(1);
			long kp37_mat = (long)kp37_score.get(2);
			System.out.println("국어 : " + kp37_kor);
			System.out.println("영어 : " + kp37_eng);
			System.out.println("수학 : " + kp37_mat);
			System.out.println("총점 : " + (kp37_kor+kp37_eng+kp37_mat));
			System.out.println("평균 : " + (kp37_kor+kp37_eng+kp37_mat)/3.0);
			System.out.println("********************************************");
			
			
			
			
			
			
			
			
		}
	}

}
