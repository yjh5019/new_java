package java_deep;

public class java_deep_test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 1234; // 상품 가격
		double tax_rate = 0.1; // 세율이니까 실수로 설정
		int netprice = MyTest.netprice(price,tax_rate); // MyTest의 netprice메소드의 인자값
		int tax = price-netprice; // 세금
		
		System.out.printf("******************************\n");
		System.out.printf("*소비자가, 세전가격, 세금 계산*\n");
		System.out.printf("소비자가격: %d 세전가격: %d 세금: %d\n", price,netprice,tax); // 출력화면
		System.out.printf("******************************\n");
	}
public class MyTest{ // 세전가격 계산식
	
	public static int netprice(int price, double rate) {
		return (int)(price/(1+rate));
	}

}

	
}
