package day01;

import java.util.*;
import java.util.Calendar;
import java.util.Date;


public class test2 {

    public static int calculateAge(long jumin) {
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
    public static int how_much_ticket(int age,int day_night_type){
        int use_fee;
        if(age<= 64 && age >=19){ // ����
            if (day_night_type==1){
                use_fee = 56000;
            }else{
                use_fee = 46000;
            }
        }else if(age<= 18 && age >=13){ // û�ҳ�
            if (day_night_type==1){
                use_fee = 47000;
            }else{
                use_fee = 40000;
            }
        }else if(age<= 3 && age >=12){ // ����
            if (day_night_type==1){
                use_fee = 44000;
            }else{
                use_fee = 37000;
            }
        }else if(age >=65){             // ���
            if (day_night_type==1){
                use_fee = 44000;
            }else{                      
                use_fee = 37000;
            }
        }else{                           //����
            use_fee = 0;
        }


        return use_fee;
        
    }
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
    	System.out.println("�������� �����ϼ���.");
        System.out.println("1. ����");
        System.out.println("2. �����");
        System.out.println("3. ����������");
        System.out.println("4. ���ڳ�");
        System.out.println("5. �ӻ��");
    }
    
    public static void setPriorType(String[][] a, int prior_type, int count) {
        if (prior_type == 1) {
            a[count - 1][2] = " * ������� ����";
        } else if (prior_type == 2) {
            a[count - 1][2] = " * ����� �������";
        } else if (prior_type == 3) {
            a[count - 1][2] = " * ���������� �������";
        } else if (prior_type == 4) {
            a[count - 1][2] = " * ���ڳ� �������";
        } else {
            a[count - 1][2] = " * �ӻ�� �������";
        }
    }
    
    public static void jugan_yagan(String [][] a, int day_night_type, int count) {
    	
    	if(day_night_type == 1){
            a[count-1][0] = "�ְ��� ";
        }else{
            a[count-1][0] = "�߰��� ";
        }
    }
    
    public static void last_order(String [][]a,int [] b,int [] c, int count) {
    	for(int i=0;i<count; i++){
            System.out.print(a[i][0]);
            System.out.print(a[i][1]);
            System.out.print(" X ");
            System.out.print(b[i]+" ");
            System.out.print(c[i]);
            System.out.print(a[i][2]);
            System.out.println();
        }
    }
    
    
    public static int getDayNightType(Scanner scanner) {
    	System.out.println("������ �����ϼ��� : \n");
    	System.out.println("1. �ְ���\n");
    	System.out.println("2. �߰���\n");
    	int day_night_type = scanner.nextInt();
    	return day_night_type;
    	}
    
    
    
    


    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String [][] a = new String[5][3];
    	
        int count = 0;
        int total_price = 0;
        int [] b = new int[10]; // Ƽ�� ����
        int [] c = new int[10]; // ���� ���� �迭
        
        
        
        while(true){
        count++;
        
        int day_night_type = getDayNightType(scanner);
        jugan_yagan(a,day_night_type,count);
        
        
      
        
        System.out.println("�ֹι�ȣ�� �Է��ϼ���: ");
        long jumin = scanner.nextLong();
        
        int age = calculateAge(jumin);
        
        System.out.println(String.format("�� ���̴� %d �Դϴ�.", age));
        a[count-1][1]= age_type(age);

        System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)\n");
        int how_many_ticket = scanner.nextInt();
        
        b[count-1] = how_many_ticket; // Ƽ�� ���� �迭�� ����

        udae_printf(); // ������ print
     
        int prior_type = scanner.nextInt();
        setPriorType(a, prior_type, count);
   
        int price = (int)(how_much_ticket(age,day_night_type)*(discount_fee(prior_type))*how_many_ticket);
        c[count-1] = price;
        System.out.println("������ "+price+"�� �Դϴ�.");
        System.out.println("�����մϴ�.");
        total_price += price;
        System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
        System.out.println("1. Ƽ�� �߱�");
        System.out.println("2. ����");
        int keep_ticket = scanner.nextInt();
        if(keep_ticket == 2){
            break;
        	}
        }

        System.out.println("============��������====================");
        last_order(a,b,c,count);
        System.out.println("����� �Ѿ���"+total_price+"�Դϴ�.");
        System.out.println("========================================");
    }
    
}