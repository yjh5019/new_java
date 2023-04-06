package java0406;
import java.util.Scanner;
public class coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇잔 : ");
		int i = sc.nextInt();
		
		int coffee = 2000; //  커피 한잔당 가격
		int alba = 10000; //  알바 시급 60분
		int makecoffee = 3; // 한잔당 만드는 시간 3분
		double benefit = 0.66; //  수익률
		int free_coffee = 0;
		//한잔 팔았을때 수익율 = 2000*몇잔/0.66
		double real_benefit = (coffee*i)*0.66;
		// 순수익 = 한잔가격* 갯수*수익률- 한잔만드는시간*갯수
		//                                  10000/60 * 커피 만드는 시간
		// 
		for(int j=0;j<=i;j++) {
			if(j%10==0 && j>=10) {
				free_coffee++;	
			}
		}
		
		int total_coffee = i+free_coffee; //  총 커피 갯수
		double real_real_benefit = coffee*total_coffee*benefit - (alba/60.0)*makecoffee*total_coffee;
		//                순수익 = 커피가격 * 커피갯수* 수익률 - (총 커피 만드는 시간의 알바비)
		//output
		// 지불금액, 순수익, 무료커피 제공 갯수, 대기시간
		
		System.out.println("지불금액: "+i*coffee);
		System.out.println("순수익: "+real_real_benefit);
		System.out.println("무료커피갯수 : "+free_coffee);
		System.out.println("대기시간: "+total_coffee*makecoffee);
		
	
		
		
		
		

	}

}
