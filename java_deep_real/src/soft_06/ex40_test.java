package soft_06;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class ex40_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				
				int iPerson = 201;
				Calendar calt = Calendar.getInstance();
				SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
				InputData inData = new InputData(iPerson);
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
				int total_kor_sum = 0;
				int total_eng_sum = 0;
				int total_mat_sum = 0;
				int total_sum_sum = 0;
				int total_ave_sum = 0;
				
				
				int cnt = 1;
					
					for(int i=1; i<iPerson; i++) {
						if(i==1 || i==31 || i==61 || i==91 || i==121 || i==151 || i==181 || i==201) {
							System.out.printf("성적집계표\n");
							System.out.printf("PAGE : %d                           출력 일자   %15s\n",cnt, k37_sdt.format(calt.getTime()));
							System.out.printf("===================================================================\n");
							System.out.printf("번호   이름           국어     영어      수학      총점      평균\n");
							System.out.printf("===================================================================\n");
							
						}
						System.out.printf("%3d %9s %9d %9d %9d %9d %9d\n",
								i, inData.name[i], inData.kor[i],inData.eng[i],inData.mat[i], inData.sum[i],inData.ave[i]);
						kor_sum += inData.kor[i];
						eng_sum += inData.eng[i];
						mat_sum += inData.mat[i];
						sum_sum += inData.sum[i];
						ave_sum += inData.ave[i];
						total_kor_sum += inData.kor[i];
						total_eng_sum += inData.eng[i];
						total_mat_sum += inData.mat[i];
						total_sum_sum += inData.sum[i];
						total_ave_sum += inData.ave[i];
						if(i%30==0 || i == iPerson-1) {
							System.out.printf("===================================================================\n");
							System.out.printf("현재페이지\n");
							System.out.printf("합계          %10d %10d %9d %9d %9d\n", kor_sum, eng_sum, mat_sum, sum_sum,ave_sum);
							System.out.printf("평균           %9d %9d %9d %9d %9d\n", kor_sum/30, eng_sum/30, mat_sum/30, sum_sum/30,ave_sum/30);
							System.out.printf("===================================================================\n");
							System.out.printf("누적페이지\n");
							System.out.printf("합계           %9d %9d %9d %9d %9d\n", total_kor_sum,total_eng_sum,total_mat_sum, total_sum_sum,total_ave_sum);
							System.out.printf("평균           %9d %9d %9d %9d %9d\n", total_kor_sum/(30*cnt), total_eng_sum/(30*cnt), total_mat_sum/(30*cnt), total_sum_sum/(30*cnt),total_ave_sum/(30*cnt));
							System.out.printf("\n");
							kor_sum = 0;
							eng_sum = 0;
							mat_sum = 0;
							sum_sum = 0;
							ave_sum = 0;
							cnt++;
						}
						
					
				}
			}
			
			
		

	}


