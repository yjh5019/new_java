
public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc1 = new Calc(); // () --> 호출 하는 의미, 생성자가 호출이됨
		Calc calc2 = new Calc(); // () --> 호출 하는 의미, 생성자가 호출이됨
		calc1.setName("calc #1");
		calc1.setName("calc #2");
		
		int r1 = Calc.add(1, 2); // static 이라서 메인의 이름으로 접근해야함 --> class소속이기 때문에
		System.out.println(r1);
		
		
		calc1.setMemory(5);
		int r2 = calc1.addWithMemory(3);
		
		double r3 = Calc.getCircleLength(10);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
