package everland_project;

//import c_program.OutputClass;

public class OutputClass2 {
	
	
	private Calcul calculator = null;
	
	public OutputClass2() {
		calculator = new Calcul();
	}
	
	public void outputAge(long jumin, int count){
		int age;
		age = calculator.calculateAge(jumin);
		
		
		

		
	}
	public void outputAge(long jumin){
		
		int age = calculator.calculateAge(jumin);
		
		

		
	}

}
