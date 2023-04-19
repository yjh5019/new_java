package everland_project;

import java.util.*;


public class everlandMain2 {
	ConstValueClass2 constvalue = new ConstValueClass2();
	Scanner scanner = new Scanner(System.in);
	int day_night_type,how_many_ticket,prior_type,keep_ticket,age,use_fee,total_price,price = 0,count=0;;
    long jumin;
    double discount_rate;
	String jugan_yagan,age_type2,udae;
	int count_b,count_c;
    List<OrderList> data = new ArrayList<OrderList>();
	OrderList orderList = null; 
    
	
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int total_price = 0;
        everlandMain2 everland2 = new everlandMain2();
        int keep_ticket;
        
        
        while(true){

        everland2.getDayNightType();

        everland2.how_much_ticket();

        everland2.cal_each_ticket();

        everland2.print_price();
        
        keep_ticket = scanner.nextInt();
        
        everland2.saveData();
        
        if(keep_ticket == 2){
            break;
        	}
        }
        // 최종 결과 출력 창
        everland2.last_order();
    }
    void saveData() {
		orderList = new OrderList(jugan_yagan,
				age_type2, count_b, count_c,udae);
		data.add(orderList);
	}
    void juminInput() {
    	System.out.println("주민번호를 입력하세요: ");
    	jumin = scanner.nextLong();
    	age = calculateAge(jumin);
        
    }
    int calculateAge(long jumin) {
        int year, month, day, age;

        year = (int) (jumin / 10000L); // 주민번호 앞 6자리 중 년도 부분
        month = (int) ((jumin % 10000L) / 100L);
        day = (int) (jumin % 100L);

        // 현재년도 계산
        Calendar calendar = Calendar.getInstance();
        int this_year = calendar.get(Calendar.YEAR);
        int this_month = calendar.get(Calendar.MONTH) + 1;
        int this_day = calendar.get(Calendar.DAY_OF_MONTH);

        // 생년월일을 이용한 만 나이 계산
        if (year >= 2000) { // 2000년 이후 출생자
            age = this_year - (year + 2000) + 1;
        } else { // 2000년 이전 출생자
            age = this_year - (year + 1900) + 1;
        }
        if (this_month < month || (this_month == month && this_day < day)) {
            age--; // 생일이 지나지 않은 경우 1을 빼줌
        }
        return age;
    }
    
    
    void jugan_yagan() {
    	
    	if(day_night_type == 1){
    		jugan_yagan = "주간권 ";
        }else{
        	jugan_yagan = "야간권 ";
        }
    }
    void getDayNightType() {
    	count++;
    	System.out.println("권종을 선택하세요 : \n");
    	System.out.println("1. 주간권\n");
    	System.out.println("2. 야간권\n");
    	day_night_type = scanner.nextInt();
    	jugan_yagan();
    	juminInput();
    	age_type2 = age_type(age);
    	howManyTicket();
    	udae_printf();
    	}
    
    void howManyTicket() {
    	System.out.println("몇개를 주문하시겠습니까? (최대 10개)\n");
    	how_many_ticket = scanner.nextInt();
    	count_b = how_many_ticket;
    }
    void udae_printf() {
    	System.out.println("우대사항을 선택하세요.");
        System.out.println("1. 없음");
        System.out.println("2. 장애인");
        System.out.println("3. 국가유공자");
        System.out.println("4. 다자녀");
        System.out.println("5. 임산부");
        prior_type = scanner.nextInt();
        setPriorType();
        
        
    }
    void setPriorType() {
        if (prior_type == 1) {
        	udae = " * 우대적용 없음";
        } else if (prior_type == 2) {
        	udae = " * 장애인 우대적용";
        } else if (prior_type == 3) {
        	udae = " * 국가유공자 우대적용";
        } else if (prior_type == 4) {
        	udae = " * 다자녀 우대적용";
        } else {
        	udae = " * 임산부 우대적용";
        }
    }
    void how_much_ticket(){
        if(age<= 64 && age >=19){ // 대인
            if (day_night_type==1){
                use_fee = constvalue.ADULT_DAY_PRICE;
            }else{
                use_fee = constvalue.ADULT_NIGHT_PRICE;
            }
        }else if(age<= 18 && age >=13){ // 청소년
            if (day_night_type==1){
                use_fee = constvalue.TEEN_DAY_PRICE;
            }else{
                use_fee = constvalue.TEEN_NIGHT_PRICE;
            }
        }else if(age<= 3 && age >=12){ // 소인
            if (day_night_type==1){
                use_fee = constvalue.CHILD_DAY_PRICE;
            }else{
                use_fee = constvalue.CHILD_NIGHT_PRICE;
            }
        }else if(age >=65){             // 경로
            if (day_night_type==1){
                use_fee = constvalue.OLD_DAY_PRICE;
            }else{                      
                use_fee = constvalue.OLD_NIGHT_PRICE;
            }
        }else{                           //유아
            use_fee = constvalue.BABY_PRICE;
        }
        discount_fee();
        
    }
    
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
//    void cal_each_ticket() {
//    	
//    	price = (int) (use_fee*discount_rate*how_many_ticket);
//    	count_c = price;
//    	total_price += price;
//    }
    String age_type (int age){
        String age_type;
        if(age<= 64 && age >=19){
            age_type = "대인";
        }else if(age<= 18 && age >=13){
            age_type = "청소년";
        }else if(age<= 3 && age >=12){
            age_type = "소인";
        }else if(age >=65){
            age_type = "경로";
        }else{
            age_type = "유아";
        }
        return age_type;
    }
    void last_order() {
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
    void print_price() {
    	
    	System.out.println("가격은 "+price+"원 입니다.");
        System.out.println("감사합니다.");
        System.out.println("계속 발권 하시겠습니까?");
        System.out.println("1. 티켓 발권");
        System.out.println("2. 종료");
        
    	
    }
    
    
    
    
}	
