package everland_project;

import java.util.ArrayList;
import java.util.List;

//import c_program.OutputClass;

public class OutputClass2 {
	
	
	private Calcul calculator = null;
	private List<OrderList> data = null;
	private ConstValueClass2 constValue = null;
//	private OrderList orderList = null;
	public OutputClass2() {
		calculator = new Calcul();
//		order = new ArrayList<OrderList>();
		constValue = new ConstValueClass2();
	}
	
	public void print_price(int price) {
		System.out.print(ConstValueClass2.PRICE_OUTPUT_1);
    	System.out.print(price);
    	System.out.println(ConstValueClass2.PRICE_OUTPUT_2);
        System.out.println(ConstValueClass2.PRICE_THANKS);
        System.out.println(ConstValueClass2.PRICE_KEEP_TICKET);
        System.out.println(ConstValueClass2.KEEP_GOING);
        System.out.println(ConstValueClass2.STOP);
		
	}
	
	public void last_order(String jugan_yagan,String age_type2, int count_b,int count_c, String udae, int total_price) {
		
		System.out.println(ConstValueClass2.PRINT_EVERLAND);
    	for(OrderList order : data) {
    		jugan_yagan = order.get_jugan_yagan();
    		age_type2 = order.get_age_type2();
    		count_b = order.get_count_b();
    		count_c = order.get_count_c();
    		udae = order.get_udae();
    		
			System.out.print(jugan_yagan+"\t");
			System.out.print(age_type2+"\t");
			System.out.print(count_b+"\t");
			System.out.print(count_c);
			System.out.print(ConstValueClass2.WON+"\t");
			System.out.print(udae+"\n");
		}
    	
    	System.out.print(ConstValueClass2.PRINT_TOTAL_PRICE);
    	System.out.println(total_price + ConstValueClass2.WON);
    	
    	
    	
      System.out.println("========================================");
		
		
	}

}
