package java0406;
import java.util.*;
public class solv05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap hm = new HashMap();
		HashMap<Integer, Integer> hmee = new HashMap<>();
		int[] nums = {2, 2, 3, -1, -1, -1, 3, 1, 1};
		int sum = 0; 
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			sum+= nums[i];
			for(int j=0; j<nums.length; j++) {
				if(nums[j+1] == nums[j]) {
					count++;
					break;
				}
				
			}
			hmee.put(nums[i],count);
			System.out.println(hmee);
		}

	}

}
