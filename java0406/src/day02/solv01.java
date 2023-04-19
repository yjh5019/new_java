package day02;
import java.util.*;

public class solv01 {
	
	
	
public int[] solution(int c, int r, int k){
		int [] answer = new int[2];
		//
		int [][] board = new int[c][r];
		// board 배열의요소 0으로 초기화
		for(int[] row : board) {
			Arrays.fill(row, 0);
		}
		board[0][0] = 1;
		
		// 방향 배열
		int[] dx = {-1,0,1,0};		
		int[] dy = {0,1,0,-1};
		
		
		int d=1,x=0,y=0,count=1;
		while(count < k) {
			int nx = x + dx[d]; // 이동한 내 현재 위치
			int ny = y + dy[d];
			
			if(nx < 0 || nx >= c || ny < 0 || ny >=r || board[nx][ny] == 0){
				d = (d + 1) % 4;
				continue;
			}
			count++;
			board[nx][ny] = 1;
			
			x = nx;
			y = ny;
			
		}
		
		
		
		answer[0] = x+1;
		answer[1] = y+1;
	
		
		
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
