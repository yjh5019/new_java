import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Lec03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo37_f = new File("C:\\Users\\pc\\전국주차장정보표준데이터.txt"); // 해당 txt 파일을 가져와 f 에 저장
		BufferedReader kopo37_br = new BufferedReader(new FileReader(kopo37_f)); // 버퍼리더 객채 생성

		String readtxt; // 읽을 파일 문자열 변수 선언

		if ((readtxt = kopo37_br.readLine()) == null) { // 한줄 먼저 읽어 필드명

			System.out.printf("빈 파일 입니다\n"); // 만일 빈 파일일 경우 출력
			return;
		}
		String[] field_name = readtxt.split("\t"); // 탭 기준으로 필드를 나눔

		double lat = 37.3860521; // 위도
		double lng = 127.1214038; // 경도

		int LineCnt = 0; // 출력할 항목
		double minDist = Double.MAX_VALUE; // 최소 거리 출력
		double maxDist = Double.MIN_VALUE; // 최대 거리 출력
		String nearest = ""; // 가장 가까운곳
		String farthest = ""; // 가장 먼곳

		while ((readtxt = kopo37_br.readLine()) != null) {
			try { //  빈 데이터에 대한 에러 잡기 위한 try catch fiallay 
				String[] field = readtxt.split("\t"); // 탭 기준으로 필드를 나눔
				System.out.printf("**[%d번째 항목]********************\n", LineCnt);
				System.out.printf("%s : %s\n", field_name[4], field[4]); // 10번째 항목인 소재재 지번 주소
				System.out.printf("%s : %s\n", field_name[28], field[28]); // 29번 째 위도
				System.out.printf("%s : %s\n", field_name[29], field[29]); // 30번 째 경도

				double dist = Math.sqrt(Math.pow(Double.parseDouble(field[28]) - lat, 2) // 최종 거리 계산식
						+ Math.pow(Double.parseDouble(field[29]) - lng, 2));
				System.out.printf("현재지점과 거리 : %f\n", dist); // 현재 거리 출력

				if (dist < minDist) { // 가장 가까운 거리 출력
					minDist = dist;
					nearest = String.format("[%d번째 항목] %s : %s, %s : %s, %s : %s", LineCnt, field_name[4], field[4],
							field_name[28], field[28], field_name[29], field[29]);
				}
				if (dist > maxDist) { // 가장 먼거리 계산
					maxDist = dist;
					farthest = String.format("[%d번째 항목] %s : %s, %s : %s, %s : %s", LineCnt, field_name[4], field[4],
							field_name[28], field[28], field_name[29], field[29]);
				}
				System.out.printf("****************************************\n");
			} catch (Exception e) {
			} finally {
				if(LineCnt == 100)break; // 100개가 되면 탈출
				LineCnt++;
			}
//			if(LineCnt == 100)break; // 100개가 되면 탈출

		}
		
		System.out.println("가장 가까운 곳 : " + nearest); // 가장 가까운곳 항목, 도로명, 위도, 경도 출력
		System.out.println("가장 먼 곳 : " + farthest);
		System.out.printf("가장 가까운 거리 : %f\n", minDist); // 가장 가까운 거리 계산 출력 
		System.out.printf("가장 먼 거리 : %f\n", maxDist); // 가장 먼 거리 계산 출력
		kopo37_br.close();

	}

}
