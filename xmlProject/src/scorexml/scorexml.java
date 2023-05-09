package scorexml;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class scorexml {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //  xml 파싱
		
		Document doc = docBuilder.parse(new File("C:\\Users\\pc\\score.xml")); //  xml 파일 가져오기
		
		Element root = doc.getDocumentElement();
		// 각 NodeList 변수에 xml 파일에서 가져온 정보들을 각각에 대입
		NodeList kp37_tag_name = doc.getElementsByTagName("name"); //  name 태그에 있는 모든 요소를 가져와 해당 변수에 저장함  getElementsByTagName()
		NodeList kp37_tag_studentid = doc.getElementsByTagName("studentid"); //변수 저장된 값에 nodelist로 반환함
		NodeList kp37_tag_kor = doc.getElementsByTagName("kor");
		NodeList kp37_tag_eng = doc.getElementsByTagName("eng");
		NodeList kp37_tag_mat = doc.getElementsByTagName("mat");
		
		System.out.println(kp37_tag_name.item(0).getFirstChild());
//		String a = tag_name.item(0);
		
		System.out.printf("*************************************\n");
	
		for(int i=0; i<kp37_tag_name.getLength();i++) { // 반복문을 통해 각각의 해당 변수들의 내용들을 출력
 			// tag_name.item(i)는 XML 파일에서 <name> 태그의 i번째 항목에 해당하는 노드를 의미
			// getFirstChild() 메서드는 해당 노드의 첫 번째 자식 노드를 반환합니다. 예를 들어, <name> 태그 안에 텍스트 노드가 있는 경우, getFirstChild() 메서드는 그 텍스트 노드
			// getNodeValue() 메서드는 해당 노드의 값(value)을 문자열 형태로 반환합니다. 즉, <name> 태그 안에 있는 이름을 문자열 형태로 반환
			//  tag_name.item(i).getFirstChild().getNodeValue()는 XML 파일에서 <name> 태그의 i번째 항목의 값을 문자열 형태로 반환하는 코드
			String a = kp37_tag_name.item(i).getFirstChild().getNodeValue();
			
			
			
			
			System.out.printf("이름 : %s\n",kp37_tag_name.item(i).getFirstChild().getNodeValue()); // 이름 출력
			System.out.printf("학번 : %s\n",kp37_tag_studentid.item(i).getFirstChild().getNodeValue()); // 학번 출력
			System.out.printf("국어 : %s\n",kp37_tag_kor.item(i).getFirstChild().getNodeValue());// 국어내용 출력
			System.out.printf("영어 : %s\n",kp37_tag_eng.item(i).getFirstChild().getNodeValue());// // 영어 출력
			System.out.printf("수학 : %s\n",kp37_tag_mat.item(i).getFirstChild().getNodeValue());// //  수학 출력
			System.out.printf("*************************************\n");
		}

	}

}
