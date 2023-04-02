package soft_06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iPerson = 201;
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		InputData inData = new InputData(iPerson);
		
		
		int kor_sum = 0;
		int eng_sum = 0;
		int mat_sum = 0;
		int sum_sum = 0;
		int ave_sum = 0;
		int kor_sum_total = 0;
		int eng_sum_total = 0;
		int mat_sum_total = 0;
		int sum_sum_total = 0;
		int ave_sum_total = 0;
		
		for(int i=1; i<iPerson; i++) {
			
			String name = String.format("윤지%02d", i);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			inData.SetData(i, name, kor, eng, mat);
			
		}
		int count = 0;
		
		
		System.out.printf("PAGE : %d 출력 일자                 %s\n",count, k37_sdt.format(calt.getTime()));
		System.out.printf("===================================================================\n");
		System.out.printf("번호     이름         국어      영어       수학      총점      평균\n");
		System.out.printf("===================================================================\n");
			
			for(int i=1; i<iPerson; i++) {
				System.out.printf("%03d %9s %9d %9d %9d %9d    %9f\n",
						i, inData.name[i], inData.kor[i],inData.eng[i],inData.mat[i], inData.sum[i],inData.ave[i]);
				kor_sum += inData.kor[i];
				eng_sum += inData.eng[i];
				mat_sum += inData.mat[i];
				sum_sum += inData.sum[i];
				ave_sum += inData.ave[i];
				

				if(i % 30 == 0) {
					
					System.out.printf("===================================================================\n");
					System.out.printf("현재페이지\n");
					System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum, eng_sum, mat_sum, sum_sum,ave_sum);
					System.out.printf("평균%9d %9d %9d %9d %9d\n", kor_sum/30, eng_sum/30, mat_sum/30, sum_sum/(30),ave_sum/30);
					System.out.printf("===================================================================\n");
					kor_sum_total += kor_sum;
					eng_sum_total += eng_sum;
					mat_sum_total += mat_sum;
					sum_sum_total += sum_sum;
					ave_sum_total += ave_sum;
					System.out.printf("누적페이지\n");
					System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum_total, eng_sum_total, mat_sum_total, sum_sum_total, ave_sum_total);
					System.out.printf("평균%9d %9d %9d %9d %9d\n", kor_sum_total/(30*(count+1)), eng_sum_total/(30*(count+1)), mat_sum_total/(30*(count+1)), sum_sum_total/(30*(count+1)),ave_sum_total/(30*(count+1)));
					
					
					System.out.printf("\n");
					System.out.printf("PAGE : %d 출력 일자                 %s\n",count+1, k37_sdt.format(calt.getTime()));
					System.out.printf("===================================================================\n");
					System.out.printf("번호     이름         국어      영어       수학      총점      평균\n");
					System.out.printf("===================================================================\n");
					kor_sum = 0;
					eng_sum = 0;
					mat_sum = 0;
					sum_sum = 0;
					ave_sum = 0;
					count ++;
				}
				if(i == iPerson-1) {
					System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum, eng_sum, mat_sum, sum_sum,ave_sum);
					System.out.printf("평균%9d %9d %9d %9d %9d\n", kor_sum/20, eng_sum/20, mat_sum/20, sum_sum/20,ave_sum/20);
					System.out.printf("===================================================================\n");

					System.out.printf("누적페이지\n");
					System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum_total, eng_sum_total, mat_sum_total, sum_sum_total,ave_sum_total);
					System.out.printf("평균%9d %9d %9d %9d %9d\n", kor_sum_total/iPerson, eng_sum_total/iPerson, mat_sum_total/iPerson, sum_sum_total/(30*(count+1)),ave_sum_total/(30*(count+1)));
					
				}
				
				
			}
			
			
		
		
		
		
//		for(int k=1; k<6; k++) {
//			
//		System.out.printf("PAGE : %d 출력 일자                 %s\n",k, k37_sdt.format(calt.getTime()));
//		System.out.printf("===================================================================\n");
//		System.out.printf("번호   이름    국어     영어     수학     총점     평균\n");
//		System.out.printf("===================================================================\n");
//			for(int i=1; i<iPerson; i++) {
//				if(iPerson%30 == 0) {
//					continue;
//				}else {
//				
//				System.out.printf("%03d %9s %9d %9d %9d %9d %9f\n",
//									i, inData.name[i], inData.kor[i],inData.eng[i],inData.mat[i], inData.sum[i],inData.ave[i]);
//				kor_sum += inData.kor[i];
//				eng_sum += inData.eng[i];
//				mat_sum += inData.mat[i];
//				sum_sum += inData.sum[i];
//				ave_sum += inData.ave[i];
//				}
//			}
//			System.out.printf("===================================================================\n");
//			System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum, eng_sum, mat_sum, sum_sum,ave_sum);
//			System.out.printf("합계%9d %9d %9d %9d %9d\n", kor_sum/30, eng_sum/30, mat_sum/30, sum_sum/30,ave_sum/30);
//		}
//		
		

	}

}
