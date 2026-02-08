package accounts;

import java.util.UUID;

public class GalacticCheckingAccount extends GalacticBankAccount {
    // Fields
    private double overDraftLimit;

    // Constructors
    public GalacticCheckingAccount(UUID accountId, int accountNumber, String accountHolder, double balence, double interestRate,double overDraftLimit){
        super(accountId, accountNumber, accountHolder, balence, interestRate);
        this.overDraftLimit = overDraftLimit;
    }

    // Methods
    public double getOverDraftLimit(){
        return this.overDraftLimit;
    }

    @Override
    public String toString(){
        return super.toString() + ",\n Account Type: Checking" + ",\n Overdraft Limit: " + overDraftLimit;
    }
}
