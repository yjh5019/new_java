package soft_06;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TvRemocon tvremote = new TvRemocon(); // tv������ Ŭ������ ���ο� ��ü�� ����

        for(int i=0; i<10; i++){
            tvremote.channelUp();

            System.out.printf("ä��[%s]\n",tvremote.help);

        }
        for(int i=0; i<11; i++){
            tvremote.channelDn();

            System.out.printf("ä��[%s]\n",tvremote.help);
            
        }
        for(int i=1; i<6; i++){
            tvremote.volume_up();

            System.out.printf("����[%s]\n",tvremote.help);
            
        }
        for(int i=0; i<6; i++){
            tvremote.volume_down();

            System.out.printf("����[%s]\n",tvremote.help);
            //eee
            //dddddd
            
        }

	}

}