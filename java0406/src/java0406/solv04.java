package java0406;
import java.util.*;
public class solv04 {
	
	public int solution(int[] nums, int m){
		int answer = 0;
		
	
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		solv04 T = new solv04();
		System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));	
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));	
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));	
		System.out.println(T.solution(new int[]{-1, 0, 1}, 0));	
		System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));	
	}
	

}
/*
class Solution {
	public int solution(String s){
		HashMap<Character, Integer> sH = new HashMap<>();
		for(char x : s.toCharArray()){
			sH.put(x, sH.getOrDefault(x, 0) + 1); 
		}
		for(int i = 0; i < s.length(); i++){
			if(sH.get(s.charAt(i)) == 1) return i+1;
		}
		return -1;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}

*/