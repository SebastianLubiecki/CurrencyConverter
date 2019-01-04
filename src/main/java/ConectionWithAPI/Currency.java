package ConectionWithAPI;

import java.util.ArrayList;

public class Currency {
    private String table;
    private String currency;
    private String code;
    private ArrayList rates;

    public Currency(String table, String currency, String code, ArrayList<Object> rates) {
        this.table = table;
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public String getCode() {
        return code;
    }

    ArrayList getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "table='" + table + '\'' +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + rates +
                '}';
    }

}