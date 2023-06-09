package soft_06;

public class ex14_method_volume {
	
	private String help;
    private int limit_up_volume; //  최고 볼륨
    private int limit_dowun_volume; // 최저 볼륨
    int volume = 1; // 현재 채널


    ex14_method_volume(){
        limit_up_volume = 20; // 최고 채널
        limit_dowun_volume = 1; // 최저 채널
        volume = 1;
        help = "티비 볼륨 시작";
    }
    ex14_method_volume(int up_volume, int down_volume, int in_volume){
        limit_up_volume = up_volume; // 최고 채널
        limit_dowun_volume = down_volume; // 최저 채널
        volume = in_volume;
        help = "티비 채널 누르기";
    }
    void up(){
        if(volume == limit_up_volume){
            help = "마지막 볼륨입니다";
        }else{
            volume++;
            help=String.format("[%d] 볼륨입니다]", volume);
        }
    }

    void down(){
        if(volume == limit_dowun_volume){
            help = "처음 채널 입니다.";
        }else{
            volume--;
            help=String.format("[%d] 볼륨입니다]", volume);
        }
    }
    void up(int u){
        for(int i=0; i< u; i++){
            this.up();
        }
    }
    void down(int u){
        for(int i=0; i< u; i++){
            this.down();
        }
    }
    void msg(String id){
        System.out.printf("%s =>[%s] 최대 볼륨[%d], 최소 볼륨[%d], 현재 볼륨[%d]\n",id,help,limit_up_volume,limit_dowun_volume,volume);
    }

}
