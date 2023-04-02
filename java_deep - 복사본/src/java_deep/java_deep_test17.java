package java_deep;

public class java_deep_test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int won = 1000000; // 환전하고자 하는 원화 금액
        double exchange_rate = 1238.21; // 환율
        double commission_rate = 0.3 / 100; // 환전 수수료

        // 원화를 달러로 환전
        double dollar = won / exchange_rate;

        // 수수료 계산
        double commission = dollar * commission_rate;

        // 환전 후 잔돈 계산
        int change = (int) (won - (dollar * exchange_rate) - (commission * exchange_rate));

        // 결과 출력
        System.out.printf("환전 금액: $%.2f\n", dollar);
        System.out.printf("환전 수수료: %,d\n", (int) (commission * exchange_rate));
        System.out.printf("잔돈: %,d", change);

	}

}


