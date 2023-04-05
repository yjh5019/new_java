package soft_06;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TvRemocon tvremote = new TvRemocon(); // tv리모콘 클래스의 새로운 객체를 생성

        for(int i=0; i<10; i++){
            tvremote.channelUp();

            System.out.printf("채널[%s]\n",tvremote.help);

        }
        for(int i=0; i<11; i++){
            tvremote.channelDn();

            System.out.printf("채널[%s]\n",tvremote.help);
            
        }
        for(int i=1; i<6; i++){
            tvremote.volume_up();

            System.out.printf("볼륨[%s]\n",tvremote.help);
            
        }
        for(int i=0; i<6; i++){
            tvremote.volume_down();

            System.out.printf("볼륨[%s]\n",tvremote.help);
            //eee
            //dddddd
            
        }

	}

}
