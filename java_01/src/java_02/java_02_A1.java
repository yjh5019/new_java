package java_02;

public class java_02_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
		    for (int j = 1; j <= 9; j++) {
		        if (j == 1) {
		            System.out.println(i + "단");
		        }
		        System.out.println(i + " X " + j + " = " + (i*j));
		    }
		}
	}

}
