import java.io.BufferedReader;
import java.io.*;
public class Lec07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kp37_f = new File("C:\\Users\\pc\\THTSKS010H00.dat"); // 파일 경로를 지정
		
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); // 파일 객체 생성
		//읽을 파일의 문자열 변수와 해당 라인을 카운트할 변수
		String kp37_readtxt; // 읽을 파일 문자형 변수 설장
		int kp37_LineCnt = 0; // 해당 라인을 세기 위한 정수형 변수
		int kp37_n = -1; // 
		
		StringBuffer kp37_s = new StringBuffer();
		
		while(true) { // 무한 루프를 통해 해당 파일을 읽어오는 내용
			
			//해당 배열에 저장된 문자열을 한 글자씩 순회하면서 줄바꿈 문자를 만나면, 문자열을 출력하고 StringBuffer를 초기화
			char[] kp37_ch = new char[1000]; // char형 배열 선언
			kp37_n = kp37_br.read(kp37_ch);
			if(kp37_n == -1)break;
			for(char kp37_c : kp37_ch) {
				if(kp37_c=='\n') { // 해당 문자열의 줄바꿈이 있다면
					System.out.printf("[%s]***\n",kp37_s.toString()); //  해당 라인을 출력하고
					kp37_s.delete(0, kp37_s.length()); // 초기화
				}else {
					kp37_s.append(kp37_c); // 그게 아니라면 해당 내용을 추가함
				}
				
			}
			kp37_LineCnt++; // 라인 카운트 세기
		}
		System.out.printf("[%s]***\n",kp37_s.toString()); // 해당 내용을 출력하기 위해 문자열로 변환하여 출력
		kp37_br.close();

	}

}
