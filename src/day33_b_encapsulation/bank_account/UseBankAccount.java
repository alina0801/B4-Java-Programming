package day33_b_encapsulation.bank_account;

public class UseBankAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        // Since these instance variables are 'private' cannot reach directly
        //account1.accountNumber = "";
        //account1.routingNumber = "";

        account1.setAccountNumber("1234567");
        System.out.println(  account1.getAccountNumber() );
        account1.setAccountNumber("12345678");
        System.out.println(  account1.getAccountNumber() );


        System.out.println();
        account1.setRoutingNumber("12345");
        System.out.println(  account1.getRoutingNumber() );
        account1.setRoutingNumber("987654321");
        System.out.println( account1.getRoutingNumber() );





    }

}