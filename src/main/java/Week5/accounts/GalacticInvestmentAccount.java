package accounts;

import java.util.UUID;

public class GalacticInvestmentAccount extends GalacticBankAccount{
    // Fields
    private double investmentReturnRate;

    // Constructors
    public GalacticInvestmentAccount(UUID accountId, int accountNumber, String accountHolder, double balence, double interestRate, double investmentReturnRate){
        super(accountId, accountNumber, accountHolder, balence, interestRate);
        this.investmentReturnRate = investmentReturnRate;
    }

    // Methods
    public double getInvestmentReturnRate(){
        return this.investmentReturnRate;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n Account Type: Investment" + ",\n Investment Return Rate: " + investmentReturnRate;
    }
}
