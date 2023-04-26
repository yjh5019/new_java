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
		JSONParser parser = new JSONParser(); // FileReader 클래스를 이용하여 JSON 파일을 읽어와 파싱
		
		Object obj = parser.parse(new FileReader("C:\\Users\\pc\\test.json")); // json 파일 파싱
		
		JSONArray array = (JSONArray)obj; // // JSON 배열 형태로 저장
		
		System.out.println("********************************************");
		
		for(int i=0; i<array.size(); i++) { // 배열 크기만큼 반복하여 값 출력
			
			JSONObject result = (JSONObject) array.get(i); // 
			System.out.println("이름 : "+result.get("name")); // 이름 출력
			System.out.println("학번 : "+result.get("studentid")); //  학번 출력
			
			
			JSONArray score = (JSONArray) result.get("score"); // 점수와 총점, 평균 출력
			long kor = (long)score.get(0);
			long eng = (long)score.get(1);
			long mat = (long)score.get(2);
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("총점 : " + (kor+eng+mat));
			System.out.println("평균 : " + (kor+eng+mat)/3.0);
			System.out.println("********************************************");
			
			
			
			
			
			
			
			
		}
	}

}
