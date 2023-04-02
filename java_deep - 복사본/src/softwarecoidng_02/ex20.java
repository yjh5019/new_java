package softwarecoidng_02;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kopo37_name = "Ja" + "Va"; // JaVa 출력
		String kopo37_str = kopo37_name + " 8.0";// 8.0을 "8.0"으로 해줘야함(문자이기 때문에)
		
		System.out.println(kopo37_name);
		System.out.println(kopo37_str);
		System.out.println(7+" "); // 띄어쓰기
		System.out.println(" "+ 7); // 앞에서 띄어쓰기
		System.out.println(7+"");
		System.out.println(""+7);
		System.out.println(""+""); // 공백
		System.out.println(7+7+""); //앞에 문자가 없으므로 숫자7+숫자7 = 14
		System.out.println(""+7+7);// 앞에 문자가 있으므로 문자로 인식되어 77이 출력
	}

}
