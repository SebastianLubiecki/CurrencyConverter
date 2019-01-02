package ConectionWithAPI;

import org.json.JSONObject;

import java.io.IOException;

public interface REST_NBP {


    Currency getMidCurrency() throws IOException;

    Currency getCurrencyNow() throws IOException;

    Currency getCurrencyPast() throws IOException;

    JSONObject jsonObject(String url) throws IOException;

    String name() throws IOException;

    static double countCurrencyByMidCourse(REST_NBP rest_nbp, int numberOfPLN) throws IOException {
        String[] valuesArray = String.valueOf(rest_nbp.getMidCurrency().getRates()).split(",");
        double value = Double.parseDouble(valuesArray[1].replace("mid=", ""));
        double result = numberOfPLN / value;
        return result;
    }

    static double[] getAskBidRequest(Currency currency) throws IOException {
        String[] valuesArray = String.valueOf(currency.getRates()).split(",");
        double valueAsk = Double.parseDouble(valuesArray[1].replace("ask=", ""));
        double valueBid = Double.parseDouble(valuesArray[2].replace("bid=", ""));
        double[] resultArray = {valueAsk, valueBid};
        return resultArray;
    }


}
