package ConectionWithAPI;

import java.io.IOException;

class Count { //maybe static?
    private static int NUMBER_OF_PLN = 100;

    double countCurrency(REST_NBP rest_nbp) throws IOException {
        String[] valuesArray = String.valueOf(rest_nbp.getCurrency().getRates()).split(",");
        double value = Double.parseDouble(valuesArray[1].replace("mid=", ""));
        double result = NUMBER_OF_PLN / value;
        return result;
    }
}