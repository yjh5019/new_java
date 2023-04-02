package soft_06;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 3;
        String name = "폴리융";
        String kor = "국어";
        String eng = "영어";
        String math = "수학";
        String science = "과학";
        String society = "사회";
        String sum = "총점";
        String avg = "평균";
        
            ex11_method c1 = new ex11_method();
            System.out.printf("%d월 성적표\n",3);
            System.out.printf("==================================================\n");
            System.out.printf("이름    국어  영어  수학  총점  평균\n");
            System.out.printf("==================================================\n");
            System.out.printf("%s %5d %5d %5d %5d %5s\n", name,100,100,100, c1.sum(100,100,100),c1.ave(100,100,100));
            System.out.printf("\n");

            System.out.printf("%d월 성적표\n",4);
            System.out.printf("==================================================\n");
            System.out.printf("이름    국어   영어  수학  과학  총점  평균\n");
            System.out.printf("==================================================\n");
            System.out.printf("%s %5d %5d %5d %5d %5s %7s \n", name,100,100,100,100, c1.sum(100,100,100,100),c1.ave(100.0,100.0,100.0,100.0));
            System.out.printf("\n");
            System.out.printf("%d월 성적표\n",5);
            System.out.printf("==================================================\n");
            System.out.printf("이름    국어   영어  수학  과학  사회  총점   평균\n");
            System.out.printf("==================================================\n");
            System.out.printf("%s %5d %5d %5d %5d %5s %5s %7s\n", name,100,100,100,100,100, c1.sum(100,100,100,100,100),c1.ave(100,100,100,100,100));

	}

}
