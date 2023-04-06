package java0406;
import java.util.*;

public class solv01 {

	public int[] solution(int c, int r, int k){
		
		int[] answer = new int[2];
		
		int[][]seat = new int[c][r];
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int x=0, y=0, count=1, d=1;
		while(true) {
			int nx = x + dx[d];
			int ny = y + dy[d]; //  방향에 따른 인덱스 위치값 
			
			if(nx<0 || nx >= c || ny<0 || ny >=r || seat[nx][ny]>0) {
				d = (d +1)%4; // 방향을 바꿈
				continue;
				
			}
			seat[x][y] = count;
			
			count++;
		}
		
		
		
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				solv01 T = new solv01();
				System.out.println(Arrays.toString(T.solution(6, 5, 12)));	
				System.out.println(Arrays.toString(T.solution(6, 5, 20)));
				System.out.println(Arrays.toString(T.solution(6, 5, 30)));
				System.out.println(Arrays.toString(T.solution(6, 5, 31)));
			}
		}

	


