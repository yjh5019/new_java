package soft_07;

import java.util.ArrayList;

public class ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dataSet();
		HeaderPrint();
		for(int i=0; i< ArrayOneRec.size();i++) {
			ItemPrint(i);
			
		}
		TailPrint();
		

	}
	
//	public class Main01{
	
		static ArrayList<OneRec> ArrayOneRec = new ArrayList <OneRec>();
		
		static int sumkor = 0;
		static int sumeng = 0;
		static int summat = 0;
		static int sumsum = 0;
		static int sumave = 0;
		static final int iPerson = 20;
		
		//������ �����
		
		public static void dataSet() {
			
			for(int i=0; i<iPerson; i++) {
				String name = String.format("ȫ��%02d",i);
				int kor = (int)(Math.random()*100);
				int eng = (int)(Math.random()*100);
				int mat = (int)(Math.random()*100);
				ArrayOneRec.add(new OneRec(i, name, kor, eng, mat));
				
			}
		}
		
		
		public static void HeaderPrint() {
			System.out.printf("****************************************\n");
			System.out.printf("%2s %4s %2s %2s %2s %2s %2s \n", "��ȣ", "�̸�","����", "����","����","�հ�", "���");
			System.out.printf("****************************************\n");
		}
		//�����μ�
		public static void ItemPrint(int i) {
			
			OneRec rec;
			
			rec = ArrayOneRec.get(i);
			System.out.printf("%4d %4s %3d %3d %3d  %3d %6.2f\n",rec.student_id(),rec.name(), rec.kor(), rec.eng(),rec.mat(),rec.sum(),rec.ave());
			
			
			sumkor += rec.kor();
			sumeng += rec.eng();
			summat += rec.mat();
			sumsum += rec.sum();
			sumave += rec.ave();
			
		}
		//���� �μ�
		public static void TailPrint() {
			System.out.printf("****************************************\n");
			
			System.out.printf("�����հ� %d    �������: %6.2f\n",sumkor, sumkor/(double)ArrayOneRec.size());
			System.out.printf("�����հ� %d    �������: %6.2f\n",sumeng, sumeng/(double)ArrayOneRec.size());
			System.out.printf("�����հ� %d    �������: %6.2f\n",summat, summat/(double)ArrayOneRec.size());
			
			System.out.printf("****************************************\n");
			System.out.printf("������հ� %d    ��������: %6.2f\n",sumave, sumave/(double)ArrayOneRec.size());
			
		}
		
		
		
		
		
		
		
		
		
	}

//}
