package everland_project;

import java.util.ArrayList;
import java.util.List;

//import c_program.OutputClass;

public class OutputClass2 {
	
	
	private Calcul calculator = null;
	private List<OrderList> data = null;
//	private OrderList orderList = null;
	public OutputClass2() {
		calculator = new Calcul();
//		order = new ArrayList<OrderList>();
	}
	
	public void print_price(int price) {
		System.out.println("가격은 "+price+"원 입니다.");
        System.out.println("감사합니다.");
        System.out.println("계속 발권 하시겠습니까?");
        System.out.println("1. 티켓 발권");
        System.out.println("2. 종료");
		
	}
	
	public void last_order(String jugan_yagan,String age_type2, int count_b,int count_c, String udae, int total_price) {
		
		System.out.println("============에버랜드====================");
    	for(OrderList order : data) {
    		jugan_yagan = order.get_jugan_yagan();
    		age_type2 = order.get_age_type2();
    		count_b = order.get_count_b();
    		count_c = order.get_count_c();
    		udae = order.get_udae();
    		
			System.out.print(jugan_yagan+"\t");
			System.out.print(age_type2+"\t");
			System.out.print(count_b+"\t");
			System.out.print(count_c+"원"+"\t");
			System.out.print(udae+"\n");
		}
    	
    	System.out.println("입장료 총액은"+total_price+"입니다.");
      System.out.println("========================================");
		
		
	}

}
