package test2;
import java.util.*;
public class problem5 {
	
	public int[] solution(String s){
		int[] answer = new int[5];
		HashMap<Character, Integer> sH = new HashMap<>();
		
		
		for(char x : s.toCharArray()) { // �迭�� �����Ѥ���./
			sH.put(x, sH.getOrDefault(x, 0)+1);
		}
		
		int max = Integer.MIN_VALUE; // -2424848928....2��32����
		String tmp = "abcde";
		
		for(char key : tmp.toCharArray()) {    // max �� ���ϴ� ����
			if(sH.getOrDefault(key, 0)>max) {
				max = sH.getOrDefault(key, 0);
			}
			
		}
		
			
			
			
			return answer;
		}
		
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		problem5 T = new problem5();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));

	}

}
