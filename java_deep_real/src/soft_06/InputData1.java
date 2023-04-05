package soft_06;

public class InputData1 {
	
	double sum;
	double ave;
	String name;
	int kor;
	int eng;
	int mat;
	
//	public InputData1(int numPersons) {
//        name = new String numPersons;
//        kor = new int numPersons;
//        eng = new int[numPersons];
//        mat = new int[numPersons];
//        sum = new int[numPersons];
//        ave = new double numPersons;
	
	public void SetData(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor= kor;
        this.eng= eng;
        this.mat= mat;
        this.sum = kor + eng + mat;
        this.ave = (double)sum / 3.0;
    }
}
