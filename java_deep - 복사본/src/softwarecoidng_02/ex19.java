package softwarecoidng_02;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo37_x = 10;
		int kopo37_y = 20;
		int kopo37_tmp = 0;
		
		System.out.println("x: "+kopo37_x+" y:"+kopo37_y); // x,y값 출력
		
		kopo37_tmp = kopo37_x; // x값을 tmp 값에 저장 ==> tmp:10 x:10 y:20
		kopo37_x = kopo37_y; // y 값을 x값에 저장 ==> tmp:10 x:20 y:20 
		kopo37_y = kopo37_tmp; // tmp 값을 y값에 저장 ==> tmp:10 x:10 y:10
		
		System.out.println("x: "+kopo37_x+" y:"+kopo37_y); //
	}

}
