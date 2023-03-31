package java_02;

public class java_02_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		while (i <= 9) {
		    int j = 1;
		    System.out.println(i + "단");
		    while (j <= 9) {
		        switch (j) {
		            case 1:
		                System.out.println(i + " X " + j + " = " + (i*j));
		                break;
		            default:
		                System.out.print(i + " X " + j + " = " + (i*j) + "\t");
		                break;
		        }
		        j++;
		    }
		    System.out.println();
		    i++;
		}

	}

}
