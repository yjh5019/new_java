package soft_06;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 3;
        String name = "������";
        String kor = "����";
        String eng = "����";
        String math = "����";
        String science = "����";
        String society = "��ȸ";
        String sum = "����";
        String avg = "���";
        
            ex11_method c1 = new ex11_method();
            System.out.printf("%d�� ����ǥ\n",3);
            System.out.printf("==================================================\n");
            System.out.printf("�̸�    ����  ����  ����  ����  ���\n");
            System.out.printf("==================================================\n");
            System.out.printf("%s %5d %5d %5d %5d %5s\n", name,100,100,100, c1.sum(100,100,100),c1.ave(100,100,100));
            System.out.printf("\n");

            System.out.printf("%d�� ����ǥ\n",4);
            System.out.printf("==================================================\n");
            System.out.printf("�̸�    ����   ����  ����  ����  ����  ���\n");
            System.out.printf("==================================================\n");
            System.out.printf("%s %5d %5d %5d %5d %5s %7s \n", name,100,100,100,100, c1.sum(100,100,100,100),c1.ave(100.0,100.0,100.0,100.0));
            System.out.printf("\n");
            System.out.printf("%d�� ����ǥ\n",5);
            System.out.printf("==================================================\n");
            System.out.printf("�̸�    ����   ����  ����  ����  ��ȸ  ����   ���\n");
            System.out.printf("==================================================\n");
            System.out.printf("%s %5d %5d %5d %5d %5s %5s %7s\n", name,100,100,100,100,100, c1.sum(100,100,100,100,100),c1.ave(100,100,100,100,100));

	}

}