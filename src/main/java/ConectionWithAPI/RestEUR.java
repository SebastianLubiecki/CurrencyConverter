package ConectionWithAPI;

import com.google.gson.Gson;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.time.LocalDate;


public class RestEUR implements RestNBP {
    @Override
    public Currency getMidCurrency() throws IOException {
        Gson gson = new Gson();
        Currency currency = gson.fromJson(String.valueOf(jsonObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/?format=json")), Currency.class);

        return currency;
    }

    @Override
    public Currency getCurrencyNow() throws IOException {
        Gson gson = new Gson();
        Currency currency = gson.fromJson(String.valueOf(jsonObject("http://api.nbp.pl/api/exchangerates/rates/c/eur/?format=json")), Currency.class);

        return currency;
    }

    @Override
    public Currency getCurrencyPast() throws IOException {
        Gson gson = new Gson();
        LocalDate dateMouthAgo = LocalDate.now();
        dateMouthAgo = dateMouthAgo.minusMonths(1);

        if (String.valueOf(dateMouthAgo.getDayOfWeek()).equals("SUNDAY")) {
            dateMouthAgo = dateMouthAgo.minusDays(2);
        }
        if (String.valueOf(dateMouthAgo.getDayOfWeek()).equals("SATURDAY")) {
            dateMouthAgo = dateMouthAgo.minusDays(1);
        }
        String date = String.valueOf(dateMouthAgo);
        String url = "http://api.nbp.pl/api/exchangerates/rates/c/eur/" + date + "/";
        Currency currency = gson.fromJson(String.valueOf(jsonObject(url)), Currency.class);
        return currency;
    }


    public JSONObject jsonObject(String url) throws IOException {
        try (InputStream inputStream = new URL(url).openStream()) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String jsonText = bufferedReader.readLine();
            return new JSONObject(jsonText);
        }
    }

    @Override
    public String name() throws IOException {
        RestEUR rest_eur = new RestEUR();

        return rest_eur.getMidCurrency().getCode();
    }


}
