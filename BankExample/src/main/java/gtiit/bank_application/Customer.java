
package gtiit.bank_application;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }    

    public String name() {
        return this.name;
    }
}

