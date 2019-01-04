import ConectionWithAPI.RestNBP;

import java.io.IOException;

class Comparator {

    double compareToMonthAgo(RestNBP rest_nbp, int value) throws IOException {

        double[] arrayNow = RestNBP.getAskBidRequest(rest_nbp.getCurrencyNow());
        double[] arrayMouthAgo = RestNBP.getAskBidRequest(rest_nbp.getCurrencyPast());
        double changeTo = (value / arrayMouthAgo[1]);
        double changeFrom = changeTo * arrayNow[0];

        double result = changeFrom - value;
        if (result > 0) {
            System.out.println("If you changed " + rest_nbp.name() + " to " + value +
                    " PLN a month ago, you would earn " + result + " PLN");
        } else {
            System.out.println("If you changed " + rest_nbp.name() + " to " + value +
                    " PLN a month ago, you would lost " + result + " PLN");
        }
        return result;
    }

}
