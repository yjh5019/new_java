package soft_05;

public class ex06 {

    public static void main(String[] args) {
        int kopo37_iWeekday = 5; // 1�� ���� ����
        int[] kopo37_iEnd = {31,29,31,30,31,30,31,31,30,31,30,31};
        //���� �ݺ����� ���� ���α׷� �ۼ�
        for(int kopo_37_iMon=0; kopo_37_iMon<12; kopo_37_iMon++) { // 1��~12������ ���
            System.out.printf("\n\n        %2d��\n",kopo_37_iMon+1); // �� ���
            System.out.printf("============================\n");
            System.out.printf("   ��  ��  ȭ   ��   ��  ��  ��\n"); // ���� ���
            
            for(int kopo37_j=1; kopo37_j<=kopo37_iWeekday; kopo37_j++) { //1���� �ݿ��� ���� 1���� ���۵����� ��ĭ�� iWeekday=5�� ��ĭ���� �ۼ�
                System.out.printf("%4s", " "); // ����
            }
            
            for(int kopo37_i=1; kopo37_i<=kopo37_iEnd[kopo_37_iMon]; kopo37_i++) { // �����ۼ� �� ������ ����� �������ϼ��� �ݺ����� ���� ���
                System.out.printf("%4d",kopo37_i); // �� ���ڸ� ���
                kopo37_iWeekday++; // 1�� ����
                //���� ���ǹ� �ۼ�
                if (kopo37_iWeekday % 7 == 0) { // iWeekday�� 7�̶�� 
                    System.out.println(); // ���� �ٹٲ�
                    kopo37_iWeekday = 0; // ���� �� iWeekday 0���� �ʱ�ȭ
                }
            }
        }
    }
}