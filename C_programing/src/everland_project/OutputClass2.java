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
		System.out.println("������ "+price+"�� �Դϴ�.");
        System.out.println("�����մϴ�.");
        System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
        System.out.println("1. Ƽ�� �߱�");
        System.out.println("2. ����");
		
	}
	
	public void last_order(String jugan_yagan,String age_type2, int count_b,int count_c, String udae, int total_price) {
		
		System.out.println("============��������====================");
    	for(OrderList order : data) {
    		jugan_yagan = order.get_jugan_yagan();
    		age_type2 = order.get_age_type2();
    		count_b = order.get_count_b();
    		count_c = order.get_count_c();
    		udae = order.get_udae();
    		
			System.out.print(jugan_yagan+"\t");
			System.out.print(age_type2+"\t");
			System.out.print(count_b+"\t");
			System.out.print(count_c+"��"+"\t");
			System.out.print(udae+"\n");
		}
    	
    	System.out.println("����� �Ѿ���"+total_price+"�Դϴ�.");
      System.out.println("========================================");
		
		
	}

}
