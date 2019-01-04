import ConectionWithAPI.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiConverter {

    private static int NUMBER_OF_PLN = 100;

    private RestCHF rest_chf = new RestCHF();
    private RestEUR rest_eur = new RestEUR();
    private RestGPB rest_gpb = new RestGPB();
    private RestUSD rest_usd = new RestUSD();

    private MultiConverter(List<RestNBP> listOfCurrency) {
        listOfCurrency.add(rest_chf);
        listOfCurrency.add(rest_eur);
        listOfCurrency.add(rest_gpb);
        listOfCurrency.add(rest_usd);
    }

    public static void main(String[] args) throws IOException {

        List<RestNBP> list = new ArrayList<>();
        MultiConverter multiConverter = new MultiConverter(list);
        Comparator comparator = new Comparator();

        System.out.println(NUMBER_OF_PLN + " PLN is worth " +
                RestNBP.countCurrencyByMidCourse(multiConverter.rest_chf, MultiConverter.NUMBER_OF_PLN)
                + " CHF");

        System.out.println(NUMBER_OF_PLN + " PLN is worth " +
                RestNBP.countCurrencyByMidCourse(multiConverter.rest_eur, MultiConverter.NUMBER_OF_PLN)
                + " EUR");

        System.out.println(NUMBER_OF_PLN + " PLN is worth " +
                RestNBP.countCurrencyByMidCourse(multiConverter.rest_gpb, MultiConverter.NUMBER_OF_PLN)
                + " GBP");

        System.out.println(NUMBER_OF_PLN + " PLN is worth " +
                RestNBP.countCurrencyByMidCourse(multiConverter.rest_usd, MultiConverter.NUMBER_OF_PLN)
                + " USD");

        System.out.println();

        comparator.compareToMonthAgo(multiConverter.rest_chf, MultiConverter.NUMBER_OF_PLN);
        comparator.compareToMonthAgo(multiConverter.rest_eur, MultiConverter.NUMBER_OF_PLN);
        comparator.compareToMonthAgo(multiConverter.rest_gpb, MultiConverter.NUMBER_OF_PLN);
        comparator.compareToMonthAgo(multiConverter.rest_usd, MultiConverter.NUMBER_OF_PLN);
    }
}
