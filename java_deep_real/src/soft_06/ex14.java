package soft_06;

public class ex14 {
	
	static ex14_method_channel channel1;
    static ex14_method_volume volume1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		channel1 = new ex14_method_channel();
        volume1 = new ex14_method_volume();

        for(int i=0; i<10; i++){

            channel1.up();
            channel1.msg("1�� tv ä�� 1 �ø���\n");
            System.out.printf("\n");
            volume1.up();
            volume1.msg("1�� tv ���� 1�� �ø���\n");
            System.out.printf("\n");
        }
        for(int i=0; i<10; i++){

            channel1.up(2);
            channel1.msg("1�� tv ä�� 2 �ø���\n");
            System.out.printf("\n");
        }
        for(int i=10; i<20; i++){

            channel1.up(3);
            channel1.msg("1�� tv ä�� 3 �ø���\n");
            System.out.printf("\n");
        }
        for(int i=0; i<10; i++){

            channel1.down(1);
            channel1.msg("1�� tv ä�� 1 ������\n");
            System.out.printf("\n");
        }

        
        

    }

	}

