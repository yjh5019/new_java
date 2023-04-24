package everland_project;

import java.util.*;

public class everlandMain4 {
    private int day_night_type, how_many_ticket, prior_type, age, use_fee, total_price, price = 0, count = 0;
    private long jumin;
    private double discount_rate;
    private String jugan_yagan, age_type2, udae;
    private int count_b, count_c;
    private final InputClass2 inputClass = new InputClass2();
    private final Calcul calculator = new Calcul();
    private final OutputClass2 outputClass = new OutputClass2();
    private final List<OrderList> data = new ArrayList<>();
    private OrderList orderList = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int keep_ticket;
        everlandMain4 everland4 = new everlandMain4();
        Locale currentLocale = Locale.getDefault();
        System.out.println("locale : " + currentLocale.getCountry());
        ConstValueClass2.startLanguage(currentLocale.getCountry());

        while (true) {
            everland4.input();
            everland4.calculate();
            everland4.output();
            keep_ticket = scanner.nextInt();
            everland4.saveData();
            if (keep_ticket == 2) {
                break;
            }
        }

        everland4.last_order();
    }

    private void saveData() {
        orderList = new OrderList(jugan_yagan, age_type2, count_b, count_c, udae);
        data.add(orderList);
    }

    private void input() {
        count++;
        day_night_type = inputClass.getDayNightType();
        jugan_yagan = inputClass.jugan_yagan(day_night_type);
        age = inputClass.juminInput();
        how_many_ticket = inputClass.howManyTicket();
        count_b = how_many_ticket;
        prior_type = inputClass.udae_printf();
        udae = calculator.setPriorType(prior_type);
        use_fee = calculator.how_much_ticket(age, day_night_type);
        discount_rate = calculator.discount_fee(prior_type);
    }

    private void calculate() {
        age_type2 = calculator.age_type(age);
        price = calculator.cal_each_ticket(use_fee, discount_rate, how_many_ticket);
        count_c = price;
        total_price += price;
    }

    private void last_order() {
        System.out.println(ConstValueClass2.PRINT_EVERLAND);
        for (OrderList order : data) {
            jugan_yagan = order.get_jugan_yagan();
            age_type2 = order.get_age_type2();
            count_b = order.get_count_b();
            count_c = order.get_count_c();
            udae = order.get_udae();

            System.out.print(jugan_yagan + "\t");
            System.out.print(age_type2 + "\t");
            System.out.print(count_b + "\t");
            System.out.print(count_c);
            System.out.print(ConstValueClass2.WON + "\t");
            System.out.print(udae + "\n");
        }

        System.out.print(ConstValueClass2.PRINT_TOTAL_PRICE + " ");
        System.out.println(total_price + ConstValueClass2.WON);
        System.out.println("=================================================================================================");
    }

    private void output() {
        outputClass.print_price(price);
    }
}
