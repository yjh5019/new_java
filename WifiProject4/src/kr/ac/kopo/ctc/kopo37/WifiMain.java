package kr.ac.kopo.ctc.kopo37;

import java.io.IOException;
import java.util.*;

import kr.ac.kopo.ctc.kopo37.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo37.domain.WifiItem;
import kr.ac.kopo.ctc.kopo37.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

				WifiItemService wifiItemService =  new WifiItemService();
				WifiItemDao wifiItemDao = new WifiItemDao();
				List<WifiItem> wifiItems = wifiItemDao.selectAll();
				List<Double> distanceList = new ArrayList<Double>();
				
				
				int kopo37_LineCnt = 0; // 출력할 항목
				
				WifiItem me  = new WifiItem();
				
				
				me.setLatitude("37.3860521"); // 나의 위치 위도
				me.setLongitude("127.1214038"); // 나의 위치 경도
				
				double kopo37_minDist = Double.MAX_VALUE; // 최소 거리 출력
				double kopo37_maxDist = Double.MIN_VALUE; // 최대 거리 출력
				String kopo37_nearest = ""; // 가장 가까운곳
				String kopo37_farthest = ""; // 가장 먼곳
				String min_name = ""; // 가까운 장소명
				String max_name = ""; //  먼 장소명
				String min_address = ""; //  가까운 주소
				String max_address = ""; //  먼 주소
				String min_Latitude = ""; // 가까운 위도
				String max_Latitude = ""; // 먼 위도
				String min_Longtitude = ""; // 가까운 경도
				String max_Longtitude = ""; //  먼 경도
				
				
				for(WifiItem target : wifiItems) { // 반복문을 통해 wifiItems에 저장된 것들을 하나하나 끄집어 내서
					
					
					
					double kopo37_dist = wifiItemService.getDistance(me,target); // 거리 구하기
					distanceList.add(kopo37_dist); // 거리 리스트에 저장
					
					if (kopo37_dist < kopo37_minDist) {  // 가장 가까운 거리 출력
		                kopo37_minDist = kopo37_dist; // 각각의 관련정보들을 가까운 거리를 기준으로 계산하는 변수들을 생성하고 조건에 맞다면 넣어줌
		                min_name = target.getInstallationLocationName();// 가장 가까운 거리 출력
		                min_address = target.getRoadNameAddress();// 가장 가까운 거리 출력
		                min_Latitude = target.getLatitude();// 가장 가까운 거리 출력
		                min_Longtitude = target.getLongitude();// 가장 가까운 거리 출력
		            }
		            if (kopo37_dist > kopo37_maxDist) { //  가장 먼거리 계산 
		                kopo37_maxDist = kopo37_dist;// 각각의 관련정보들을 가까운 거리를 기준으로 계산하는 변수들을 생성하고 조건에 맞다면 넣어줌
		                max_name = target.getInstallationLocationName();
		                max_address = target.getRoadNameAddress();//  가장 먼거리 계산 
		                max_Latitude = target.getLatitude();//  가장 먼거리 계산 
		                max_Longtitude = target.getLongitude();//  가장 먼거리 계산 
		            }
				}
				
				//출력
				System.out.println("=====가장 가까운 정보======");
				System.out.println(kopo37_minDist);
				System.out.println("가까운 주소명 : "+min_name);
				System.out.println("가까운 거리 주소 : "+min_address);
				System.out.println("가장 가까운 위도 : "+min_Latitude);
				System.out.println("가장 가까운 경도 : "+min_Longtitude);
				System.out.println();
				System.out.println("=====가장 먼 정보==========");
				System.out.println(kopo37_maxDist);
				System.out.println("먼 주소명 : "+max_name);
				System.out.println("먼 주소 : "+max_address);
				System.out.println("가장 먼 위도 : "+max_Latitude);
				System.out.println("가장 먼 경도 : "+max_Longtitude);
				

			

		

	}

}
