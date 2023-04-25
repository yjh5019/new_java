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

		String kopo37_readtxt; // 읽을 파일 문자열 변수 선언

		if ((kopo37_readtxt = kopo37_br.readLine()) == null) { // 한줄 먼저 읽어 필드명

			System.out.printf("빈 파일 입니다\n"); // 만일 빈 파일일 경우 출력
			return;
		}
		String[] kopo37_field_name = kopo37_readtxt.split("\t"); // 탭 기준으로 필드를 나눔

		double kopo37_lat = 37.3860521; // 위도
		double kopo37_lng = 127.1214038; // 경도

		int kopo37_LineCnt = 0; // 출력할 항목
		double kopo37_minDist = Double.MAX_VALUE; // 최소 거리 출력
		double kopo37_maxDist = Double.MIN_VALUE; // 최대 거리 출력
		String kopo37_nearest = ""; // 가장 가까운곳
		String kopo37_farthest = ""; // 가장 먼곳

		while ((kopo37_readtxt = kopo37_br.readLine()) != null) {
			try { //  빈 데이터에 대한 에러 잡기 위한 try catch fiallay 
				String[] kopo37_field = kopo37_readtxt.split("\t"); // 탭 기준으로 필드를 나눔
				System.out.printf("**[%d번째 항목]*******************************************\n", kopo37_LineCnt);
				System.out.printf("%s : %s\n", kopo37_field_name[4], kopo37_field[4]); // 10번째 항목인 소재재 지번 주소
				System.out.printf("%s : %s\n", kopo37_field_name[28], kopo37_field[28]); // 29번 째 위도
				System.out.printf("%s : %s\n", kopo37_field_name[29], kopo37_field[29]); // 30번 째 경도

				double kopo37_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo37_field[28]) - kopo37_lat, 2) // 최종 거리 계산식
						+ Math.pow(Double.parseDouble(kopo37_field[29]) - kopo37_lng, 2));
				System.out.printf("현재지점과 거리 : %f\n", kopo37_dist); // 현재 거리 출력

				if (kopo37_dist < kopo37_minDist) { // 가장 가까운 거리 출력
					kopo37_minDist = kopo37_dist;
					kopo37_nearest = String.format("[%d번째 항목] %s : %s, %s : %s, %s : %s", kopo37_LineCnt, kopo37_field_name[4], kopo37_field[4],
							kopo37_field_name[28], kopo37_field[28], kopo37_field_name[29], kopo37_field[29]);
				}
				if (kopo37_dist > kopo37_maxDist) { // 가장 먼거리 계산
					kopo37_maxDist = kopo37_dist;
					kopo37_farthest = String.format("[%d번째 항목] %s : %s, %s : %s, %s : %s", kopo37_LineCnt, kopo37_field_name[4], kopo37_field[4],
							kopo37_field_name[28], kopo37_field[28], kopo37_field_name[29], kopo37_field[29]);
				}
				System.out.printf("**********************************************************\n");
			} catch (Exception e) {
			} finally {
				if(kopo37_LineCnt == 100)break; // 100개가 되면 탈출
				kopo37_LineCnt++;
			}
//			if(LineCnt == 100)break; // 100개가 되면 탈출

		}
		
		System.out.println("가장 가까운 곳 : " + kopo37_nearest); // 가장 가까운곳 항목, 도로명, 위도, 경도 출력
		System.out.println("가장 먼 곳 : " + kopo37_farthest);
		System.out.printf("가장 가까운 거리 : %f\n", kopo37_minDist); // 가장 가까운 거리 계산 출력 
		System.out.printf("가장 먼 거리 : %f\n", kopo37_maxDist); // 가장 먼 거리 계산 출력
		kopo37_br.close();

	}

}
