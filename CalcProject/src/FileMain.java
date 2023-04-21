import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try { // try 구문을 통해 에러 발생안날때까지 수행
			
			File kopo37_f = new File("C:\\Users\\pc\\test.txt"); // 파일 객체 생성
			FileWriter kopo37_fw =  new FileWriter(kopo37_f); // 파일쓰기 객체 생성
			
			kopo37_fw.write("안녕 파일\n"); // 파일 내용 삽입
			kopo37_fw.write("hello 헬로\n");
			
			kopo37_fw.close(); // 파일 닫기
			
			FileReader kopo37_fr = new FileReader(kopo37_f); // 파일 읽기 객체 생성
			
			int kopo37_n = -1; // 변수 n 지정 및 -1 로 초기화
			char[] kopo37_ch; // 배열 char 형 변수 지정
			
			while(true) { // 반복문 시작
				
				kopo37_ch = new char [100]; // 100글자 배열 생성
				kopo37_n = kopo37_fr.read(kopo37_ch); // 변수 n 에 아까 읽은 파일 길이 읽기
				
				if(kopo37_n == -1)break; //  파일에 해당 내용이 없으면 while문 break
				
				for(int i=0; i<kopo37_n; i++) { // 만약 내용이 있다면
					
					System.out.printf("%c",kopo37_ch[i]); //  해당 내용을 출력
					
				}
			}
			kopo37_fr.close(); // 파일 읽기 닫기
			System.out.printf("\nFILE READ END"); // 해당 내용 모두 출력하면 출력
			
		}catch(Exception e) { // 에러 처리
			System.out.printf("나 에러[%s]\n",e); // 에러 처리되었을때 나오는 출력창
			
		}

	}

}

