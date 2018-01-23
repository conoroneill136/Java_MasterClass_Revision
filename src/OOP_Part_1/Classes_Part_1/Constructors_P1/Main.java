package OOP_Part_1.Classes_Part_1.Constructors_P1;

import java.lang.ref.SoftReference;

public class Main {
    public static void main(String[] args) {
        //Testing Bank Account
//        BankAccount Tom = new BankAccount();
//        Tom.setAccountNumber("1323124saf3");
//        System.out.println(Tom.getAccountNumber());
//        Tom.setCustomerName("Tom Thomas");
//        System.out.println(Tom.getCustomerName());
//        Tom.setEmail("Tom@email.com");
//        System.out.println(Tom.getEmail());
//        Tom.setPhoneNumber("0877744844");
//        System.out.println(Tom.getPhoneNumber());
//        Tom.getBalance();
//        Tom.setBalance(50d);
//        Tom.depositFunds(25);
//        Tom.withdrawFunds(60d);
//        Tom.getBalance();
//        Tom.withdrawFunds(20d);

        //Testing VipCustomer challenge


        VipCustomer James = new VipCustomer();
        System.out.println(James.print());
        VipCustomer Jack = new VipCustomer("Test","Test");
        System.out.println(Jack.print());
        VipCustomer Jo = new VipCustomer("Jo","Jo@email.com",1000);
        System.out.println(Jo.print());
    }
}
