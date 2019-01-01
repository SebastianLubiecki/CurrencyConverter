package ConectionWithAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiConverter {
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
        Count count = new Count();
        //System.out.println("Value of " + multiConverter.rest_chf.toString() + " in PLN");

        System.out.println("100 PLN is worth " + count.countCurrency(multiConverter.rest_chf) + " CHF");
        System.out.println("100 PLN is worth " + count.countCurrency(multiConverter.rest_eur) + " EUR");
        System.out.println("100 PLN is worth " + count.countCurrency(multiConverter.rest_gpb) + " GBP");
        System.out.println("100 PLN is worth " + count.countCurrency(multiConverter.rest_usd) + " USD");

    }


}
