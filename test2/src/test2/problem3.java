package test2;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Solution T = new Solution();
			int[][] arr1 = {
				{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 1, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 2, 0, 0}, 
				{1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 3, 0, 0, 0, 1}, 
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
				{0, 1, 0, 1, 0, 0, 0, 0, 0, 0}}; 
			System.out.println(T.solution(arr1));
			int[][] arr2 = {
				{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
				{0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
				{1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
				{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}}; 
			System.out.println(T.solution(arr2));
		

	}
	public class Solution{
		public int solution(int[][] board){
			int answer = 0;
			
			int n = board.length;
			int [] dx = {0,1,0,-1};
			int [] dy = {-1,0,1,0};
//			int [nx][ny] board == 2; // 나의 위치 찾기
//			int [nx][ny] board == 3;
//			
			int i_x = 0, i_y = 0; // 나의 위치
			int dog_x = 0, dog_y = 0; // 강아지 위치
			int d1 = 0, d2 = 0 ,count = 0; // 나, 강아지 방향
			for(int i=0; i<10;i++) {
				for(int j=0; j<10; j++) {
					if(board[i][j] ==2) {
						i_x = i;
						i_y = j; // 나의 위치를 여기다가 넣는겆매
					}
					if(board[i][j] ==3) {
						dog_x = i;
						dog_y = j; // 나의 위치를 여기다가 넣는겆매
					}
					
				}
				
			}
			while(count<10000) {
			count++;
			int nx1 = i_x + dx[d1];  // 내 위치 + 방향이동     x
			int ny1 = i_x + dy[d1];  //                        y
			int nx2 = dog_x + dx[d2]; // 강쥐 위치 + 방향이동  x
			int ny2 = dog_y + dy[d2]; //                       y
			boolean flag1 = true, flag2 = true;
			if(nx1<0 || nx1 >= n || ny1<0 || ny1 >= n || board[nx1][ny1] ==1 ) {
				d1 = (d1+1)%4;
				flag1 = false;
				
			}
			if(nx2<0 || nx2 >= n || ny2<0 || ny2 >= n || board[nx2][ny2] ==1 ) {
				d2 = (d2+1)%4;
				flag2 = false;
				
			}
			if(flag1 == true) {
				
				i_x = nx1;
				i_y = ny1; 
			}
			if(flag2 == true) {
				
				dog_x = nx2;
				dog_y = ny2; 
			}
			
			

			
		}
		

			return answer;		
	}
}
}
