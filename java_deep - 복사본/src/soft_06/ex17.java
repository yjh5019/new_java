package soft_06;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TvRemoconX tv1 = new TvRemoconX();
		
		for(int i=0;i<10; i++) {
			tv1.channelUp();
			System.err.printf("MSG tv1[%s}]\n",tv1.help);
		}
		
		
		tv1.check_bet();
		System.out.printf("MSG tv1[%s]\n",tv1.help);
		

	}

}
