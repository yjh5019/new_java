package everland_project;
import java.util.Scanner;


public class InputClass2 {
	private Scanner scanner = null;
	
	public InputClass2() {
		scanner = new Scanner(System.in);
	}
	// ���� ���� �Լ�
    public int getDayNightType() {
    	int day_night_type;
    	System.out.println("������ �����ϼ��� : \n");
    	System.out.println("1. �ְ���\n");
    	System.out.println("2. �߰���\n");
    	day_night_type = scanner.nextInt();
    	return day_night_type;
    	}
    public long juminInput() {
    	System.out.println("�ֹι�ȣ�� �Է��ϼ���: ");
        long jumin = scanner.nextLong();
        
        return jumin;
    }
    
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
    
    public int print_price(int price) {
    	
    	System.out.println("������ "+price+"�� �Դϴ�.");
        System.out.println("�����մϴ�.");
        System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
        System.out.println("1. Ƽ�� �߱�");
        System.out.println("2. ����");
        int keep_ticket = scanner.nextInt();
    	
    	return keep_ticket;
    }
    
}


