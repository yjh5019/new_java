package softwarecoding_04;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int kopo37_i=1;kopo37_i<13;kopo37_i++) { // 1��~12�� ���� �ݺ���
			System.out.printf("%d��=>", kopo37_i);
			for(int j=1; j<32; j++) { // �� ���� �ϼ��� ����ϴ� �ݺ��� �ۼ�
				System.out.printf("%d,", j);
				//�� �������� �ϼ����� ��� �� ���ǹ� ����� ���� break
				if(kopo37_i==1 && j==31) 
					break;
				if(kopo37_i==2 && j==28)
					break;
				if(kopo37_i==3 && j==31)
					break;
				if(kopo37_i==4 && j==30)
					break;
				if(kopo37_i==5 && j==31)
					break;
				if(kopo37_i==6 && j==30)
					break;
				if(kopo37_i==7 && j==31)
					break;
				if(kopo37_i==8 && j==31)
					break;
				if(kopo37_i==9 && j==30)
					break;
				if(kopo37_i==10 && j==31)
					break;
				if(kopo37_i==11 && j==30)
					break;
				if(kopo37_i==12 && j==31)
					break;
			}
			System.out.printf("\n"); // �� ���� ���ڸ� ��� ������� ��� break �� �ٹٲ� ����
		}
	}

}
