import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Lec01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File kopo37_f = new File("C:\\Users\\pc\\12_04_07_E_무료와이파이정보.csv"); // 해당 txt 파일을 가져와 f 에 저장
		BufferedReader kopo37_br =  new BufferedReader(new FileReader(kopo37_f)); // 버퍼리더 객채 생성
		
		String kopo37_readtxt; // 읽기 파일 변수 선언
		
		
		if((kopo37_readtxt = kopo37_br.readLine() )== null) { //  빈 파일일 경우 리턴
			
			System.out.printf("빈 파일 입니다\n");
			return;
		}
		String [] field_name = kopo37_readtxt.split(","); // , 를 기준으로 나눠서 저장
		
		int kopo37_LineCnt = 0; // 카운트 변수 선언
		
		while((kopo37_readtxt = kopo37_br.readLine()) != null) {
			
			String[] kopo37_field = kopo37_readtxt.split(",");  // , 를 기준으로 나눠서 구분
			
			System.out.printf("**[%d번째 항목]***************\n",kopo37_LineCnt); //  항목 출력
			
			for(int j=0; j<field_name.length; j++) { // 반복문을 통해 해당 항목들 출력
				System.out.printf("%s : %s\n",field_name[j], kopo37_field[j]);
			}
			
			System.out.printf("******************************\n");
			if(kopo37_LineCnt == 100) break; // 100개 출력시 반복문 종료
			kopo37_LineCnt++; // 카운트 증가
			
		}
		kopo37_br.close(); //  BufferedReader 종료
		

	}

}
