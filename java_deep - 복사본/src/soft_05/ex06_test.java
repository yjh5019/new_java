package soft_05;
public class ex06_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޷� �μ�
	      int k10_iWeekday = 5; // ���Ͽ����� ���� �޶����� ���� iWeekday 5�� �ʱ�ȭ
	      // �� �޸��� ������ ���� ���� �迭 iEnd �ʱ�ȭ
	      int[] k10_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	      for (int k10_iMon = 0; k10_iMon < 12; k10_iMon++) { // iMon�� 0���� 11���� 1�� �����ϸ� �۵��ϴ� �ݺ��� ����
	         System.out.printf("\n\n        %2d��\n", k10_iMon + 1); // �� ���
	         System.out.printf("=====================\n"); // ================= ���
	         System.out.printf(" �� �� ȭ �� �� �� ��\n"); // ���� ���
	         for (int k10_j = 1; k10_j <= k10_iWeekday; k10_j++) { // Weekday�� ī��Ʈ�� ���� ������ ����ϴ� for��
	            System.out.printf("%3s", " "); // ���� ���
	         }
	         
	         // iMon�� x�϶�, iEnd�� iEnd[x]��°�� �ִ� ���� y�� �ִٰ� ġ��
	         // i�� 1���� y���� 1�� �����ϸ� �۵��ϴ� �ݺ��� ���� 
	         for (int k10_i = 1; k10_i <= k10_iEnd[k10_iMon]; k10_i++) {
	            System.out.printf("%3d", k10_i); // ���� ���
	            k10_iWeekday++; // iWeekday 1�� ����
	            if (k10_iWeekday % 7 == 0) { // iWeekday�� 7�̶�� 
	               System.out.println(); // ����
	               k10_iWeekday = 0; // ���� �� iWeekday 0���� �ʱ�ȭ
	            }
	         }
	      }
	}

}
