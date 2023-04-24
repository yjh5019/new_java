package everland_project;

import java.util.Calendar;

public class Calcul {
	// �� ���� ���
	public int calculateAge(long jumin) {
        int year, month, day, age;

        year = (int) (jumin / 10000L); // �ֹι�ȣ �� 6�ڸ� �� �⵵ �κ�
        month = (int) ((jumin % 10000L) / 100L);
        day = (int) (jumin % 100L);

        // ����⵵ ���
        Calendar calendar = Calendar.getInstance();
        int this_year = calendar.get(Calendar.YEAR);
        int this_month = calendar.get(Calendar.MONTH) + 1;
        int this_day = calendar.get(Calendar.DAY_OF_MONTH);

        // ��������� �̿��� �� ���� ���
        if (year >= 2000) { // 2000�� ���� �����
            age = this_year - (year + 2000) + 1;
        } else { // 2000�� ���� �����
            age = this_year - (year + 1900) + 1;
        }
        if (this_month < month || (this_month == month && this_day < day)) {
            age--; // ������ ������ ���� ��� 1�� ����
        }
        return age;
    }
	
	//�迭 ���� �Լ�
	
	
	// �����̿� ���� Ƽ�� ����
	public int how_much_ticket(int age,int day_night_type){
    	
        int use_fee;
        
        
        if(age<= 64 && age >=19){ // ����
            if (day_night_type==1){
                use_fee = ConstValueClass2.ADULT_DAY_PRICE;
            }else{
                use_fee = ConstValueClass2.ADULT_NIGHT_PRICE;
            }
        }else if(age<= 18 && age >=13){ // û�ҳ�
            if (day_night_type==1){
                use_fee = ConstValueClass2.TEEN_DAY_PRICE;
            }else{
                use_fee = ConstValueClass2.TEEN_NIGHT_PRICE;
            }
        }else if(age<= 3 && age >=12){ // ����
            if (day_night_type==1){
                use_fee = ConstValueClass2.CHILD_DAY_PRICE;
            }else{
                use_fee = ConstValueClass2.CHILD_NIGHT_PRICE;
            }
        }else if(age >=65){             // ���
            if (day_night_type==1){
                use_fee = ConstValueClass2.OLD_DAY_PRICE;
            }else{                      
                use_fee = ConstValueClass2.OLD_NIGHT_PRICE;
            }
        }else{                           //����
            use_fee = ConstValueClass2.BABY_PRICE;
        }
        return use_fee;
        
    }
	// ���� ���
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
	// ���ε� �� Ƽ�� ���� ���
	public int cal_each_ticket(int use_fee, double discount_rate,int how_many_ticket) {
    	
    	int price = (int) (use_fee*discount_rate*how_many_ticket);
    	
    	return price;
    }
//	 Ƽ�� Ÿ�� ���� ���� ...�� ����ϴ� �Լ�
	public String age_type (int age){
        String age_type;
        if(age<= 64 && age >=19){
            age_type = ConstValueClass2. AGE_TYPE_ADULT;
        }else if(age<= 18 && age >=13){
            age_type = ConstValueClass2.AGE_TYPE_TEEN;
        }else if(age<= 3 && age >=12){
            age_type = ConstValueClass2.AGE_TYPE_CHILD;
        }else if(age >=65){
            age_type = ConstValueClass2.AGE_TYPE_OLD;
        }else{
            age_type = ConstValueClass2.AGE_TYPE_INFANT;
        }
        return age_type;
    }
	
	// ��� ���� ���� 
	public String setPriorType(int prior_type) {
		String udae;
        if (prior_type == 1) {
        	udae = ConstValueClass2.PRINT_UDAE_NONE;
        } else if (prior_type == 2) {
        	udae = ConstValueClass2.PRINT_UDAE_Disabled;
        } else if (prior_type == 3) {
        	udae =ConstValueClass2.PRINT_UDAE_MenofNationalMerit;
        } else if (prior_type == 4) {
        	udae = ConstValueClass2.PRINT_UDAE_MultipleChildren;
        } else {
        	udae = ConstValueClass2.PRINT_UDAE_PregnantWoman;
        }
        return udae;
    }
	
	
	

	
	
}
