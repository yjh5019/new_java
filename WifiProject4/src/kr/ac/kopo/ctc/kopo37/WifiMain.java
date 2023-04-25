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
				
				
				int kopo37_LineCnt = 0; // ����� �׸�
				
				WifiItem me  = new WifiItem();
				
				
				me.setLatitude("37.3860521"); // ���� ��ġ ����
				me.setLongitude("127.1214038"); // ���� ��ġ �浵
				
				double kopo37_minDist = Double.MAX_VALUE; // �ּ� �Ÿ� ���
				double kopo37_maxDist = Double.MIN_VALUE; // �ִ� �Ÿ� ���
				String kopo37_nearest = ""; // ���� ������
				String kopo37_farthest = ""; // ���� �հ�
				String min_name = ""; // ����� ��Ҹ�
				String max_name = ""; //  �� ��Ҹ�
				String min_address = ""; //  ����� �ּ�
				String max_address = ""; //  �� �ּ�
				String min_Latitude = ""; // ����� ����
				String max_Latitude = ""; // �� ����
				String min_Longtitude = ""; // ����� �浵
				String max_Longtitude = ""; //  �� �浵
				
				
				for(WifiItem target : wifiItems) { // �ݺ����� ���� wifiItems�� ����� �͵��� �ϳ��ϳ� ������ ����
					
					
					
					double kopo37_dist = wifiItemService.getDistance(me,target); // �Ÿ� ���ϱ�
					distanceList.add(kopo37_dist); // �Ÿ� ����Ʈ�� ����
					
					if (kopo37_dist < kopo37_minDist) {  // ���� ����� �Ÿ� ���
		                kopo37_minDist = kopo37_dist; // ������ ������������ ����� �Ÿ��� �������� ����ϴ� �������� �����ϰ� ���ǿ� �´ٸ� �־���
		                min_name = target.getInstallationLocationName();// ���� ����� �Ÿ� ���
		                min_address = target.getRoadNameAddress();// ���� ����� �Ÿ� ���
		                min_Latitude = target.getLatitude();// ���� ����� �Ÿ� ���
		                min_Longtitude = target.getLongitude();// ���� ����� �Ÿ� ���
		            }
		            if (kopo37_dist > kopo37_maxDist) { //  ���� �հŸ� ��� 
		                kopo37_maxDist = kopo37_dist;// ������ ������������ ����� �Ÿ��� �������� ����ϴ� �������� �����ϰ� ���ǿ� �´ٸ� �־���
		                max_name = target.getInstallationLocationName();
		                max_address = target.getRoadNameAddress();//  ���� �հŸ� ��� 
		                max_Latitude = target.getLatitude();//  ���� �հŸ� ��� 
		                max_Longtitude = target.getLongitude();//  ���� �հŸ� ��� 
		            }
				}
				
				//���
				System.out.println("=====���� ����� ����======");
				System.out.println(kopo37_minDist);
				System.out.println("����� �ּҸ� : "+min_name);
				System.out.println("����� �Ÿ� �ּ� : "+min_address);
				System.out.println("���� ����� ���� : "+min_Latitude);
				System.out.println("���� ����� �浵 : "+min_Longtitude);
				System.out.println();
				System.out.println("=====���� �� ����==========");
				System.out.println(kopo37_maxDist);
				System.out.println("�� �ּҸ� : "+max_name);
				System.out.println("�� �ּ� : "+max_address);
				System.out.println("���� �� ���� : "+max_Latitude);
				System.out.println("���� �� �浵 : "+max_Longtitude);
				

			

		

	}

}
