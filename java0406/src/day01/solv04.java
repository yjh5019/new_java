package day01;
import java.util.*;

public class solv04 {
	
	public int solution(String s){
		HashMap<Character, Integer> sH = new HashMap<>();
		for(char x : s.toCharArray()){
			sH.put(x, sH.getOrDefault(x, 0) + 1); 
		}
		System.out.println(sH);
		for(int i = 0; i < s.length(); i++){
			if(sH.get(s.charAt(i)) == 1) return i+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solv04 T = new solv04();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));

	}

}
