package soft_06;

public class ex14_method_volume {
	
	private String help;
    private int limit_up_volume; //  �ְ� ����
    private int limit_dowun_volume; // ���� ����
    int volume = 1; // ���� ä��


    ex14_method_volume(){
        limit_up_volume = 20; // �ְ� ä��
        limit_dowun_volume = 1; // ���� ä��
        volume = 1;
        help = "Ƽ�� ���� ����";
    }
    ex14_method_volume(int up_volume, int down_volume, int in_volume){
        limit_up_volume = up_volume; // �ְ� ä��
        limit_dowun_volume = down_volume; // ���� ä��
        volume = in_volume;
        help = "Ƽ�� ä�� ������";
    }
    void up(){
        if(volume == limit_up_volume){
            help = "������ �����Դϴ�";
        }else{
            volume++;
            help=String.format("[%d] �����Դϴ�]", volume);
        }
    }

    void down(){
        if(volume == limit_dowun_volume){
            help = "ó�� ä�� �Դϴ�.";
        }else{
            volume--;
            help=String.format("[%d] �����Դϴ�]", volume);
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
        System.out.printf("%s =>[%s] �ִ� ����[%d], �ּ� ����[%d], ���� ����[%d]\n",id,help,limit_up_volume,limit_dowun_volume,volume);
    }

}
