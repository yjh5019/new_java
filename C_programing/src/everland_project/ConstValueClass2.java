package everland_project;

public class ConstValueClass2 {
	
	public static final int BABY_PRICE = 0;
	public static final int ADULT_DAY_PRICE = 56000;
	public static final int ADULT_NIGHT_PRICE = 46000;
	public static final int TEEN_DAY_PRICE = 47000;
	public static final int TEEN_NIGHT_PRICE = 40000;
	public static final int CHILD_DAY_PRICE = 44000;
	public static final int CHILD_NIGHT_PRICE = 37000;
	public static final int OLD_DAY_PRICE = 44000;
	public static final int OLD_NIGHT_PRICE = 37000;
	
	public static final double NO_DISCOUNT_RATE = 1.0,  // 우대사항 없음
    		DISABLE_DISCOUNT_RATE = 0.6, // 장애인
			COUNTRY_DISCOUNT_RATE = 0.5, // 국가유공자
			MULTICHILD_DISCOUNT_RATE = 0.8, // 다자녀
			PREGNANT_DISCOUNT_RATE = 0.85; // 임산부
	
	
	/////////영문 한글 변경
	public static String TICKET_TYPE_QUESTION  ;
//	public static int LANGUAGE = 0; // 0 : kor  1 : eng
	public static String LANGUAGE;
	//주간권 야간권
	public static String TICKET_TYPE_WEEK ;
	public static String TICKET_TYPE_NIGHT ;
	//주민 등록 번호
	public static String PRINT_JUMIN_NUM;
	
	//몇개를 주문하시겠습니까
	public static String HOW_MANY_TICKET;
	// 우대사항을 선택하세요
	public static String SELECT_UDAE;
	public static String SELECT_UDAE_1;
	public static String SELECT_UDAE_2;
	public static String SELECT_UDAE_3;
	public static String SELECT_UDAE_4;
	public static String SELECT_UDAE_5;
	
	//가격은~~입니다 print_price
	public static String PRICE_OUTPUT_1;
	public static String PRICE_OUTPUT_2;
	public static String PRICE_THANKS;
	public static String PRICE_KEEP_TICKET;
	public static String KEEP_GOING;
	public static String STOP;
	public static String PRINT_EVERLAND;
	public static String PRINT_JUGAN;
	public static String PRINT_YAGAN;
	public static String AGE_TYPE_ADULT;
	public static String AGE_TYPE_TEEN;
	public static String AGE_TYPE_CHILD;
	public static String AGE_TYPE_OLD;
	public static String AGE_TYPE_INFANT;
	
	public static String PRINT_UDAE_NONE;
	public static String PRINT_UDAE_Disabled;
	public static String PRINT_UDAE_MenofNationalMerit;
	public static String PRINT_UDAE_MultipleChildren;
	public static String PRINT_UDAE_PregnantWoman;
	public static String WON;
	public static String PRINT_TOTAL_PRICE;
//	public static String
//	public static String
//	public static String
	
	
	public static void startLanguage(String country){
		ConstValueClass2.LANGUAGE = country;
		
		if(LANGUAGE .equals("KR")) {
			TICKET_TYPE_QUESTION = "권종을 선택하세요";
			TICKET_TYPE_WEEK = "1. 주간권";
			TICKET_TYPE_NIGHT = "2. 야간권";
			PRINT_JUMIN_NUM = "주민번호를 입력하세요: ";
			HOW_MANY_TICKET = "몇개를 주문하시겠습니까? (최대 10개)";
			SELECT_UDAE = "우대사항을 선택하세요.";
			SELECT_UDAE_1 = "1. 없음";
			SELECT_UDAE_2 = "2. 장애인";
			SELECT_UDAE_3 = "3. 국가유공자";
			SELECT_UDAE_4 = "4. 다자녀";
			SELECT_UDAE_5 = "5. 임산부";
			PRICE_OUTPUT_1 = "가격은 ";
			PRICE_OUTPUT_2 = "원 입니다.";
			PRICE_THANKS = "감사합니다.";
			PRICE_KEEP_TICKET = "계속 발권 하시겠습니까?";
			KEEP_GOING = "1. 티켓 발권";
			STOP = "2. 종료";
			
			PRINT_EVERLAND = "\"===========================================에버랜드============================================";
			PRINT_JUGAN = "주간권";
			PRINT_YAGAN = "야간권";
			
			AGE_TYPE_ADULT = "대인";
			AGE_TYPE_TEEN = "청소년";
			AGE_TYPE_CHILD = "소인";
			AGE_TYPE_OLD = "경로";
			AGE_TYPE_INFANT = "유아";
			
			PRINT_UDAE_NONE = " * 우대적용 없음";
			PRINT_UDAE_Disabled = " * 장애인 우대적용";
			PRINT_UDAE_MenofNationalMerit = " * 국가유공자 우대적용";
			PRINT_UDAE_MultipleChildren = " * 다자녀 우대적용";
			PRINT_UDAE_PregnantWoman = " * 임산부 우대적용";
			WON = "원";
			PRINT_TOTAL_PRICE = "입장료 총액은";
			
		}else if(LANGUAGE .equals("US")) {
			TICKET_TYPE_QUESTION = "Input ticket type : ";
			TICKET_TYPE_WEEK = "1. week ticket";
			TICKET_TYPE_NIGHT = "2. night ticket";
			PRINT_JUMIN_NUM = "Input Social Security Number";
			HOW_MANY_TICKET = "How many would you like to order? (up to 10)";
			SELECT_UDAE = "Choose your preference.";
			SELECT_UDAE_1 = "1. None";
			SELECT_UDAE_2 = "2. Disabled";
			SELECT_UDAE_3 = "3. Men of National Merit";
			SELECT_UDAE_4 = "4. Multiple children";
			SELECT_UDAE_5 = "5. Pregnant woman";
			PRICE_OUTPUT_1= "The price is ";
			PRICE_OUTPUT_2 = "won.";
			PRICE_THANKS = "Thank you";
			PRICE_KEEP_TICKET = "Would you like to continue ticketing?";
			KEEP_GOING = "1. Ticketing";
			STOP = "2. Shutdown";
			
			PRINT_EVERLAND = "===========================================EVERLAND=============================================";
			PRINT_JUGAN = "week ticket";
			PRINT_YAGAN = "night ticket";
			
			AGE_TYPE_ADULT = "Adult";
			AGE_TYPE_TEEN = "Teen";
			AGE_TYPE_CHILD = "Child";
			AGE_TYPE_OLD = "Old";
			AGE_TYPE_INFANT = "Infant";
			
			PRINT_UDAE_NONE = " * No preferential application";
			PRINT_UDAE_Disabled = " * Preferential application for the disabled";
			PRINT_UDAE_MenofNationalMerit = " * Preferential application to persons of national merit";
			PRINT_UDAE_MultipleChildren = " * Preferential application for multiple children";
			PRINT_UDAE_PregnantWoman = " * Preferential application for pregnant women";
			
			WON = "won";
			PRINT_TOTAL_PRICE = "Total price is";
			
			
		}else if(LANGUAGE .equals("ES")){
			
			TICKET_TYPE_QUESTION = "Seleccione el tipo de boleto";
			TICKET_TYPE_WEEK = "1. Boleto diario";
			TICKET_TYPE_NIGHT = "2. Boleto nocturno";
			PRINT_JUMIN_NUM = "Por favor ingrese su número de identificación:";
			HOW_MANY_TICKET = "¿Cuántos boletos desea ordenar? (Máximo 10)";
			SELECT_UDAE = "Seleccione los descuentos aplicables";
			SELECT_UDAE_1 = "1. Ninguno";
			SELECT_UDAE_2 = "2. Discapacitado";
			SELECT_UDAE_3 = "3. Veteranos";
			SELECT_UDAE_4 = "4. Familias numerosas";
			SELECT_UDAE_5 = "5. Mujeres embarazadas";
			PRICE_OUTPUT_1 = "El precio es ";
			PRICE_OUTPUT_2 = "won.";
			PRICE_THANKS = "Gracias por su visita.";
			PRICE_KEEP_TICKET = "¿Desea seguir emitiendo boletos?";
			KEEP_GOING = "1. Emitir boletos";
			STOP = "2. Salir";

			PRINT_EVERLAND = "===========================================Everland============================================";
			PRINT_JUGAN = "Boleto diario";
			PRINT_YAGAN = "Boleto nocturno";

			AGE_TYPE_ADULT = "Adulto";
			AGE_TYPE_TEEN = "Joven";
			AGE_TYPE_CHILD = "Niño";
			AGE_TYPE_OLD = "Adulto mayor";
			AGE_TYPE_INFANT = "Bebé";

			PRINT_UDAE_NONE = " * Sin descuento aplicable";
			PRINT_UDAE_Disabled = " * Descuento para discapacitados aplicable";
			PRINT_UDAE_MenofNationalMerit = " * Descuento para veteranos aplicable";
			PRINT_UDAE_MultipleChildren = " * Descuento para familias numerosas aplicable";
			PRINT_UDAE_PregnantWoman = " * Descuento para mujeres embarazadas aplicable";
			WON = "won";
			PRINT_TOTAL_PRICE = "El precio total de la entrada es";

			
			
		}
		
		
	}
	//week ticket
	//night ticket

	
	
	
	

}
