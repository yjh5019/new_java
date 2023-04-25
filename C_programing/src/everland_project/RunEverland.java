package everland_project;
import java.util.*;
public  class RunEverland {
	private Calcul calculator = null;
	private ConstValueClass2 constvalue = null;
	private InputClass2 inputClass = null;
	private OutputClass2 outputClass = null;
	private int day_night_type,how_many_ticket,prior_type,keep_ticket,age,use_fee,total_price,price = 0,count=0;
	private long jumin;
	private double discount_rate;
	private String jugan_yagan,age_type2,udae;
	private int count_b,count_c;
	
	
	public RunEverland() {
		calculator = new Calcul();
		outputClass = new OutputClass2();
		inputClass = new InputClass2();
		constvalue = new ConstValueClass2();
		
	}
	public void Input() {
    	count++;
    	day_night_type = inputClass.getDayNightType(); // 주간 야간 입력
    	jugan_yagan = inputClass.jugan_yagan(day_night_type);
    	age = inputClass.juminInput();
    	age_type2 = calculator.age_type(age);
    	how_many_ticket = inputClass.howManyTicket();
    	count_b = how_many_ticket;
    	prior_type = inputClass.udae_printf();
    	udae = calculator.setPriorType(prior_type);
    	use_fee =  calculator.how_much_ticket(age,day_night_type);
    	discount_rate = calculator.discount_fee(prior_type);
    	
    	
    	
    	}
	public void calculate() {
		price = calculator.cal_each_ticket(use_fee,discount_rate,how_many_ticket);
    	count_c = price;
    	total_price += price;
	}
	
	public void output() {
    	outputClass.print_price(price);
    	
    }
	

}
