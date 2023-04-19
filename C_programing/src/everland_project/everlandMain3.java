package everland_project;
import java.util.*;


public class everlandMain3 {
	Scanner scanner = new Scanner(System.in);
	int day_night_type,how_many_ticket,prior_type,keep_ticket,age,use_fee,total_price,price = 0,count=0;
    long jumin;
    double discount_rate;
	String jugan_yagan,age_type2,udae;
	int count_b,count_c;
	/////////////////////////////////////////////////////////
	ConstValueClass2 constvalue = new ConstValueClass2();
	InputClass2 inputClass = new InputClass2();
	Calcul calculator = new Calcul();
	OutputClass2 outputClass = new OutputClass2();
	
	
    List<OrderList> data = new ArrayList<OrderList>();
	OrderList orderList = null;
	
	/////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunEverland runeverland = new RunEverland();
		Scanner scanner = new Scanner(System.in);
        int total_price = 0;
        int keep_ticket;
        everlandMain3 everland3 = new everlandMain3();
        
        
        while(true){
//        	runeverland.Input();
//        	runeverland.calculate();
//        	runeverland.output();
        everland3.Input();
        everland3.calculate();
        everland3.output();
        
        
        
        
        keep_ticket = scanner.nextInt();
        everland3.saveData();
        if(keep_ticket == 2){
            break;
        	}
        }
        // ���� ��� ��� â
        everland3.last_order();
     /////////////////////////////////////////////////////////
	}
	void saveData() {
		orderList = new OrderList(jugan_yagan,
				age_type2, count_b, count_c,udae);
		data.add(orderList);
	}
    //InputData
    void Input() {
    	count++;
    	day_night_type = inputClass.getDayNightType(); // �ְ� �߰� �Է�
    	jugan_yagan = inputClass.jugan_yagan(day_night_type);
    	age = inputClass.juminInput();
    	age_type2 = calculator.age_type(age);
    	how_many_ticket = inputClass.howManyTicket();
    	count_b = how_many_ticket;
    	prior_type = inputClass.udae_printf();
    	udae = calculator.setPriorType(prior_type);
    	use_fee =  calculator.how_much_ticket(age,day_night_type);
    	discount_rate = calculator.discount_fee(prior_type);
    	}
    // calcul
    // calcul
    void discount_fee(){
        
	   if(prior_type == 1){
	      discount_rate = constvalue.NO_DISCOUNT_RATE;
	   }else if(prior_type == 2){
	      discount_rate = constvalue.DISABLE_DISCOUNT_RATE;
	   }else if(prior_type == 3){
	      discount_rate = constvalue.COUNTRY_DISCOUNT_RATE;
	   }else if(prior_type == 4){
	      discount_rate = constvalue.MULTICHILD_DISCOUNT_RATE;
	   }else{
	      discount_rate = constvalue.PREGNANT_DISCOUNT_RATE;
	   }
	
	    }
    void calculate() {
    	price = calculator.cal_each_ticket(use_fee,discount_rate,how_many_ticket);
    	count_c = price;
    	total_price += price;
    }
    String age_type (int age){
        String age_type;
        if(age<= 64 && age >=19){
            age_type = "����";
        }else if(age<= 18 && age >=13){
            age_type = "û�ҳ�";
        }else if(age<= 3 && age >=12){
            age_type = "����";
        }else if(age >=65){
            age_type = "���";
        }else{
            age_type = "����";
        }
        return age_type;
    }
    void last_order() {
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
    void output() {
    	outputClass.print_price(price);
    	
    }
}

