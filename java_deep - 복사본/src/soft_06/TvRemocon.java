package soft_06;

public class TvRemocon {
	
	
	int limit_up_volume = 5; //  최고 볼륨
    int limit_down_volume = 0; // 최저 볼륨
    int volume = 1; // 현재 볼륨
    String help;
    int limit_up_channel = 10; //  최고 볼륨
    int limit_dowun_channel = 0; // 최저 볼륨
    int channel = 1; // 현재 채널

    public void volume_up(){
        if(volume == limit_up_volume){
            help = "마지막 볼륨입니다.";
            
        }else{
            help = String.format("%d볼륨입니다.", volume);
            volume++;
        }
    }
    public void volume_down(){
        if(volume == limit_down_volume){
            help = "처음 볼륨입니다.";
        }else{
            help = String.format("%d볼륨입니다.", volume);
            volume--;
        }
    }
    public void channelUp(){
        if(channel == limit_up_channel){
            help = "마지막 채널입니다.";
        }else{
            help = String.format("%d채널입니다.", channel);
            channel++;
        }
    }
    public void channelDn(){
        if(channel == limit_dowun_channel){
            help = "처음 채널입니다.";
        }else{
            help = String.format("%d채널입니다.", channel);
            channel--;
        }
    }

}
