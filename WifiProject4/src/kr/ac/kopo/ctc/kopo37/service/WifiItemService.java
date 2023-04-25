package kr.ac.kopo.ctc.kopo37.service;

import kr.ac.kopo.ctc.kopo37.domain.WifiItem;

public class WifiItemService {
	
	public double getDistance(WifiItem a ,WifiItem b) {
		
//		double kopo37_lat = 37.3860521; // ����
//		double kopo37_lng = 127.1214038; //  �浵
		double kopo37_dist = Math.sqrt(Math.pow(Double.parseDouble(a.getLatitude())-Double.parseDouble(b.getLatitude()),2) //  ���� �Ÿ� ����
				+ Math.pow(Double.parseDouble(a.getLongitude())-Double.parseDouble(b.getLongitude()),2));
		
		return kopo37_dist;
		
	}
	
	
	

}
//double kopo37_dist = Math.sqrt(Math.pow(Double.parseDouble(a.getLatitude())-kopo37_lat,2) //  ���� �Ÿ� ����
//		+ Math.pow(b.getLongitude()-kopo37_lng,2));