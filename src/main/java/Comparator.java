import ConectionWithAPI.REST_NBP;

import java.io.IOException;

class Comparator {

    void compareToMonthAgo(REST_NBP rest_nbp, int value) throws IOException {

        double[] arrayNow = REST_NBP.getAskBidRequest(rest_nbp.getCurrencyNow());
        double[] arrayMouthAgo = REST_NBP.getAskBidRequest(rest_nbp.getCurrencyPast());
        double changeTo = (value / arrayMouthAgo[1]);
        double changeFrom = changeTo * arrayNow[0];
        double result = changeFrom - value;
        if (result > 0) {
            System.out.println("If you changed " + rest_nbp.name() + " to PLN a month ago, you would earn " + result + " PLN");
        } else {
            System.out.println("If you changed " + rest_nbp.name() + " to PLN a month ago, you would lost " + result + " PLN");
        }
    }

}
