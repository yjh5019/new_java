package softwarecoding_04;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "920519-1188038";
		
		switch(jumin.charAt(7)) {
		
		case '1':
			System.out.printf("20세기 전 태어난 남자 사람\n");
		case '2':
			System.out.printf("20세기 전 태어난 여자 사람\n");
		case '3':
			System.out.printf("20세기 후 태어난 남자 사람\n");
		case '4':
			System.out.printf("20세기 후 태어난 여자 사람\n");
		default :
			System.out.printf("사람 \n");
			break;
		}
	}

}
