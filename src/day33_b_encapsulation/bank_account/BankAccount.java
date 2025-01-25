package day33_b_encapsulation.bank_account;

public class BankAccount {

    // Instance variables
    private String accountNumber;
    private String routingNumber;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

        // when setting the account number it has to be at least 8 and max 12
        if (accountNumber.length() >= 8 && accountNumber.length() <= 12) {
            this.accountNumber = accountNumber;
            System.out.println("Successfully assinged!");
        } else {
            System.out.println("Not correct digit count!");
        }
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {

        if (routingNumber.length() == 9) {
            this.routingNumber = routingNumber;
            System.out.println("Successfully assinged!");
        } else {
            System.out.println("Not correct digit count!");
        }
    }
}
