package java_deep;

public class java_deep_test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] item = {"맛동산","웨하스","롯데센드","오땅","사브레"}; // 구매한 목록을 배열로 저장
		int[] price = {1000,2000,3000,2500,1450}; // 각 배열의 가격
		int[] amount = {10,2,1,3,5}; // 수량
		double tax_rate = 0.1; // 세율
		int total_sum = 0; // 합계 변수 초기화
		
		System.out.printf("************************************************************\n");
		System.out.printf("너가 지른 과자들          \n");
		System.out.printf("항목		    단가		수량		      합계		\n");
		// 반복문을 통해  각 구매 목록에 대한 단가, 수량 및 합계를 출력
		for(int i=0; i<item.length; i++) {
			int sum=price[i]*amount[i]; // 각 구매 목록의 단가와 수량을 곱한 합계
			total_sum=total_sum+sum; // 총 지불 금액 누적
			System.out.printf("%.5s		%7d		%2d		%9d\n",item[i],price[i],amount[i],sum); // 
		}
		
		System.out.printf("************************************************************\n");
		System.out.printf("지불 금액	:%10d\n",total_sum); // 지불금액 출력
		int total_net_price = (int)(total_sum/(1+tax_rate)); // 과세금액 변수 
		System.out.printf("과세금액	:%10d\n",total_net_price); // 과세금액 출력
		int tax = total_sum - total_net_price; // 세금 변수
		System.out.printf("세금	:%10d\n",tax); // 세금 출력

	}

}
