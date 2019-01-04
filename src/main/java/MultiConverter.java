import ConectionWithAPI.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiConverter {

    private static int NUMBER_OF_PLN = 100;

    private REST_CHF rest_chf = new REST_CHF();
    private REST_EUR rest_eur = new REST_EUR();
    private REST_GPB rest_gpb = new REST_GPB();
    private REST_USD rest_usd = new REST_USD();

    private MultiConverter(List<REST_NBP> listOfCurrency) {
        listOfCurrency.add(rest_chf);
        listOfCurrency.add(rest_eur);
        listOfCurrency.add(rest_gpb);
        listOfCurrency.add(rest_usd);
    }

    public static void main(String[] args) throws IOException {

        List<REST_NBP> list = new ArrayList<>();
        MultiConverter multiConverter = new MultiConverter(list);
        Comparator comparator = new Comparator();

        System.out.println("100 PLN is worth " + REST_NBP.countCurrencyByMidCourse(multiConverter.rest_chf, MultiConverter.NUMBER_OF_PLN) + " CHF");
        System.out.println("100 PLN is worth " + REST_NBP.countCurrencyByMidCourse(multiConverter.rest_eur, MultiConverter.NUMBER_OF_PLN) + " EUR");
        System.out.println("100 PLN is worth " + REST_NBP.countCurrencyByMidCourse(multiConverter.rest_gpb, MultiConverter.NUMBER_OF_PLN) + " GBP");
        System.out.println("100 PLN is worth " + REST_NBP.countCurrencyByMidCourse(multiConverter.rest_usd, MultiConverter.NUMBER_OF_PLN) + " USD");
        System.out.println();

        comparator.compareToMonthAgo(multiConverter.rest_chf, MultiConverter.NUMBER_OF_PLN);
        comparator.compareToMonthAgo(multiConverter.rest_eur, MultiConverter.NUMBER_OF_PLN);
        comparator.compareToMonthAgo(multiConverter.rest_gpb, MultiConverter.NUMBER_OF_PLN);
        comparator.compareToMonthAgo(multiConverter.rest_usd, MultiConverter.NUMBER_OF_PLN);
    }


}
