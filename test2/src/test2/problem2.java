package test2;
import java.util.*;
public class problem2 {
	class Solution {
		public int[] solution(int[][] board, int k){
			int[] answer = new int[2]; 
			
			//          12�� 3�� 6�� 9�� �� ���� ���� �� ����
			 int n = board.length;
		      int[] dx = {0, 1, 0, -1};
		      int[] dy = {-1, 0, 1, 0};
		      int x = 0, y = 0, d = 1, cnt = 0; // d=1�� ���� ����(3�� ����)
		      
		      while (cnt < k) {
		         cnt++; // ī��Ʈ = 1��
		         int nx = x + dx[d];  // ���� ��ǥ���� ������ ���� ���ο� ���� ����
		         int ny = y + dy[d];
		         if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) {
		            d = (d + 1) % 4; // ��ֹ� �߻��� ���� ��ȯ
		            continue; // ���� ��ȭ�� ī��Ʈ �ϳ� ���ؼ� �ݺ��� ����
		         }
		         x = nx;  // ��ֹ� ������ �� ��ǥ�� ���� x ������ �־�
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





// ���� ũ�� ���

// �κ��� ���� ����

// ����� ����(�κ���ġ, �ð�, ����) ���� �ʱ�ȭ

// �ݺ��� - ���� ���� -> ��ĭ �̵� or ���� ���� + �ð�

// 

















