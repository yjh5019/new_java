package softwarecoding_04;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int kopo37_i=1;kopo37_i<13;kopo37_i++) { // 1월~12월 까지 반복문
			System.out.printf("%d월=>", kopo37_i);
			
			LOOP:for(int j=1; j<32; j++) {  // 
				System.out.printf("%d,",j);
				
				switch(kopo37_i) { 							//월이 4,6,9,7,11월일 경우 일자가 30일일때 break
				case 4:case 6:case 9:case 7:case 11:
					if(j==30) break LOOP;
					break;
				case 2:									//2월 일:때 28일을 찍고 loop break
					if(j==28) break LOOP;
					break;
					
				}
				
	}
			System.out.printf("\n");
		}
}
	}
	

	
