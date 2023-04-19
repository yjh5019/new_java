package java0406;
import java.util.*;
public class solv06 {
	
	public String[] solution(String[] reports, String times){
		String[] answer = {};
		
		HashMap<String, Integer> who = new HashMap<>();
		/////이름 : 시간
		for(String x : reports) {
			
			String a = x.split(" ")[0];
			String b = x.split(" ")[1];
			String c = b.split(":")[0];
			String d = b.split(":")[1];
			
			System.out.println(a);
			System.out.println(b);
			int c_num =  Integer.parseInt(c);
			int d_num =  Integer.parseInt(d);
			System.out.println(c_num*60+d_num);
//			System.out.println(d);
		}
		// 문서 도난 시간
		System.out.println("////////////////\n");
		String time1 = times.split(" ")[0];
		String time1_1 = time1.split(":")[0];
		String time1_2 = time1.split(":")[1];
		int time1_1_num = Integer.parseInt(time1_1);
		int time1_2_num = Integer.parseInt(time1_2);
//		System.out.println(time1_2_num);
//		System.out.println(time1_1_num);
		
		int str_time = time1_1_num*60+time1_2_num;
		System.out.println(str_time);
		System.out.println("////////////////\n");
		String time2 = times.split(" ")[1];
		String time2_1 = time2.split(":")[0];
		String time2_2 = time2.split(":")[1];
		int time2_1_num = Integer.parseInt(time2_1);
		int time2_2_num = Integer.parseInt(time2_2);
//		System.out.println(time2_1_num);
//		System.out.println(time2_2_num);
		int end_time = time2_1_num*60+time2_2_num;
		System.out.println(end_time);
		
//		Stirng[] time2 = times.split(" ")[1];
			
			
		
		
		
		
		return answer;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solv06 T = new solv06();
		System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
		System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));

	}

}
