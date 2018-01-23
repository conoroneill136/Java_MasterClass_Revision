package OOP_Part_1.Classes_Part_1.Constructors_P1;

public class VipCustomer {

    private String name,email;
    private double creditLimit;

    //Con1
    public VipCustomer () {
        this("Default Name", "Default Email", 75d);
    }

    //Con2
    public VipCustomer(String name, String email){
        this(name,email,50000);
    }

    //Con3
    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String print(){
        return "NAME: " + name + " EMAIL: " + email  +
                " CREDIT LIMIT: " + creditLimit;
    }
}

