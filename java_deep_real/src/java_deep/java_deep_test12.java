package java_deep;

public class java_deep_test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 271; //세전 물건값
		int rate = 3; // 세금 3퍼센트
		
		
		int tax = Taxcalc.taxcal(val,rate);
		
		System.out.printf("******************************\n");
		System.out.printf("*       단순 세금 계산           *\n");
		System.out.printf("실제 세금계산 : %f\n", val*rate/100.0);
		System.out.printf("세전가격: %d 세금: %d 세포함가격: %d\n", val,tax,val+tax);
		System.out.printf("******************************\n");
		
		
		
	}
	
	public class Taxcalc{
		
		public static int taxcal(int val,int rate) {
			int ret; // 정수형으로 선언해야 반올림이 가능함
			
			if( ((double)val*(double)rate/100.0)==val*rate/100) // 조건문으로 세전 물건값 * 세금 == 세전 물건값*세금 이 정확히 동일하다면
				ret=val*rate/100;								// 그대로 세금 방정식을 사용해 출력
				
			else 
				ret=val*rate/100+1;								//아니라면 소수점이 나오기 때문에 +1을 해주고 소수점은 버리게 int = ret으로 선언
			
			return ret; // 출력값을 소비자 가격인 ret로 return
			
			
		}
	}

}
