package day04;
import java.util.*;
public class jaegui {
	
	static int [] pm, ch, arr;
	static int n, m;
	public void DFS(int L) {
		
		
		if(L==m) {
			
			for (int x : pm) System.out.println(x+ " ");
			System.out.println();
		}else {
			for(int i = 1; i <=n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
		
		
	}
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			jaegui T = new jaegui();
			
			Scanner kb = new Scanner(System.in);
			n = kb.nextInt();
			m = kb.nextInt();
			
			arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = kb.nextInt();
			}
			ch = new int[n];
			pm = new int[m];
			T.DFS(0);
			
			
		}
		
	}
	

//	
//	public static int Fibonacci(int n) {
//		
//		if(n == 0) return 0;
//		
//		if(n == 1 || n == 2) return 1;
//		
//		else return Fibonacci(n-1) + Fibonacci(n-2);
//	}


