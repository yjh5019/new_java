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
	// ���� ���� �Լ�
    public int getDayNightType() {
    	System.out.println("������ �����ϼ��� : \n");
    	System.out.println("1. �ְ���\n");
    	System.out.println("2. �߰���\n");
    	int day_night_type = scanner.nextInt();
    	return day_night_type;
    	
    	}
    // �ְ��� �߰��� ����
    public String jugan_yagan(int day_night_type) {
    	String jugan_yagan;
    	if(day_night_type == 1){
    		jugan_yagan = "�ְ��� ";
        }else{
        	jugan_yagan = "�߰��� ";
        }
    	return jugan_yagan;
    	
    }
    // �ֹ� ��ȣ �Է�
    public int juminInput() {
    	long jumin;
    	int age;
    	System.out.println("�ֹι�ȣ�� �Է��ϼ���: ");
    	jumin = scanner.nextLong();
    	age = calculator.calculateAge(jumin);
    	return age;
    }
    // ��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��) �Է�
    public int howManyTicket() {
    	
    	System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)\n");
    	int how_many_ticket = scanner.nextInt();
    	
    	return how_many_ticket;
    }
    
    public int udae_printf() {
    	System.out.println("�������� �����ϼ���.");
        System.out.println("1. ����");
        System.out.println("2. �����");
        System.out.println("3. ����������");
        System.out.println("4. ���ڳ�");
        System.out.println("5. �ӻ��");
        int prior_type = scanner.nextInt();
        
        return prior_type;
    }
    // output
    public void print_price(int price, int keep_ticket) {
    	System.out.println("������ "+price+"�� �Դϴ�.");
        System.out.println("�����մϴ�.");
        System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
        System.out.println("1. Ƽ�� �߱�");
        System.out.println("2. ����");
        keep_ticket = scanner.nextInt();
    	
    }
    
}


