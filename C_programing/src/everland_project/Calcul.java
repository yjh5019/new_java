package everland_project;

import java.util.Calendar;

public class Calcul {
	// 만 나이 계산
	public int calculateAge(long jumin) {
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
	
	//배열 저장 함수
	
	
	// 만나이에 따른 티켓 가격
	public int how_much_ticket(int age,int day_night_type){
    	
        int use_fee;
        
        
        if(age<= 64 && age >=19){ // 대인
            if (day_night_type==1){
                use_fee = ConstValueClass2.ADULT_DAY_PRICE;
            }else{
                use_fee = ConstValueClass2.ADULT_NIGHT_PRICE;
            }
        }else if(age<= 18 && age >=13){ // 청소년
            if (day_night_type==1){
                use_fee = ConstValueClass2.TEEN_DAY_PRICE;
            }else{
                use_fee = ConstValueClass2.TEEN_NIGHT_PRICE;
            }
        }else if(age<= 3 && age >=12){ // 소인
            if (day_night_type==1){
                use_fee = ConstValueClass2.CHILD_DAY_PRICE;
            }else{
                use_fee = ConstValueClass2.CHILD_NIGHT_PRICE;
            }
        }else if(age >=65){             // 경로
            if (day_night_type==1){
                use_fee = ConstValueClass2.OLD_DAY_PRICE;
            }else{                      
                use_fee = ConstValueClass2.OLD_NIGHT_PRICE;
            }
        }else{                           //유아
            use_fee = ConstValueClass2.BABY_PRICE;
        }
        return use_fee;
        
    }
	// 할인 계산
	public double discount_fee(int prior_type){
        double discount_rate;
        
        
	   if(prior_type == 1){
	      discount_rate = ConstValueClass2.NO_DISCOUNT_RATE;
	   }else if(prior_type == 2){
	      discount_rate = ConstValueClass2.DISABLE_DISCOUNT_RATE;
	   }else if(prior_type == 3){
	      discount_rate = ConstValueClass2.COUNTRY_DISCOUNT_RATE;
	   }else if(prior_type == 4){
	      discount_rate = ConstValueClass2.MULTICHILD_DISCOUNT_RATE;
	   }else{
	      discount_rate = ConstValueClass2.PREGNANT_DISCOUNT_RATE;
	   }
	   return discount_rate;
	
	    }
	// 할인된 각 티켓 가격 계산
	public int cal_each_ticket(int use_fee, double discount_rate,int how_many_ticket) {
    	
    	int price = (int) (use_fee*discount_rate*how_many_ticket);
    	
    	return price;
    }
//	 티켓 타입 대인 소인 ...등 출력하는 함수
	public String age_type (int age){
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
	public String age_type2 (int age){
        String age_type2;
        if(age<= 64 && age >=19){
            age_type2 = "대인";
        }else if(age<= 18 && age >=13){
            age_type2 = "청소년";
        }else if(age<= 3 && age >=12){
            age_type2 = "소인";
        }else if(age >=65){
            age_type2 = "경로";
        }else{
            age_type2 = "유아";
        }
        return age_type2;
    }
	
	// 우대 사항 저장 
	public String setPriorType(int prior_type) {
		String udae;
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
        return udae;
    }
	
	public void setPriorType(String[][] a, int prior_type, int count) {
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
	public void setPriorType(int prior_type, int count) {
		String udae;
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
	
	
	
	
	
}
