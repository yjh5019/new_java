package softwarecoding_04;

public class ex18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<13;i++) { // 1��~12�� ���� �ݺ���
			System.out.printf("%d��=>", i);
			for(int j=1; j<32; j++) { // �� ���� �ϼ��� ����ϴ� �ݺ��� �ۼ�
				System.out.printf("%d", j);
				if((i==1 && j==31)||(i==2 && j==28)||(i==3 && j==31)||(i==4 && j==30)||
						(i==5 && j==31)||(i==6 && j==30)||(i==7 && j==31)||(i==8 && j==31)||
						(i==9 && j==30)||(i==10 && j==31)||(i==11 && j==30)||(i==12 && j==31))
					System.out.printf("\n");
					break;
				
				
					//�� �������� �ϼ����� ��� �� ���ǹ� ����� ���� break
//				if(i==1 && j==31) 
//					break;
//				if(i==2 && j==28)
//					break;
//				if(i==3 && j==31)
//					break;
//				if(i==4 && j==30)
//					break;
//				if(i==5 && j==31)
//					break;
//				if(i==6 && j==30)
//					break;
//				if(i==7 && j==31)
//					break;
//				if(i==8 && j==31)
//					break;
//				if(i==9 && j==30)
//					break;
//				if(i==10 && j==31)
//					break;
//				if(i==11 && j==30)
//					break;
//				if(i==12 && j==31)
//					break;
			} System.out.printf(",");
			
		}

	}
}
