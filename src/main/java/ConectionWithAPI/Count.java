package ConectionWithAPI;

import java.io.IOException;

public class Count { //maybe static?

    public double countCurrency(REST_NBP rest_nbp) throws IOException {
        String[] valuesArray = String.valueOf(rest_nbp.getCurrency().getRates()).split(",");
        double value = Double.parseDouble(valuesArray[1].replace("mid=", ""));
        return 100 / value;
    }
}