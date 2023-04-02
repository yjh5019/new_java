package softwarecoding_04;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int kopo37_i=1;kopo37_i<13;kopo37_i++) { // 1월~12월 까지 반복문
			System.out.printf("%d월=>", kopo37_i);
			for(int kopo37_j=1; kopo37_j<32; kopo37_j++) { 
				System.out.printf("%d,",kopo37_j);
				
				if(kopo37_i==4||kopo37_i==6||kopo37_i==9||kopo37_i==7||kopo37_i==11) {
					if(kopo37_j==30)
						break;
				}
				if(kopo37_i==2) {
					if(kopo37_j==28)
						break;
				}
			} System.out.printf("\n");
	}
		
}
}
