package day01;

import java.util.*;
import java.util.Calendar;
import java.util.Date;


public class test {

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
    
    public static void udae_printf() {
    	System.out.println("우대사항을 선택하세요.");
        System.out.println("1. 없음");
        System.out.println("2. 장애인");
        System.out.println("3. 국가유공자");
        System.out.println("4. 다자녀");
        System.out.println("5. 임산부");
    }


    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int count = 0;
        int total_price = 0;
        String [][] a = new String[5][3];
        int [] b = new int[10]; // 티켓 갯수
        int [] c = new int[10]; // 가격 저장 배열
        
        
        
        while(true){
        count++;
        System.out.println("권종을 선택하세요 : \n");
        System.out.println("1. 주간권\n");
        System.out.println("2. 야간권\n");
        int day_night_type = scanner.nextInt();

        if(day_night_type == 1){
            
            a[count-1][0] = "주간권 ";
        }else{
            a[count-1][0] = "야간권 ";
        }

        // System.out.println(a[count-1][0]);
        
        System.out.println("주민번호를 입력하세요: ");
        long jumin = scanner.nextLong();
        int age = calculateAge(jumin);
        System.out.println(String.format("만 나이는 %d 입니다.", age));
        a[count-1][1]= age_type(age);

        System.out.println("몇개를 주문하시겠습니까? (최대 10개)\n");
        int how_many_ticket = scanner.nextInt();
        b[count-1] = how_many_ticket; // 티켓 갯수 배열에 저장

        udae_printf(); // 우대사항 print
        int prior_type = scanner.nextInt();
        
        if(prior_type == 1){
            a[count-1][2] = " * 우대적용 없음";
        }else if(prior_type == 2){
            a[count-1][2] = " * 장애인 우대적용";
        }else if(prior_type == 3){
            a[count-1][2] = " * 국가유공자 우대적용";
        }else if(prior_type == 4){
            a[count-1][2] = " * 다자녀 우대적용";
        }else{
            a[count-1][2] = " * 임산부 우대적용";
        }
        int price = (int)(how_much_ticket(age,day_night_type)*(discount_fee(prior_type))*how_many_ticket);
        c[count-1] = price;
        System.out.println("가격은 "+price+"원 입니다.");
        System.out.println("감사합니다.");
        total_price += price;
        
        
        
        System.out.println("계속 발권 하시겠습니까?");
        System.out.println("1. 티켓 발권");
        System.out.println("2. 종료");
        int keep_ticket = scanner.nextInt();
        if(keep_ticket == 2){
            break;
        }


        }

        System.out.println("============에버랜드===========");
        for(int i=0;i<count; i++){
            System.out.print(a[i][0]);
            System.out.print(a[i][1]);
            System.out.print(" X ");
            System.out.print(b[i]+" ");
            System.out.print(c[i]);
            System.out.print(a[i][2]);
            System.out.println();

            
        }
        System.out.println();
        System.out.println("입장료 총액은"+total_price+"입니다.");
        
        System.out.println("========================================");
    }
    
}