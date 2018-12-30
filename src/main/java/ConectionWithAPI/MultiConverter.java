package ConectionWithAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiConverter {

    private REST_USD rest_usd = new REST_USD();
    private REST_EUR rest_eur = new REST_EUR();
    private REST_GPB rest_gpb = new REST_GPB();
    private REST_CHF rest_chf = new REST_CHF();

    public MultiConverter(List<REST_NBP> listOfCurrency) {
        listOfCurrency.add(rest_usd);
        listOfCurrency.add(rest_eur);
        listOfCurrency.add(rest_gpb);
        listOfCurrency.add(rest_chf);
    }

    public static void main(String[] args) throws IOException {

        List list = new ArrayList();
        MultiConverter multiConverter = new MultiConverter(list);
        Count count = new Count();


        System.out.println("100 zl is worth " + count.countCurrency(multiConverter.rest_chf) + " CHF");
    }


}
