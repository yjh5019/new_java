package test2;
import java.util.*;
public class problem2 {
	class Solution {
		public int[] solution(int[][] board, int k){
			int[] answer = new int[2]; 
			
			//          12시 3시 6시 9시 에 대한 방향 값 설정
			 int n = board.length;
		      int[] dx = {0, 1, 0, -1};
		      int[] dy = {-1, 0, 1, 0};
		      int x = 0, y = 0, d = 1, cnt = 0; // d=1은 현재 방향(3시 방향)
		      
		      while (cnt < k) {
		         cnt++; // 카운트 = 1초
		         int nx = x + dx[d];  // 현재 좌표에서 방향을 더해 새로운 값에 적용
		         int ny = y + dy[d];
		         if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) {
		            d = (d + 1) % 4; // 장애물 발생시 방향 전환
		            continue; // 방향 전화후 카운트 하나 더해서 반복문 진행
		         }
		         x = nx;  // 장애물 없을때 각 좌표에 대해 x 변수에 넣어
		         y = ny;
		      }
		      answer[0] = x;
		      answer[1] = y;

			
			
			
			
			
			
			return answer;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		int[][] arr1 = {
			{0, 0, 0, 0, 0}, 
			{0, 1, 1, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = {
			{0, 0, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 1}, 
			{1, 1, 0, 0, 1, 0}, 
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = {
			{0, 0, 1, 0, 0}, 
			{0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr3, 25)));

	}
}





// 방의 크기 계산

// 로봇의 방향 설정

// 사용할 변수(로봇위치, 시간, 방향) 변수 초기화

// 반복문 - 방향 설정 -> 한칸 이동 or 방향 변경 + 시간

// 

















