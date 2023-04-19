package everland_project;
import java.util.Scanner;


public class InputClass2 {
	private Scanner scanner = null;
//	private everlandMain2 everland = null;
	private Calcul calculator = null;
	public InputClass2() {
		scanner = new Scanner(System.in);
		calculator = new Calcul();
//		everland = new everlandMain2();
		
		
	}
	// 권종 선택 함수
    public int getDayNightType() {
    	System.out.println("권종을 선택하세요 : \n");
    	System.out.println("1. 주간권\n");
    	System.out.println("2. 야간권\n");
    	int day_night_type = scanner.nextInt();
    	return day_night_type;
    	
    	}
    // 주간권 야간권 저장
    public String jugan_yagan(int day_night_type) {
    	String jugan_yagan;
    	if(day_night_type == 1){
    		jugan_yagan = "주간권 ";
        }else{
        	jugan_yagan = "야간권 ";
        }
    	return jugan_yagan;
    	
    }
    // 주민 번호 입력
    public int juminInput() {
    	long jumin;
    	int age;
    	System.out.println("주민번호를 입력하세요: ");
    	jumin = scanner.nextLong();
    	age = calculator.calculateAge(jumin);
    	return age;
    }
    // 몇개를 주문하시겠습니까? (최대 10개) 입력
    public int howManyTicket() {
    	
    	System.out.println("몇개를 주문하시겠습니까? (최대 10개)\n");
    	int how_many_ticket = scanner.nextInt();
    	
    	return how_many_ticket;
    }
    
    public int udae_printf() {
    	System.out.println("우대사항을 선택하세요.");
        System.out.println("1. 없음");
        System.out.println("2. 장애인");
        System.out.println("3. 국가유공자");
        System.out.println("4. 다자녀");
        System.out.println("5. 임산부");
        int prior_type = scanner.nextInt();
        
        return prior_type;
    }
    // output
    public void print_price(int price, int keep_ticket) {
    	System.out.println("가격은 "+price+"원 입니다.");
        System.out.println("감사합니다.");
        System.out.println("계속 발권 하시겠습니까?");
        System.out.println("1. 티켓 발권");
        System.out.println("2. 종료");
        keep_ticket = scanner.nextInt();
    	
    }
    
}


