package workers;

import java.util.UUID;

public class GalacticManager extends GalacticBankWorker {
    // Fields
    private String department;

    // Constructors
    public GalacticManager(UUID workerId, String workerName, String department){
        super(workerId, workerName);
        this.department = department;
    }

    //Methods
    public String getDepartment(){
        return this.department;
    }

    @Override
    public String toString(){
        return super.toString() + ",\n Department: " + department + "\n Worker Role: Manager";
    }
}
