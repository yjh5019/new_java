package softwarecoding_04;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k37_sum = 0;
		for(int k37_i=0; k37_i<10; k37_i++) {
			k37_sum += k37_i;
			
		}
		System.out.printf("sum %d\n",k37_sum);
		
		for(int k37_i=1; k37_i<10; k37_i++) {
			
			System.out.printf("*************************\n");
			System.out.printf("	구구단 %d 단 \n",k37_i);
			System.out.printf("*************************\n");
			for(int k37_j=1; k37_j<10; k37_j++) {
				System.out.printf("%d * %d = %d \n",k37_i, k37_j, k37_i*k37_j);
			}	
		}
		
	}

}
