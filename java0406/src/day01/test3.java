package day01;

import java.util.*;



public class test3 {

    public static int calculateAge(long jumin) {
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
    public static int how_much_ticket(int age,int day_night_type){
        int use_fee;
        if(age<= 64 && age >=19){ // 대인
            if (day_night_type==1){
                use_fee = 56000;
            }else{
                use_fee = 46000;
            }
        }else if(age<= 18 && age >=13){ // 청소년
            if (day_night_type==1){
                use_fee = 47000;
            }else{
                use_fee = 40000;
            }
        }else if(age<= 3 && age >=12){ // 소인
            if (day_night_type==1){
                use_fee = 44000;
            }else{
                use_fee = 37000;
            }
        }else if(age >=65){             // 경로
            if (day_night_type==1){
                use_fee = 44000;
            }else{                      
                use_fee = 37000;
            }
        }else{                           //유아
            use_fee = 0;
        }
        return use_fee;
        
    }
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
    public static double discount_fee(int prior_type){
        double discount_rate;
   if(prior_type == 1){
      discount_rate = 1.0;
   }else if(prior_type == 2){
      discount_rate = 0.4;
   }else if(prior_type == 3){
      discount_rate = 0.5;
   }else if(prior_type == 4){
      discount_rate = 0.2;
   }else{
      discount_rate = 0.15;
   }
   return discount_rate;

    }
    public static int udae_printf(Scanner scanner) {
    	System.out.println("우대사항을 선택하세요.");
        System.out.println("1. 없음");
        System.out.println("2. 장애인");
        System.out.println("3. 국가유공자");
        System.out.println("4. 다자녀");
        System.out.println("5. 임산부");
        int prior_type = scanner.nextInt();
        
        return prior_type;
        
    }
    public static void setPriorType(String[][] a, int prior_type, int count) {
        if (prior_type == 1) {
            a[count - 1][2] = " * 우대적용 없음";
        } else if (prior_type == 2) {
            a[count - 1][2] = " * 장애인 우대적용";
        } else if (prior_type == 3) {
            a[count - 1][2] = " * 국가유공자 우대적용";
        } else if (prior_type == 4) {
            a[count - 1][2] = " * 다자녀 우대적용";
        } else {
            a[count - 1][2] = " * 임산부 우대적용";
        }
    }
    public static void jugan_yagan(String [][] a, int day_night_type, int count) {
    	
    	if(day_night_type == 1){
            a[count-1][0] = "주간권 ";
        }else{
            a[count-1][0] = "야간권 ";
        }
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
    // 권종 선택 함수
    public static int getDayNightType(Scanner scanner) {
    	System.out.println("권종을 선택하세요 : \n");
    	System.out.println("1. 주간권\n");
    	System.out.println("2. 야간권\n");
    	int day_night_type = scanner.nextInt();
    	return day_night_type;
    	}
    public static int print_price(Scanner scanner, int price) {
    	
    	System.out.println("가격은 "+price+"원 입니다.");
        System.out.println("감사합니다.");
        System.out.println("계속 발권 하시겠습니까?");
        System.out.println("1. 티켓 발권");
        System.out.println("2. 종료");
        int keep_ticket = scanner.nextInt();
    	
    	return keep_ticket;
    }
    public static int howManyTicket(Scanner scanner) {
    	System.out.println("몇개를 주문하시겠습니까? (최대 10개)\n");
    	int how_many_ticket = scanner.nextInt();
    	return how_many_ticket;
    }
    public static long juminInput(Scanner scanner) {
    	System.out.println("주민번호를 입력하세요: ");
        long jumin = scanner.nextLong();
        
        return jumin;
    }
    public static int cal_each_ticket(int use_fee, double discount_rate,int how_many_ticket) {
    	
    	int price = (int) (use_fee*discount_rate*how_many_ticket);
    	
    	return price;
    }
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String [][] a = new String[5][3];
    	int [] b = new int[10]; // 티켓 갯수
    	int [] c = new int[10]; // 가격 저장 배열
        int count = 0;
        int total_price = 0;
        int price = 0;
        long jumin;
        int day_night_type, use_fee, keep_ticket, age, how_many_ticket, prior_type;
        double discount_rate;
        
        
        while(true){
        // while문 몇번 도는지 count
        count++;
        // 주간권, 야간권 선택
        day_night_type = getDayNightType(scanner);
        // 주간권 야간권 배열에 저장
        jugan_yagan(a,day_night_type,count);
        // 주민번호 입력받아 만 나이 계산
        jumin = juminInput(scanner);
        // 만 나이 저장
        age = calculateAge(jumin);
//        System.out.println(String.format("만 나이는 %d 입니다.", age));
        // 입력 받은 만 나이를 대인..등 구분 하는 String을 배열에 저장
        a[count-1][1]= age_type(age);
        // 티켓 갯수
        how_many_ticket =  howManyTicket(scanner);
        // 티켓 갯수 배열에 저장
        b[count-1] = how_many_ticket; // 티켓 갯수 배열에 저장
        // 우대사항 출력 함수
        prior_type = udae_printf(scanner); // 우대사항 print
        // 배열 저장 함수
        setPriorType(a, prior_type, count);
        // 각 종류에 따른 이용요금
        use_fee = how_much_ticket(age,day_night_type);
        // 할인율
        discount_rate = discount_fee(prior_type);
        // 각 티켓당 가격
        price = cal_each_ticket(use_fee,discount_rate,how_many_ticket);
        // 배열에 저장
        c[count-1] = price;
        // 총 티켓 가격
        total_price += price;
        //발권하시겠습니까?
        keep_ticket = print_price(scanner, price);
        
        if(keep_ticket == 2){
            break;
        	}
        }
        // 최종 결과 출력 창
        last_order(a,b,c,count,total_price);
    }
    
}