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
		
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //  xml �Ľ�
		
		Document doc = docBuilder.parse(new File("C:\\Users\\pc\\score.xml")); //  xml ���� ��������
		
		Element root = doc.getDocumentElement();
		// �� NodeList ������ xml ���Ͽ��� ������ �������� ������ ����
		NodeList kp37_tag_name = doc.getElementsByTagName("name"); //  name �±׿� �ִ� ��� ��Ҹ� ������ �ش� ������ ������  getElementsByTagName()
		NodeList kp37_tag_studentid = doc.getElementsByTagName("studentid"); //���� ����� ���� nodelist�� ��ȯ��
		NodeList kp37_tag_kor = doc.getElementsByTagName("kor");
		NodeList kp37_tag_eng = doc.getElementsByTagName("eng");
		NodeList kp37_tag_mat = doc.getElementsByTagName("mat");
		
		System.out.println(kp37_tag_name.item(0).getFirstChild());
//		String a = tag_name.item(0);
		
		System.out.printf("*************************************\n");
	
		for(int i=0; i<kp37_tag_name.getLength();i++) { // �ݺ����� ���� ������ �ش� �������� ������� ���
 			// tag_name.item(i)�� XML ���Ͽ��� <name> �±��� i��° �׸� �ش��ϴ� ��带 �ǹ�
			// getFirstChild() �޼���� �ش� ����� ù ��° �ڽ� ��带 ��ȯ�մϴ�. ���� ���, <name> �±� �ȿ� �ؽ�Ʈ ��尡 �ִ� ���, getFirstChild() �޼���� �� �ؽ�Ʈ ���
			// getNodeValue() �޼���� �ش� ����� ��(value)�� ���ڿ� ���·� ��ȯ�մϴ�. ��, <name> �±� �ȿ� �ִ� �̸��� ���ڿ� ���·� ��ȯ
			//  tag_name.item(i).getFirstChild().getNodeValue()�� XML ���Ͽ��� <name> �±��� i��° �׸��� ���� ���ڿ� ���·� ��ȯ�ϴ� �ڵ�
			String a = kp37_tag_name.item(i).getFirstChild().getNodeValue();
			
			
			
			
			System.out.printf("�̸� : %s\n",kp37_tag_name.item(i).getFirstChild().getNodeValue()); // �̸� ���
			System.out.printf("�й� : %s\n",kp37_tag_studentid.item(i).getFirstChild().getNodeValue()); // �й� ���
			System.out.printf("���� : %s\n",kp37_tag_kor.item(i).getFirstChild().getNodeValue());// ����� ���
			System.out.printf("���� : %s\n",kp37_tag_eng.item(i).getFirstChild().getNodeValue());// // ���� ���
			System.out.printf("���� : %s\n",kp37_tag_mat.item(i).getFirstChild().getNodeValue());// //  ���� ���
			System.out.printf("*************************************\n");
		}

	}

}
