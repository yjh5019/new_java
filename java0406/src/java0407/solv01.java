package java0407;
import java.util.*;
public class solv01 {
	
	public String solution(String s){
		String answer = "";
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
		
		
		
//		String[] a = s.split("");
//		for(String x : a) {
//			
////			System.out.println(x);
//			String b = stack.push(x);
//			String c = "";
//			System.out.println(stack.push(x));
//			if(b == ")") {
//				
//				
//			}
//		}
		
		
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solv01 T = new solv01();
		System.out.println(T.solution("3(a2(b))ef"));
//		System.out.println(T.solution("2(ab)k3(bc)"));
//		System.out.println(T.solution("2(ab3((cd)))"));
//		System.out.println(T.solution("2(2(ab)3(2(ac)))"));
//		System.out.println(T.solution("3(ab2(sg))"));

	}

}
