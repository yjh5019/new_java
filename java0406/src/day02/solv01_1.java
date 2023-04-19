package day02;
import java.util.*;
import java.util.Arrays;

public class solv01_1 {
	
public int[] solution(int c, int r, int k){
		int [] answer = new int[2];
		
		int [][] board = new int [c][r];
		
		for(int [] row : board) {
			Arrays.fill(row, 0);
		}
		
		int[] dx = {-1,0,1,0};		
		int[] dy = {0,1,0,-1};
		
		int x=0, y=0, d=1, count=1;
		board[0][0] = 1;
		while(count < k) {
			// 방향에 따른 위치값
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx<0 || nx>=c || ny<0 || ny>=r || board[nx][ny] == 1) {
				d = (d+1)%4;
				continue;
			}
			board[nx][ny] = 1;
			count ++;
			x = nx;
			y = ny;
			
			
		}
		answer[0] = x+1;
		answer[1] = y+1;
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solv01_1 T = new solv01_1();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));	
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));

	}

}
