package soft_06;

public class TvRemocon {
	
	
	int limit_up_volume = 5; //  �ְ� ����
    int limit_down_volume = 0; // ���� ����
    int volume = 1; // ���� ����
    String help;
    int limit_up_channel = 10; //  �ְ� ����
    int limit_dowun_channel = 0; // ���� ����
    int channel = 1; // ���� ä��

    public void volume_up(){
        if(volume == limit_up_volume){
            help = "������ �����Դϴ�.";
            
        }else{
            help = String.format("%d�����Դϴ�.", volume);
            volume++;
        }
    }
    public void volume_down(){
        if(volume == limit_down_volume){
            help = "ó�� �����Դϴ�.";
        }else{
            help = String.format("%d�����Դϴ�.", volume);
            volume--;
        }
    }
    public void channelUp(){
        if(channel == limit_up_channel){
            help = "������ ä���Դϴ�.";
        }else{
            help = String.format("%dä���Դϴ�.", channel);
            channel++;
        }
    }
    public void channelDn(){
        if(channel == limit_dowun_channel){
            help = "ó�� ä���Դϴ�.";
        }else{
            help = String.format("%dä���Դϴ�.", channel);
            channel--;
        }
    }

}
