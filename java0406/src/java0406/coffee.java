package java0406;
import java.util.Scanner;
public class coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int i = sc.nextInt();
		
		int coffee = 2000; //  Ŀ�� ���ܴ� ����
		int alba = 10000; //  �˹� �ñ� 60��
		int makecoffee = 3; // ���ܴ� ����� �ð� 3��
		double benefit = 0.66; //  ���ͷ�
		int free_coffee = 0;
		//���� �Ⱦ����� ������ = 2000*����/0.66
		double real_benefit = (coffee*i)*0.66;
		// ������ = ���ܰ���* ����*���ͷ�- ���ܸ���½ð�*����
		//                                  10000/60 * Ŀ�� ����� �ð�
		// 
		for(int j=0;j<=i;j++) {
			if(j%10==0 && j>=10) {
				free_coffee++;	
			}
		}
		
		int total_coffee = i+free_coffee; //  �� Ŀ�� ����
		double real_real_benefit = coffee*total_coffee*benefit - (alba/60.0)*makecoffee*total_coffee;
		//                ������ = Ŀ�ǰ��� * Ŀ�ǰ���* ���ͷ� - (�� Ŀ�� ����� �ð��� �˹ٺ�)
		//output
		// ���ұݾ�, ������, ����Ŀ�� ���� ����, ���ð�
		
		System.out.println("���ұݾ�: "+i*coffee);
		System.out.println("������: "+real_real_benefit);
		System.out.println("����Ŀ�ǰ��� : "+free_coffee);
		System.out.println("���ð�: "+total_coffee*makecoffee);
		
	
		
		
		
		

	}

}
