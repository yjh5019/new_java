package softwarecoidng_02;
import java.util.*;
public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine(); // 입력한 값을 input에 저장
		int kopo37_num = Integer.parseInt(input); // 입력받은 문자형 input값을 숫자로 변환
													// parseInt()의 기능은 String타입의 숫자를 int타입으로 변환줌
		
		System.out.println("입력내용: "+input);
		System.out.printf("num=%d\n", kopo37_num); // integer로 num을 받았기 때문에 %d로 값을 출력
	}

}
