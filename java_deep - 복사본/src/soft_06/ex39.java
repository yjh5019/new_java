package soft_06;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				
				int iPerson = 31;
				Calendar calt = Calendar.getInstance();
				SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
				InputData inData = new InputData(iPerson);
				System.out.printf("출력 일자                 %s\n", k37_sdt.format(calt.getTime()));
				System.out.printf("===================================================================\n");
				System.out.printf("번호   이름    국어     영어     수학     총점     평균\n");
				System.out.printf("===================================================================\n");
				
				for(int i=1; i<iPerson; i++) {
					
					String name = String.format("윤지%02d", i);
					int kor = (int)(Math.random()*100);
					int eng = (int)(Math.random()*100);
					int mat = (int)(Math.random()*100);
					inData.SetData(i, name, kor, eng, mat);
					
				}
				int kor_sum = 0;
				int eng_sum = 0;
				int mat_sum = 0;
				int sum_sum = 0;
				int ave_sum = 0;
				
				
				for(int i=1; i<iPerson; i++) {
					
					System.out.printf("%03d %9s %9d %9d %9d %9d %9d\n",
										i, inData.name[i], inData.kor[i],inData.eng[i],inData.mat[i], inData.sum[i],inData.ave[i]);
					kor_sum += inData.kor[i];
					eng_sum += inData.eng[i];
					mat_sum += inData.mat[i];
					sum_sum += inData.sum[i];
					ave_sum += inData.ave[i];
				}
				System.out.printf("===================================================================\n");
				System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum, eng_sum, mat_sum, sum_sum,ave_sum);
				System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum/30, eng_sum/30, mat_sum/30, sum_sum/30,ave_sum/30);

			}
			
			
		

	}


