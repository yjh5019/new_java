package everland_project;

//import c_program.OutputClass;

public class OutputClass2 {
	
	
	private Calcul calculator = null;
	
	public OutputClass2() {
		calculator = new Calcul();
	}
	
	public void print_price(int price) {
		System.out.println("������ "+price+"�� �Դϴ�.");
        System.out.println("�����մϴ�.");
        System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
        System.out.println("1. Ƽ�� �߱�");
        System.out.println("2. ����");
		
	}

}
