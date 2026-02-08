package Week5.accounts;

import java.util.UUID;

public class GalacticSavingsAccount extends GalacticBankAccount{
    // Fields

    // Constructors
    public GalacticSavingsAccount(UUID accountId, int accountNumber, String accountHolder, double balence, double interestRate){
        super(accountId, accountNumber, accountHolder, balence, interestRate);
    }

    // Methods
    @Override
    public String toString(){
        return super.toString() + ",\n Account Type: Saving";
    }
}
