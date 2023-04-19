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
        // ���� ��� ��� â
        everland2.last_order();
    }
    void saveData() {
		orderList = new OrderList(jugan_yagan,
				age_type2, count_b, count_c,udae);
		data.add(orderList);
	}
    void juminInput() {
    	System.out.println("�ֹι�ȣ�� �Է��ϼ���: ");
    	jumin = scanner.nextLong();
    	age = calculateAge(jumin);
        
    }
    int calculateAge(long jumin) {
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
    
    
    void jugan_yagan() {
    	
    	if(day_night_type == 1){
    		jugan_yagan = "�ְ��� ";
        }else{
        	jugan_yagan = "�߰��� ";
        }
    }
    void getDayNightType() {
    	count++;
    	System.out.println("������ �����ϼ��� : \n");
    	System.out.println("1. �ְ���\n");
    	System.out.println("2. �߰���\n");
    	day_night_type = scanner.nextInt();
    	jugan_yagan();
    	juminInput();
    	age_type2 = age_type(age);
    	howManyTicket();
    	udae_printf();
    	}
    
    void howManyTicket() {
    	System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)\n");
    	how_many_ticket = scanner.nextInt();
    	count_b = how_many_ticket;
    }
    void udae_printf() {
    	System.out.println("�������� �����ϼ���.");
        System.out.println("1. ����");
        System.out.println("2. �����");
        System.out.println("3. ����������");
        System.out.println("4. ���ڳ�");
        System.out.println("5. �ӻ��");
        prior_type = scanner.nextInt();
        setPriorType();
        
        
    }
    void setPriorType() {
        if (prior_type == 1) {
        	udae = " * ������� ����";
        } else if (prior_type == 2) {
        	udae = " * ����� �������";
        } else if (prior_type == 3) {
        	udae = " * ���������� �������";
        } else if (prior_type == 4) {
        	udae = " * ���ڳ� �������";
        } else {
        	udae = " * �ӻ�� �������";
        }
    }
    void how_much_ticket(){
        if(age<= 64 && age >=19){ // ����
            if (day_night_type==1){
                use_fee = constvalue.ADULT_DAY_PRICE;
            }else{
                use_fee = constvalue.ADULT_NIGHT_PRICE;
            }
        }else if(age<= 18 && age >=13){ // û�ҳ�
            if (day_night_type==1){
                use_fee = constvalue.TEEN_DAY_PRICE;
            }else{
                use_fee = constvalue.TEEN_NIGHT_PRICE;
            }
        }else if(age<= 3 && age >=12){ // ����
            if (day_night_type==1){
                use_fee = constvalue.CHILD_DAY_PRICE;
            }else{
                use_fee = constvalue.CHILD_NIGHT_PRICE;
            }
        }else if(age >=65){             // ���
            if (day_night_type==1){
                use_fee = constvalue.OLD_DAY_PRICE;
            }else{                      
                use_fee = constvalue.OLD_NIGHT_PRICE;
            }
        }else{                           //����
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
    void print_price() {
    	
    	System.out.println("������ "+price+"�� �Դϴ�.");
        System.out.println("�����մϴ�.");
        System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
        System.out.println("1. Ƽ�� �߱�");
        System.out.println("2. ����");
        
    	
    }
    
    
    
    
}	
