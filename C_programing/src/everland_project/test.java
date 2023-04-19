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
    
    public static void last_order(String [][]a,int [] b,int [] c, int count, int total_price) {
    	System.out.println("============��������====================");
    	for(int i=0;i<count; i++){
            System.out.print(a[i][0]);
            System.out.print(a[i][1]);
            System.out.print(" X ");
            System.out.print(b[i]+" ");
            System.out.print(c[i]);
            System.out.print(a[i][2]);
            System.out.println();
        }
    	System.out.println("����� �Ѿ���"+total_price+"�Դϴ�.");
      System.out.println("========================================");
    }
    
   
    
    
    
    
    public static int cal_each_ticket(int use_fee, double discount_rate,int how_many_ticket) {
    	
    	int price = (int) (use_fee*discount_rate*how_many_ticket);
    	
    	return price;
    }
    
    public static void main(String[] args) {
    	
    	test aa = new test();
    	String [][] a = new String[5][3];
    	int [] b = new int[10]; // Ƽ�� ����
    	int count_b; // Ƽ�� ����
    	int [] c = new int[10]; // ���� ���� �迭
    	int count_c ; // Ƽ�� ���� ����
        int count = 0;
        int total_price = 0;
        int price = 0;
        long jumin;
        int day_night_type, use_fee, keep_ticket, age, how_many_ticket, prior_type;
        double discount_rate;
        InputClass2 inputClass = new InputClass2();
        Calcul calculator = new Calcul();
        while(true){
        // while�� ��� ������ count
        count++;
        // �ְ���, �߰��� ���� �Է�1
        									day_night_type = inputClass.getDayNightType();
        // �ְ��� �߰��� �迭�� ����
        									calculator.jugan_yagan(a,day_night_type,count);
        // �ֹι�ȣ �Է¹޾� �� ���� ���
        //�ֹ� ���â
        									jumin = inputClass.juminInput();
        // �� ���� ����
        
        									age = calculator.calculateAge(jumin);
//        age = calculateAge(jumin);
//        System.out.println(String.format("�� ���̴� %d �Դϴ�.", age));
        // �Է� ���� �� ���̸� ����..�� ���� �ϴ� String�� �迭�� ����
        									String age_type2 = calculator.age_type2(age);
        									a[count-1][1]= calculator.age_type(age);
        // Ƽ�� ���� ���â
        									how_many_ticket =  inputClass.howManyTicket();
        // Ƽ�� ���� �迭�� ����			
        									b[count-1] = how_many_ticket; // Ƽ�� ���� �迭�� ����
        // ������ ��� �Լ�
        									prior_type = inputClass.udae_printf(); // ������ print
        // �迭 ���� �Լ�
        									calculator.setPriorType(a, prior_type, count);
        // �� ������ ���� �̿���
        use_fee = calculator.how_much_ticket(age,day_night_type);
//        use_fee = how_much_ticket(age,day_night_type);
        // ������
        discount_rate = calculator.discount_fee(prior_type);
        // �� Ƽ�ϴ� ����
        price = calculator.cal_each_ticket(use_fee,discount_rate,how_many_ticket);
        // �迭�� ����
        c[count-1] = price;
        // �� Ƽ�� ����
        total_price += price;
        //�߱��Ͻðڽ��ϱ�?
        keep_ticket = inputClass.print_price(price);
        
        aa.saveData();
        
        if(keep_ticket == 2){
            break;
        	}
        }
        // ���� ��� ��� â
        last_order(a,b,c,count,total_price);
    }
    void saveData() {
    	orderList = new OrderList(jugan_yagan,
    			age_type2, count_b, count_c,udae);
    	data.add(orderList);
    	
    }
    
}