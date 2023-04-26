import java.io.*;
public class Lec08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kp37_f = new File("C:\\Users\\pc\\THTSKS010H00.dat"); // 읽어올 파일 경로 설정
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); // // 파일 객체 생성
		
		File kp37_f1 = new File("C:\\Users\\pc\\StockDailyPrice.csv"); // 읽어올 파일을 기준으로 작성할 파일 경로 및 파일 이름 설정
		BufferedWriter kp37_bw1 = new BufferedWriter(new FileWriter(kp37_f1)); // 파일 객체 생성
		
		String kp37_readtxt;// 읽을 파일 문자형 변수 설장
		int kp37_cnt=0; int kp37_wcnt=0; // 카운트 변수 설정
		
		while((kp37_readtxt=kp37_br.readLine())!=null) { // 한줄 한줄 읽어오는 while문 작성
			
			StringBuffer kp37_s = new StringBuffer(); // StringBuffer 객체 생성
			String[] kp37_field = kp37_readtxt.split("%_%"); //  해당 문자를 기준으로 필드를 나눠
			
			if(kp37_field.length>2&&kp37_field[2].replace("^", "").trim().substring(0,1).equals("A")) { // 빈 공백을 없애고, 해당 필드의 0번째 값이 A일경우 반복문 실행
				for(int j=1; j<kp37_field.length;j++) { // 반복문 실행
					kp37_s.append(","+kp37_field[j].replace("^", "").trim()); // 해당 조건이 만족할때 ^를 없애고, 공백을 없앤뒤 kp37_s 변수에 저장
				}
				kp37_bw1.write(kp37_s.toString());kp37_bw1.newLine(); // 문자열로 변환한뒤 파일 작성
				kp37_wcnt++; // 카운트 증가
			}
			kp37_cnt++; //  카우트 증가
		}
		kp37_br.close(); // 읽어온 파일 닫기
		kp37_bw1.close(); //  작성 파일 닫기
		System.out.printf("Program End[%d][% d]records\n",kp37_cnt,kp37_wcnt);  // 해당 내용 출력 내용
	}

}
