package java0407;
import java.util.*;
public class solv05 {
	
	public int solution(int[] nums){
		int answer = 0;
		
		Arrays.sort(nums);
		System.out.println(nums);
		int left = 0;
		int right = nums.length-1;

		
		return answer;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		solv05 T = new solv05();
		System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
		System.out.println(T.solution(new int[]{2, 3, 4, 5}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));

	}

}
