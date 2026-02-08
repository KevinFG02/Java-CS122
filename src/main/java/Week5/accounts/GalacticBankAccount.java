package Week5.accounts;

import java.util.UUID;

public class GalacticBankAccount {
    // Fields
    private UUID accountId;
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;

    //Constructors
    public GalacticBankAccount(UUID accountId, int accountNumber, String accountHolder, double balance, double interestRate){
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Methods
    public UUID getAccountId(){
        return this.accountId;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    @Override
    public String toString(){
        return "Account ID: " + accountId + ",\n Account Number: " + accountNumber + ",\n Account Holder: " + accountHolder + ",\n Balence: " + balance + ",\n Interest Rate: " + interestRate;
    }
}
