package soft_06;

public class ex14_method_channel {
	
	private String help;
    private int limit_up_channel; //  최고 볼륨
    private int limit_dowun_channel; // 최저 볼륨
    int channel = 1; // 현재 채널


    ex14_method_channel(){
        limit_up_channel = 50; // 최고 채널
        limit_dowun_channel = 1; // 최저 채널
        channel = 1;
        help = "티비 채널 시작";
    }
    ex14_method_channel(int up_channel, int down_channel, int in_channel){
        limit_up_channel = up_channel; // 최고 채널
        limit_dowun_channel = down_channel; // 최저 채널
        channel = in_channel;
        help = "티비 채널 누르기";
    }
    void up(){
        if(channel == limit_up_channel){ // 마지말 채널일때 마지막채널입니다 출력
            help = "마지막 채널입니다";
        }else{
            channel++; // 채널 상승
            help=String.format("[%d] 채널입니다]", channel); // 현재 채널 정보 출력
        }
    }

    void down(){
        if(channel == limit_dowun_channel){
            help = "처음 채널 입니다."; // 처음 채널일 경우 처음 채널입니다 라는 문구를 출력
        }else{
            channel--; // 채널 감소
            help=String.format("[%d] 채널입니다]", channel); // 현재 채널 정보 출력
        }
    }

    void up(int u){
        for(int i=0; i< u; i++){
            this.up(); // 이 클래스의 up 메소드를 통해 for 문통해 메소드 동작
        }
    }
    void down(int u){
        for(int i=0; i< u; i++){
            this.down(); // 이 클래스의 down 메소드를 통해 for 문통해 메소드 동작
        }
    }
    void msg(String id){ // 최대채널 최소 채널 현재 채널에 대한 메세지를 메소드로 만들어 출력하게한다
        System.out.printf("%s =>[%s] 최대 채널[%d], 최소 채널[%d], 현재 채널[%d]\n",id,help,limit_up_channel,limit_dowun_channel,channel);
    }

}
