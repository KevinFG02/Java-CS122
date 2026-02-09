package IndividualAssignmentWeek3.p4;

public class Contact {
    private String fullName;
    private int addrNumber;
    private String addrStreet;
    private String addrCity;
    private String addrState;
    private int addrZip;

    public Contact(String fullName, int addrNumber, String addrStreet, String addrCity, String addrState, int addrZip) {
        this.fullName = fullName;
        this.addrNumber = addrNumber;
        this.addrStreet = addrStreet;
        this.addrCity = addrCity;
        this.addrState = addrState;
        this.addrZip = addrZip;
    }

    private String getFullName(){return this.fullName;}

    private void setFullName(String fullName){this.fullName = fullName;}

    private int getAddrNumber(){return this.addrNumber;}

    private void setAddrNumber(int addrNumber){this.addrNumber = addrNumber;}

    private String getAddrStreet(){return this.addrStreet;}

    private void setAddrStreet(String addrStreet){this.addrStreet = addrStreet;}

    private String getAddrCity(){return this.addrCity;}

    private void setAddrCity(String addrCity){this.addrCity = addrCity;}

    private String getAddrState(){return this.addrState;}

    private void setAddrState(String addrState){this.addrState = addrState;}

    private int getAddrZip(){return this.addrZip;}

    private void setAddrZip(int addrZip){this.addrZip = addrZip;}

    public String updateAddress(int addrNumber, String addrStreet, String addrCity, String addrState, int addrZip){
        this.addrNumber = addrNumber;
        this.addrStreet= addrStreet;
        this.addrCity = addrCity;
        this.addrState = addrState;
        this.addrZip = addrZip;

        String updatedAddress = addrNumber + " " + addrStreet + " " + addrCity + ", " + addrState + " " + addrZip;
        return updatedAddress;
    }

    @Override
    public String toString(){
        return "Contact - " + fullName + ", " + addrNumber + " " + addrStreet + " " + addrCity + ", " + addrState + " " + addrZip;
    }
}
