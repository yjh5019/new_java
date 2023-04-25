import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.io.*;

public class Lec03_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WifiItemService wifiItemService =  new WifiItemService();
		WifiItemDao wifiItemDao = new WifiItemDao();
		
		List<WifiItem> wifiItems = wifiItemDao.selectAll();
		
		WifiItem me  = new WifiItem();
		
		List<Double> distanceList = new ArrayList<Double>();
		
		for(WifiItem target : wifiItems) {
			
			double d = wifiItemService.getDistance(me,target);
			distanceList.add(d);
		}

	}

}
