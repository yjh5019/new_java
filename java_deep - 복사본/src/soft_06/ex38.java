package soft_06;

public class ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iPerson = 10;
		
		InputData inData = new InputData(iPerson);
		
		for(int i=0; i<iPerson; i++) {
			
			String name = String.format("����%02d", i);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			inData.SetData(i, name, kor, eng, mat);
			
		}
		
		for(int i=0; i<iPerson; i++) {
			
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%d\n",
								i, inData.name[i], inData.kor[i],inData.eng[i],inData.mat[i], inData.sum[i],inData.ave[i]);
		}

	}
	
	
}
