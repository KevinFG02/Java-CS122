package Week5.transaction;

import Week5.enums.TransactionType;
import java.time.LocalDateTime;
import java.util.UUID;

public class GalacticTransaction {
    // Fields
    private UUID transactionId;
    private int accountId;
    private LocalDateTime timestamp;
    private TransactionType transactionType;
    private double amount;

    // Constructors
    public GalacticTransaction(UUID transactionId, int accountId, LocalDateTime timestamp, TransactionType transactionType, double amount){
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.timestamp = timestamp;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    // Methods
    public UUID getTransactionId(){
        return this.transactionId;
    }

    public int getAccountId(){
        return this.accountId;
    }

    public LocalDateTime getTimestamp(){
        return this.timestamp;
    }

    public TransactionType getTransactionType(){
        return this.transactionType;
    }

    public double getAmount(){
        return this.amount;
    }

    @Override
    public String toString(){
        return "Transaction ID: " + transactionId + ",\n Account ID: " + accountId + ",\n Timestamp: " + timestamp + ",\n Transaction Type: " + transactionType + ",\n Amount: " + amount;
    }
}
