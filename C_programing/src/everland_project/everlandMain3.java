package everland_project;
import java.util.*;


public class everlandMain3 {
	Scanner scanner = new Scanner(System.in);
	int day_night_type,how_many_ticket,prior_type,keep_ticket,age,use_fee,total_price,price = 0,count=0;
    long jumin;
    double discount_rate;
	String jugan_yagan,age_type2,udae;
	int count_b,count_c;
	InputClass2 inputClass = new InputClass2();
	Calcul calculator = new Calcul();
	OutputClass2 outputClass = new OutputClass2();
	
	
    List<OrderList> data = new ArrayList<OrderList>();
	OrderList orderList = null;
	
	/////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RunEverland runeverland = new RunEverland();
		Scanner scanner = new Scanner(System.in);
        int keep_ticket;
        everlandMain3 everland3 = new everlandMain3();
        
        
        while(true){
        everland3.Input(); // 입력
        everland3.calculate(); // 계산
        everland3.output(); //  출력
        keep_ticket = scanner.nextInt();
        everland3.saveData();
        if(keep_ticket == 2){
            break;
        	}
        }
        // 최종 결과 출력 창
        everland3.last_order();
	}
	void saveData() {
		orderList = new OrderList(jugan_yagan,
				age_type2, count_b, count_c,udae);
		data.add(orderList);
	}
    //InputData
    void Input() {
    	count++;
    	day_night_type = inputClass.getDayNightType(); // 주간 야간 입력
    	jugan_yagan = inputClass.jugan_yagan(day_night_type);// 주간 야간 정보 저장
    	age = inputClass.juminInput(); //  주민번호 입력
    	how_many_ticket = inputClass.howManyTicket(); //  티켓 갯수 입력
    	count_b = how_many_ticket; //  누적 티켓 갯수 저장
    	prior_type = inputClass.udae_printf(); //  우대사항 입력
    	udae = calculator.setPriorType(prior_type); // 우대사항 내용 저장
    	use_fee =  calculator.how_much_ticket(age,day_night_type); // 나이에 따른 티켓 가격 저장
    	discount_rate = calculator.discount_fee(prior_type); // 우대 사항에 따른 할인율
    	}
    // calcul
    void calculate() {
    	age_type2 = calculator.age_type(age); // 만 나이 계산
    	price = calculator.cal_each_ticket(use_fee,discount_rate,how_many_ticket); // 할인된 티켓 가격 계산
    	count_c = price; //  가격 저장 후 최종 
    	total_price += price; //  누적 가격 저장
    }
    void last_order() {
//    	outputClass.last_order(jugan_yagan,age_type2,count_b,count_c,udae,total_price);
    	System.out.println("====================에버랜드=====================");
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
    	
    	System.out.println("입장료 총액은 "+total_price+"원 입니다.");
      System.out.println("=================================================");
    }
    void output() {
    	outputClass.print_price(price);
    	
    }
}

