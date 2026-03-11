
package gtiit.bank_application;

public class Currency {
    private String name;
    private String symbol;

    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String symbol() {
        return this.symbol;
    }
}

