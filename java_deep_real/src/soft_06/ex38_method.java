package soft_06;

public class ex38_method {
	
	public class InputData {
	    public String[] name;
	    public int[] kor;
	    public int[] eng;
	    public int[] mat;
	    public int[] sum;
	    public double[] ave;
	    
	    public InputData(int numPersons) {
	        name = new String[numPersons];
	        kor = new int[numPersons];
	        eng = new int[numPersons];
	        mat = new int[numPersons];
	        sum = new int[numPersons];
	        ave = new double[numPersons];
	    }
	    
	    public void SetData(int index, String name, int kor, int eng, int mat) {
	        this.name[index] = name;
	        this.kor[index] = kor;
	        this.eng[index] = eng;
	        this.mat[index] = mat;
	        this.sum[index] = kor + eng + mat;
	        this.ave[index] = (double)sum[index] / 3.0;
	    }

	}


}
