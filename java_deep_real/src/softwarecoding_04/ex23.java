package softwarecoding_04;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// iNumval ==> ������ ���� ==> ���������� ��ȯ ==> (���������� ��ȯ�ؾ� �� ��Ҹ� ���� �� ����???)substring���� �� ��Ҹ� �и�
		// ==>�и��� ����� �� ����"0","1"..���� Integer.parseInt�� ���� ������ ��ȯ(units �迭�� �ε�
		// units[0],units[1]..������ ǥ�� �ؾ� �ϱ� ������ ���� ���� ������ ���ľ���
		int k37_iNumVal = 1300000000;
//		int k37_iNumVal = 2101034567;
		
		String k37_sNumVal = String.valueOf(k37_iNumVal); // ������ ���� iNumVal�� ���ڿ��� ��ȯ�Ͽ� sNumVal�� �Ҵ�
		String k37_sNumVoice = ""; // �� ���ڿ� ����
		
		
		System.out.printf("==> %s [%d�ڸ�]\n",k37_sNumVal,k37_sNumVal.length()); // sNumVal�� sNumVal�� �ڸ��� ���
		int k37_i,k37_j;
		
		String[] k37_units = {"��","��","��","��","��","��","��","ĥ","��","��"}; // string ���ڿ� �迭 ����
		String[] unitX = {"","��","��","õ","��","��","��","õ","��","��"}; // string ���� �迭 ����
		k37_i = 0; // ���� �ʱ�ȭ ������
		k37_j = k37_sNumVal.length()-1; //j�� sNumVal ���ڿ��� ���̿��� 1�� �� ������ �ʱ�ȭ===> ó�� �ε����� 0���� �����ϱ� ������==>9
		
		while(true) {
			if(k37_i>=k37_sNumVal.length()) //11�ڸ� �̻��̶�� �ݺ��� ����
				break;
			/// sNumVal ���ڿ����� i+1��° ���� �ϳ��� �����Ͽ� units �迭���� �ش��ϴ� �ѱ� �ܾ ������ ���
			System.out.printf("%s[%s]",
					k37_sNumVal.substring(k37_i,k37_i+1), // substring ==>���ڿ� �ڸ���==>���ڸ� �ϳ��� ������
					k37_units[Integer.parseInt(k37_sNumVal.substring(k37_i,k37_i+1))]); //parseInt()�� ����� StringŸ���� ���ڸ� intŸ������ ��ȯ
			
			// sNumVal ���ڿ����� i+1��° ���� �ϳ��� �����Ͽ� �װ� 0�̸� ���ǹ� ����
			if (k37_sNumVal.substring(k37_i, k37_i + 1).equals("0")) {
			    if (unitX[k37_j].equals("��") || unitX[k37_j].equals("��")) {
			        if(unitX[k37_j].equals("��")) {
			        	if (!k37_sNumVal.substring(2, 6).equals("0000")) { // "��" �ڸ��� "0000"�� �ƴϸ� "��"�� ���
			        		k37_sNumVoice = k37_sNumVoice + "" + unitX[k37_j];
			        	
			        }
			        	else {
			        		//����
			        	}
			        if(unitX[k37_j].equals("��")) {
			        	
			        	k37_sNumVoice = k37_sNumVoice + "" + unitX[k37_j];
			        }
			        	
			        
			        }
			        
			    }
			    else {
			        // ����
			    }
			} else {
			    k37_sNumVoice = k37_sNumVoice + k37_units[Integer.parseInt(k37_sNumVal.substring(k37_i, k37_i + 1))] + unitX[k37_j];
			}
			k37_i++;
			k37_j--;
		}
		System.out.printf("\n %s[]%s\n",k37_sNumVal,k37_sNumVoice);
		
	}

}
