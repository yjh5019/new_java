package java_02;

public class java_02_A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 9 ; j >= i*2+1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

	}

}
