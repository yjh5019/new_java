package java0406;
import java.util.*;
public class solv2 {
	public int solution(int[] nums){
		int answer = 0;
		
		int n = nums.length;
		
		ArrayList<Integer> peaks = new ArrayList<>();
		
		for(int i=1; i<n-1; i++) {
			peaks.add(i);
		}
		
		for(int x : peaks) {
			
			int left = x;
			int right = x;
			int cnt = 1;
			
			while(left-1 >= 0 && nums[left-1] < nums[left]) {
				left--;
				cnt++;
			}
			while(right)
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////
//		int cnt = 0;
//		
//		for(int i=0; i<nums.length;i++) {
//			
//				if(nums[i+1] > nums[i]) {
//					cnt++;
////					continue;
//					
//				}else {
//					if(nums[i+1] < nums[i]) {
//						cnt++;
//						if(nums[i+2] > nums[i+1]) {
//							break;
//							
//						}
//							
//						
//					}
//				}
//			
//			
//		}
				
////////////////////////////////////////////////////////////////////////////////////////////
		return answer;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solv2 T = new solv2();
		System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
		
		

	}

}
