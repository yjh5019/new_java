package test2;
import java.util.HashMap;
public class problem4 {
	
	public int solution(String s){
		int answer = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
		
		for(char x : s.toCharArray()) { // �迭�� �����Ѥ���./
			sH.put(x, sH.getOrDefault(x, 0)+1);
			System.out.println(sH);
		}
		for(int i = 0; i<s.length(); i++) {
			if(sH.get(s.charAt(i))==1) return i+1;
		}
		return -1;
		
		
		
		
		
//		for(int i=0; i<s.length(); i++) {
//			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
//			System.out.println(map);
//		}
//		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		problem4 T = new problem4();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));

	}

}
