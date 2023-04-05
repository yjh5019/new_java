package softwarecoding_04;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kopo37_fSin; // 실수형 변수 선언
		for(int kopo37_i=0; kopo37_i<360; kopo37_i++) { // i는 각도로써 360도 까지 표현
			kopo37_fSin = Math.sin(kopo37_i*3.141592/180); // 실수형 변수에 sin함수==> 1도를 라디안으로 표현   [도]=파이/180 으로 표현
			System.out.printf("%d sin==>%f\n",kopo37_i,kopo37_fSin); // 각 도에 대한 sin 함수값 출력
		}
		// sin 360도 까지 그리기
		for(int kopo37_i=0; kopo37_i<360; kopo37_i++) {
			kopo37_fSin = Math.sin(kopo37_i*3.141592/180); // 실수형 변수에 sin함수==> 1도를 라디안으로 표현   [도]=파이/180 으로 표현
			int iSpace = (int)((1.0-kopo37_fSin)*50); // iSpace = 사인 값에 따라 띠어쓰기를 통해 sin함수를 그릴 수 있다
			for(int j=0; j<iSpace; j++) System.out.printf(" "); // iSpace 값이 크면 띄어쓰기가 적어지고, 값이 작으면 띄어쓰기 숫자가 많아짐
			System.out.printf("*[%f][%d]\n",kopo37_fSin, iSpace); // sin 값과 정수형 iSpace값 출력
		}
	}

}
