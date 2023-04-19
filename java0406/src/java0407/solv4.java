package java0407;
import java.util.*;
public class solv4 {
	
	public int[] solution(int[] nums){
		int[] answer = new int[nums.length / 2];
		Arrays.sort(nums);
		ArrayList<Integer> temp_arr = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
		    if (i == 0) {
		        temp_arr.add(nums[i]);
		        
		    } else {
		        if (nums[i] != temp_arr.get(temp_arr.size() - 1)) {
		            temp_arr.add(nums[i]);
		        }
		    }
		    
//
		}
		System.out.println(temp_arr);
		for(int i=0; i<temp_arr.size(); i++) {
			
			if(temp_arr[i+j] == temp_arr[i]*2) {
				
			}
			
		}
		
//		
//		
//		int min = nums[0];
//		
//		for(int i=0; i<nums.length;i++) {
//			if(min>nums[i]) {
//				min = nums[i];
//			}
//		}
		//배열중 최솟값 출력
//		System.out.println(min);
		
		// 배열 정렬
//		int [] arry = {};
//		for(int x : nums) {
//			System.out.println(x);
//		}
//		
//		for(int i=0; i<nums.length-1; i++) {
//			if(nums[i+1] == nums[i]*2) {
//				for(int j=0; j; j++) {
//					//배열에 추가
//					arry[i] += nums[i];
//					
//				}// 만약 2배가 없다면 pass
//			}
//			
//		}
//		
		
		
		
		
	
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solv4 T = new solv4();
		System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
		System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));

	}

}
