import java.io.*;
import java.io.BufferedReader;
public class Buffered {
	public static void FileWrite() throws IOException{
		//버퍼는 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 
		//그 데이터를 보관하는 메모리의 영역
		File kopo37_f = new File("C:\\Users\\pc\\test.txt");  // 파일 객체 생성
		BufferedWriter kopo37_bw =  new BufferedWriter(new FileWriter(kopo37_f));
		
		kopo37_bw.write("안녕 파일"); // 파일 내용 삽입
		kopo37_bw.newLine(); // 줄바꿈
		kopo37_bw.write("hello 헬로"); // 파일 내용 삽입
		kopo37_bw.newLine(); //  줄바꿈
		
		kopo37_bw.close(); //  버퍼write 닫기
		
		
		
	}
	public static void FileRead() throws IOException{
		File kopo37_f = new File("C:\\Users\\pc\\test.txt"); // 해당 txt 파일을 가져와 f 에 저장
		BufferedReader kopo37_br =  new BufferedReader(new FileReader(kopo37_f)); // 버퍼리더 객채 생성
		
		String kopo37_readtxt; //  읽을 string 파일을 변수 설정
		
		while((kopo37_readtxt = kopo37_br.readLine()) != null) { // readLine을 통해 한줄씩 읽어와
			System.out.printf("%s\n", kopo37_readtxt); // 해당 내용을 읽고 출력
		}
		
		kopo37_br.close(); // BufferedReader 닫기
		
		
	}
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWrite(); // 파일 내용 사입 실행
		FileRead(); //  파일 내용 읽고 출력 실행
		

	}

}
