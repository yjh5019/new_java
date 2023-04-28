package everland_project;
import java.util.Scanner;


public class InputClass2 {
	private Scanner scanner = null;
//	private everlandMain2 everland = null;
	private Calcul calculator = null;
	private ConstValueClass2 constValue = null;
	public InputClass2() {
		scanner = new Scanner(System.in);
		calculator = new Calcul();
		constValue = new ConstValueClass2();
//		everland = new everlandMain2();
		
		
	}
	// 권종 선택 함수
    public int getDayNightType() {
    	System.out.println(ConstValueClass2.TICKET_TYPE_QUESTION);
    	System.out.println(ConstValueClass2.TICKET_TYPE_WEEK);
    	System.out.println(ConstValueClass2.TICKET_TYPE_NIGHT);
    	int day_night_type = scanner.nextInt();
    	return day_night_type;
    	
    	}
    // 주간권 야간권 저장
    public String jugan_yagan(int day_night_type) {
    	String jugan_yagan;
    	if(day_night_type == 1){
    		jugan_yagan = ConstValueClass2.PRINT_JUGAN;
        }else{
        	jugan_yagan = ConstValueClass2.PRINT_YAGAN;
        }
    	return jugan_yagan;
    	
    }
    // 주민 번호 입력
    public int juminInput() {
    	long jumin;
    	int age;
    	System.out.println(ConstValueClass2.PRINT_JUMIN_NUM);
    	jumin = scanner.nextLong();
    	age = calculator.calculateAge(jumin);
    	System.out.println(age);
    	return age;
    }
    
//    public int juminInput() {
//    	long jumin;
//    	int age;
//    	System.out.println(ConstValueClass2.PRINT_JUMIN_NUM);
//    	jumin = scanner.nextLong();
//    	age = calculator.calculateAge(jumin);
//    	return age;
//    }
    // 몇개를 주문하시겠습니까? (최대 10개) 입력
    public int howManyTicket() {
    	
    	System.out.println(ConstValueClass2.HOW_MANY_TICKET);
    	int how_many_ticket = scanner.nextInt();
    	
    	return how_many_ticket;
    }
    
    public int udae_printf() {
    	System.out.println(ConstValueClass2.SELECT_UDAE);
        System.out.println(ConstValueClass2.SELECT_UDAE_1);
        System.out.println(ConstValueClass2.SELECT_UDAE_2);
        System.out.println(ConstValueClass2.SELECT_UDAE_3);
        System.out.println(ConstValueClass2.SELECT_UDAE_4);
        System.out.println(ConstValueClass2.SELECT_UDAE_5);
        int prior_type = scanner.nextInt();
        
        return prior_type;
    }
    // output
    public void print_price(int price, int keep_ticket) {
    	System.out.print(ConstValueClass2.PRICE_OUTPUT_1);
    	System.out.print(price);
    	System.out.println(ConstValueClass2.PRICE_OUTPUT_2);
        System.out.println(ConstValueClass2.PRICE_THANKS);
        System.out.println(ConstValueClass2.PRICE_KEEP_TICKET);
        System.out.println(ConstValueClass2.KEEP_GOING);
        System.out.println(ConstValueClass2.STOP);
        keep_ticket = scanner.nextInt();
    	
    }
    
}


