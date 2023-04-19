package everland_project;

//import c_program.OutputClass;

public class OutputClass2 {
	
	
	private Calcul calculator = null;
	
	public OutputClass2() {
		calculator = new Calcul();
	}
	
	public void print_price(int price) {
		System.out.println("가격은 "+price+"원 입니다.");
        System.out.println("감사합니다.");
        System.out.println("계속 발권 하시겠습니까?");
        System.out.println("1. 티켓 발권");
        System.out.println("2. 종료");
		
	}

}
