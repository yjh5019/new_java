package everland_project;

import java.util.*;

import c_program.InputClass;
public class test {
	Scanner scanner = new Scanner(System.in);
	 String jugan_yagan;
	 String age_type2;
	 int count_b;
	 int count_c;
	 String udae;

    
    public static String age_type (int age){
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
    
    public static void last_order(String [][]a,int [] b,int [] c, int count, int total_price) {
    	System.out.println("============에버랜드====================");
    	for(int i=0;i<count; i++){
            System.out.print(a[i][0]);
            System.out.print(a[i][1]);
            System.out.print(" X ");
            System.out.print(b[i]+" ");
            System.out.print(c[i]);
            System.out.print(a[i][2]);
            System.out.println();
        }
    	System.out.println("입장료 총액은"+total_price+"입니다.");
      System.out.println("========================================");
    }
    
   
    
    
    
    
    public static int cal_each_ticket(int use_fee, double discount_rate,int how_many_ticket) {
    	
    	int price = (int) (use_fee*discount_rate*how_many_ticket);
    	
    	return price;
    }
    
    List<OrderList> data = new ArrayList<OrderList>();
	OrderList orderList = null; 
    
    public static void main(String[] args) {
    	
    	test aa = new test();
    	String [][] a = new String[5][3];
    	int [] b = new int[10]; // 티켓 갯수
    	int count_b; // 티켓 갯수
    	int [] c = new int[10]; // 가격 저장 배열
    	int count_c ; // 티켓 가격 저장
        int count = 0;
        int total_price = 0;
        int price = 0;
        long jumin;
        int day_night_type, use_fee, keep_ticket, age, how_many_ticket, prior_type;
        double discount_rate;
        InputClass2 inputClass = new InputClass2();
        Calcul calculator = new Calcul();
        while(true){
        // while문 몇번 도는지 count
        count++;
        // 주간권, 야간권 선택 입력1
        									day_night_type = inputClass.getDayNightType();
        // 주간권 야간권 배열에 저장
        									calculator.jugan_yagan(a,day_night_type,count);
        // 주민번호 입력받아 만 나이 계산
        //주민 출력창
        									jumin = inputClass.juminInput();
        // 만 나이 저장
        
        									age = calculator.calculateAge(jumin);
//        age = calculateAge(jumin);
//        System.out.println(String.format("만 나이는 %d 입니다.", age));
        // 입력 받은 만 나이를 대인..등 구분 하는 String을 배열에 저장
        									String age_type2 = calculator.age_type2(age);
        									a[count-1][1]= calculator.age_type(age);
        // 티켓 갯수 출력창
        									how_many_ticket =  inputClass.howManyTicket();
        // 티켓 갯수 배열에 저장			
        									b[count-1] = how_many_ticket; // 티켓 갯수 배열에 저장
        // 우대사항 출력 함수
        									prior_type = inputClass.udae_printf(); // 우대사항 print
        // 배열 저장 함수
        									calculator.setPriorType(a, prior_type, count);
        // 각 종류에 따른 이용요금
        use_fee = calculator.how_much_ticket(age,day_night_type);
//        use_fee = how_much_ticket(age,day_night_type);
        // 할인율
        discount_rate = calculator.discount_fee(prior_type);
        // 각 티켓당 가격
        price = calculator.cal_each_ticket(use_fee,discount_rate,how_many_ticket);
        // 배열에 저장
        c[count-1] = price;
        // 총 티켓 가격
        total_price += price;
        //발권하시겠습니까?
        keep_ticket = inputClass.print_price(price);
        
        aa.saveData();
        
        if(keep_ticket == 2){
            break;
        	}
        }
        // 최종 결과 출력 창
        last_order(a,b,c,count,total_price);
    }
    void saveData() {
    	orderList = new OrderList(jugan_yagan,
    			age_type2, count_b, count_c,udae);
    	data.add(orderList);
    	
    }
    
}