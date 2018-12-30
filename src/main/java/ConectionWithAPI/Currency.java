package ConectionWithAPI;

import java.util.ArrayList;

class Currency {
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


// Getter Methods

    public String getTable() {
        return table;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    ArrayList getRates() {
        return rates;
    }

    // Setter Methods

    public void setTable(String table) {
        this.table = table;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCode(String code) {
        this.code = code;
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