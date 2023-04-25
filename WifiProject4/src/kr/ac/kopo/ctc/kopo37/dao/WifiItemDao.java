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
		
		
		File kopo37_f = new File("C:\\Users\\pc\\PublicWifi.txt"); // �ش� txt ������ ������ f �� ����
		BufferedReader kopo37_br =  new BufferedReader(new FileReader(kopo37_f)); // ���۸��� ��ä ����
		String kopo37_readtxt = kopo37_br.readLine(); // ���� ���� ���ڿ� ���� ����
		List<WifiItem> data = new ArrayList<WifiItem>();
		
//		if((kopo37_readtxt = kopo37_br.readLine() )== null) { // ���� ���� �о� �ʵ��
//			
//			System.out.printf("�� ���� �Դϴ�\n");  //  ���� �� ������ ��� ���
//			kopo37_br.close();
//			return null;
//		}
	
		while((kopo37_readtxt = kopo37_br.readLine()) != null) {
			
			WifiItem wifiItem = new WifiItem();
			String[] kopo37_field_name = kopo37_readtxt.split("\t");
			
			wifiItem.setId(kopo37_field_name[0]); // ��ȣ ����Ʈ�� ����
			wifiItem.setInstallationLocationName(kopo37_field_name[1]); // ��ġ��Ҹ� ����Ʈ ����
			wifiItem.setInstallatonLocationDetails(kopo37_field_name[2]); // ��ġ��� �� ����Ʈ�� ����
			wifiItem.setInstallationCityName(kopo37_field_name[3]); // ��ġ�õ��� ����
			wifiItem.setInstallationDistrictName(kopo37_field_name[4]); // ��ġ�ñ����� ����Ʈ�� ����
			wifiItem.setInstallationFacilityType(kopo37_field_name[5]); // ��ġ�ü����� ����Ʈ�� ����
			
			wifiItem.setInstallatonProviderName(kopo37_field_name[6]); //���� ������� ����Ʈ ����
			wifiItem.setWifiSsid(kopo37_field_name[7]); //  ��������ssid ����Ʈ ����
			wifiItem.setDateOfinstallation(kopo37_field_name[8]); // ��ġ���� ����Ʈ ����
			wifiItem.setRoadNameAddress(kopo37_field_name[9]); // ���������θ��ּ� ����Ʈ ����
			wifiItem.setLotNumberAddress(kopo37_field_name[10]); // �����������ּ� ����Ʈ ����
			wifiItem.setManagementAgencyName(kopo37_field_name[11]); // ��������� ����Ʈ ����
			wifiItem.setManagementAgencyPhoneNumber(kopo37_field_name[12]); // ���������ȭ��ȣ
			wifiItem.setLatitude(kopo37_field_name[13]); // ����
			wifiItem.setLongitude(kopo37_field_name[14]); //  �浵
			wifiItem.setCreated(kopo37_field_name[15]); // �����ͱ�������
			
			data.add(wifiItem); // �����Ϳ� �߰�
			
			
		}
		kopo37_br.close(); // �б� �׸�
		
		return data; // ��ȯ�� data
	}
	//////////////////////////////////////////
	public WifiItem update(int id, WifiItem wifiItem) {
		return null;
	}
	
	public WifiItem delete(int id) {
		return null;
	}

}
