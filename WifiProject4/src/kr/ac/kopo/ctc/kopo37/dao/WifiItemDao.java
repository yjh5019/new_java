package kr.ac.kopo.ctc.kopo37.dao;
import kr.ac.kopo.ctc.kopo37.domain.WifiItem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import kr.ac.kopo.ctc.kopo37.domain.WifiItem;

public class WifiItemDao {
	
	public WifiItem create(WifiItem wifiItem) {
		return null;
	}
	
	//read
	
	public WifiItem selectOne(int id) {
		return null;
	}
	////////////////////////////////////////
	public List<WifiItem> selectAll() throws IOException{
		
		
		File kopo37_f = new File("C:\\Users\\pc\\PublicWifi.txt"); // 해당 txt 파일을 가져와 f 에 저장
		BufferedReader kopo37_br =  new BufferedReader(new FileReader(kopo37_f)); // 버퍼리더 객채 생성
		String kopo37_readtxt = kopo37_br.readLine(); // 읽을 파일 문자열 변수 선언
		List<WifiItem> data = new ArrayList<WifiItem>();
		
//		if((kopo37_readtxt = kopo37_br.readLine() )== null) { // 한줄 먼저 읽어 필드명
//			
//			System.out.printf("빈 파일 입니다\n");  //  만일 빈 파일일 경우 출력
//			kopo37_br.close();
//			return null;
//		}
	
		while((kopo37_readtxt = kopo37_br.readLine()) != null) {
			
			WifiItem wifiItem = new WifiItem();
			String[] kopo37_field_name = kopo37_readtxt.split("\t");
			
			wifiItem.setId(kopo37_field_name[0]); // 번호 리스트에 저장
			wifiItem.setInstallationLocationName(kopo37_field_name[1]); // 설치장소명 리스트 저장
			wifiItem.setInstallatonLocationDetails(kopo37_field_name[2]); // 설치장소 상세 리스트에 저장
			wifiItem.setInstallationCityName(kopo37_field_name[3]); // 설치시도명 저장
			wifiItem.setInstallationDistrictName(kopo37_field_name[4]); // 설치시구군명 리스트에 저장
			wifiItem.setInstallationFacilityType(kopo37_field_name[5]); // 설치시설구분 리스트에 저장
			
			wifiItem.setInstallatonProviderName(kopo37_field_name[6]); //서비스 제공사명 리스트 저장
			wifiItem.setWifiSsid(kopo37_field_name[7]); //  와이파이ssid 리스트 저장
			wifiItem.setDateOfinstallation(kopo37_field_name[8]); // 설치연월 리스트 저장
			wifiItem.setRoadNameAddress(kopo37_field_name[9]); // 소재지도로명주소 리스트 저장
			wifiItem.setLotNumberAddress(kopo37_field_name[10]); // 소재지지번주소 리스트 저장
			wifiItem.setManagementAgencyName(kopo37_field_name[11]); // 관리기관명 리스트 저장
			wifiItem.setManagementAgencyPhoneNumber(kopo37_field_name[12]); // 관리기관전화번호
			wifiItem.setLatitude(kopo37_field_name[13]); // 위도
			wifiItem.setLongitude(kopo37_field_name[14]); //  경도
			wifiItem.setCreated(kopo37_field_name[15]); // 데이터기준일자
			
			data.add(wifiItem); // 데이터에 추가
			
			
		}
		kopo37_br.close(); // 읽기 그만
		
		return data; // 반환값 data
	}
	//////////////////////////////////////////
	public WifiItem update(int id, WifiItem wifiItem) {
		return null;
	}
	
	public WifiItem delete(int id) {
		return null;
	}

}
