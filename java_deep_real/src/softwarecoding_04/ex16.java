package softwarecoding_04;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo37_il;
		double kopo37_iD;
		
		kopo37_il = 10/3;
		kopo37_iD = 10/3.0;
		
		if(kopo37_il==kopo37_iD) // �������� �Ǽ����� ���ٸ� ���
			System.out.printf("equal\n");
		else // �ٸ��ٸ� ���
			System.out.printf("Not equal[%f][%f]\n",(double)kopo37_il,kopo37_iD);
		if(kopo37_il==3.333333) // ������ ������ �Ǽ����̴� ��� x
			System.out.printf("equal\n");
		else // �ٸ��ϱ� �̰��� ���
			System.out.printf("Not equal[3.333333][%f]\n",kopo37_iD);
		kopo37_iD=(int)kopo37_iD; // �Ǽ����� ������ ������ ����ȯ
		if(kopo37_il==kopo37_iD) // ���������� �ش� ���� ���
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n",(double)kopo37_il,kopo37_iD);
		
		System.out.printf("int�� �μ�[%d][%f]\n",kopo37_il,kopo37_iD);
		System.out.printf("double�� �μ�[%f][%f]\n",(double)kopo37_il,kopo37_iD);
		
		char kopo37_a = 'c'; // char �� ���� ������
		if(kopo37_a=='b') // a == b�� ǥ�� 
			System.out.printf("a�� b�̴�\n");
		if(kopo37_a=='c')
			System.out.printf("a�� c�̴�\n");
		if(kopo37_a=='d')
			System.out.printf("a�� d�̴�\n");
		
		String kopo37_aa="abcd";
		if(kopo37_aa.equals("abcd")) // string�� aa==abcd �� �ƴ� equals�� �̿��� �ۼ��ؾ���
			System.out.printf("aa�� abcd�̴�\n");
		else
			System.out.printf("aa�� abcd�� �ƴϴ�\n");
		boolean bb = true;
		if(!!bb) // !�� not �̹Ƿ� !!�� true
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		else
			System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�\n");
		
		

	}

}
