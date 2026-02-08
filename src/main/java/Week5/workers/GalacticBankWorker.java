package workers;

import java.util.UUID;

public class GalacticBankWorker {
    // Fields
    private UUID workerId;
    private String workerName;

    // Constructor
    public GalacticBankWorker(UUID workerId, String workerName){
        this.workerId = workerId;
        this.workerName = workerName;
    }

    // Methods
    public UUID getWorkerID(){
        return this.workerId;
    }

    public String getWorkerName(){
        return this.workerName;
    }

    @Override
    public String toString(){
        return "WorkerID: " + workerId + ",\n Worker Name: " + workerName;
    }
}