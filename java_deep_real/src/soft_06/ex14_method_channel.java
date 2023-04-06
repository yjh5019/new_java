package soft_06;

public class ex14_method_channel {
	
	private String help;
    private int limit_up_channel; //  �ְ� ����
    private int limit_dowun_channel; // ���� ����
    int channel = 1; // ���� ä��


    ex14_method_channel(){
        limit_up_channel = 50; // �ְ� ä��
        limit_dowun_channel = 1; // ���� ä��
        channel = 1;
        help = "Ƽ�� ä�� ����";
    }
    ex14_method_channel(int up_channel, int down_channel, int in_channel){
        limit_up_channel = up_channel; // �ְ� ä��
        limit_dowun_channel = down_channel; // ���� ä��
        channel = in_channel;
        help = "Ƽ�� ä�� ������";
    }
    void up(){
        if(channel == limit_up_channel){ // ������ ä���϶� ������ä���Դϴ� ���
            help = "������ ä���Դϴ�";
        }else{
            channel++; // ä�� ���
            help=String.format("[%d] ä���Դϴ�]", channel); // ���� ä�� ���� ���
        }
    }

    void down(){
        if(channel == limit_dowun_channel){
            help = "ó�� ä�� �Դϴ�."; // ó�� ä���� ��� ó�� ä���Դϴ� ��� ������ ���
        }else{
            channel--; // ä�� ����
            help=String.format("[%d] ä���Դϴ�]", channel); // ���� ä�� ���� ���
        }
    }

    void up(int u){
        for(int i=0; i< u; i++){
            this.up(); // �� Ŭ������ up �޼ҵ带 ���� for ������ �޼ҵ� ����
        }
    }
    void down(int u){
        for(int i=0; i< u; i++){
            this.down(); // �� Ŭ������ down �޼ҵ带 ���� for ������ �޼ҵ� ����
        }
    }
    void msg(String id){ // �ִ�ä�� �ּ� ä�� ���� ä�ο� ���� �޼����� �޼ҵ�� ����� ����ϰ��Ѵ�
        System.out.printf("%s =>[%s] �ִ� ä��[%d], �ּ� ä��[%d], ���� ä��[%d]\n",id,help,limit_up_channel,limit_dowun_channel,channel);
    }

}