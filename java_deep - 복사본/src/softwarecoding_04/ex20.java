package softwarecoding_04;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int kopo37_i=1;kopo37_i<13;kopo37_i++) { // 1��~12�� ���� �ݺ���
			System.out.printf("%d��=>", kopo37_i);
			
			LOOP:for(int j=1; j<32; j++) {  // 
				System.out.printf("%d,",j);
				
				switch(kopo37_i) { 							//���� 4,6,9,7,11���� ��� ���ڰ� 30���϶� break
				case 4:case 6:case 9:case 7:case 11:
					if(j==30) break LOOP;
					break;
				case 2:									//2�� ��:�� 28���� ��� loop break
					if(j==28) break LOOP;
					break;
					
				}
				
	}
			System.out.printf("\n");
		}
}
	}
	

	
