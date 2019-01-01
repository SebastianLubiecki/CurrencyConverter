package ConectionWithAPI;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class REST_EUR implements REST_NBP {

    @Override
    public Currency getCurrency() throws IOException {
        Gson gson = new Gson();
        Currency currency = gson.fromJson(String.valueOf(REST_NBP.jsonObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/")), Currency.class);
        //System.out.println(currency);
        return currency;
    }


    //probably useless
    private void ratesConverter(ArrayList<Object> rates) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(String.valueOf(rates.get(0)).replace("[", "").replace("]", "").split(",")));
        System.out.println("Size is " + arrayList.size());
    }

    @Override
    public String toString() {
        try {
            return "REST_EUR: " + getCurrency().getRates();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}