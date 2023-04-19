package everland_project;

public class OrderList {
	
	private String jugan_yagan; // 주간권
	private String age_type2;  // 대인소인
	private int count_b;  // 티켓 갯수
	private int count_c; // 가격
	private String udae; // 우대사항
	
	public OrderList(String jugan_yagan,String age_type2,int count_b,
			int count_c,String udae) {
		
		this.jugan_yagan = jugan_yagan;
		this.age_type2 = age_type2;
		this.count_b = count_b;
		this.count_c = count_c;
		this.udae = udae;
		
		
	}
	
	public String get_jugan_yagan() {
		
		return jugan_yagan;
	}
	
	public String get_age_type2() {
		
		return age_type2;
	}
	public int get_count_b() {
		return count_b;
	}
	public int get_count_c() {
		return count_c;
	}
	public String get_udae() {
		return udae;
	}
	
	

}
