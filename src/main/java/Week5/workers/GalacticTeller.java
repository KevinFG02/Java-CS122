package Week5.workers;

import java.util.UUID;

public class GalacticTeller extends GalacticBankWorker{
    // Fields
    private int numberOfTransactions;

    // Constructors
    public GalacticTeller(UUID workerId, String workerName, int numberOfTransactions){
        super(workerId, workerName);
        this.numberOfTransactions = numberOfTransactions;
    }

    // Methods
    public int getNumberOfTransactions(){
        return this.numberOfTransactions;
    }

    @Override
    public String toString(){
        return super.toString() + ",\n Number of Transactions: " + numberOfTransactions + "\n Worker Role: Teller";
    }
}

