
public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc1 = new Calc(); // () --> ȣ�� �ϴ� �ǹ�, �����ڰ� ȣ���̵�
		Calc calc2 = new Calc(); // () --> ȣ�� �ϴ� �ǹ�, �����ڰ� ȣ���̵�
		calc1.setName("calc #1");
		calc1.setName("calc #2");
		
		int r1 = Calc.add(1, 2); // static �̶� ������ �̸����� �����ؾ��� --> class�Ҽ��̱� ������
		System.out.println(r1);
		
		
		calc1.setMemory(5);
		int r2 = calc1.addWithMemory(3);
		
		double r3 = Calc.getCircleLength(10);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
