package java0407;

import java.util.Arrays;
import java.util.Stack;

public class solv02 {
	
	public int solution(int[] keypad, String password){
		int answer = 0;
		int[] dx = {-1,-1, 0, 1,1,1,0,-1};
		int[] dy = {0,1,1,1,0,-1,-1,-1};
		int [][] pad = new int [3][3];
		int [][] dist = new int [10][10];
		
		for(int a=0; i<3; i++) {
			
			
		}
		
		
		Arrays.fill(a, 2);
		for(int i=0;i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i==j) {
					a[i][j] = 0;
				}
			}
			
		}
		
		
		
//		keypad = [1,2,3,4,5,6,7,8,9];
		
		
		
		
		
		//꺼내올때는 char
		//저장할때는 string 형태로 
		Stack<String> stack = new Stack<>();
		String a = "";
		for(int i=0;i<s.split("").length; i++) {
			
			stack.push(s.split("")[i]);
		}
		System.out.println(stack);
		for(int i=0; i<stack.size();i++) {
			if(stack.get(i) == ")") {
				
			}
			
		}
		
		//꺼내올때는 char
		//저장할때는 string 형태로 
		Stack<String> s = new Stack<>();
		String a = "";
		for(int i=0;i<s.split("").length; i++) {
			
			stack.push(s.split("")[i]);
		}
		System.out.println(stack);
		for(int i=0; i<stack.size();i++) {
			if(stack.get(i) == ")") {
				
			}
			
		}
		
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		solv02 T = new solv02();
		System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));	
		System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));

	}

}
