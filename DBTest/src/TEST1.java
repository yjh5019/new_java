import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class TEST1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat k37_sdt = new SimpleDateFormat("HH:mm:ss");
		
		Calendar start = new GregorianCalendar();
        String startTime1 = k37_sdt.format(start.getTime());
        
        
        Calendar end = new GregorianCalendar();
        String endTime1 = k37_sdt.format(end.getTime());
        
        System.out.printf("start time : %s\n",startTime1); // 시작 시간
		System.out.printf("end time : %s\n",endTime1); // 작업 완료시간
	}

}
