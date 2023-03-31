package test2;
import java.util.*;
public class problem1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
		System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
		System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
		System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
		
		
		

	}
	class Solution {
		public char[] solution(int n, int[][] ladder){ // get 2 parameter
			char[] answer = new char[n];
			for(int i=0; i<n; i++) {
				answer[i] = (char)(i+65);
			}
			
			f
			
			
			
			
			//todo
			
			
			
			
			return answer;
		}

}
}
