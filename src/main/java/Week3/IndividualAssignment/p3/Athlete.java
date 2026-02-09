package Week3.IndividualAssignment.p3;

public class Athlete {
    private String firstName;
    private String lastName;
    private String position;
    private String sport;

    public Athlete(String firstName, String lastName, String position, String sport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.sport = sport;
    }

    private String getFirstName(){return this.firstName;}

    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private String getLastName(){return this.lastName;}

    private void setLastName(String lastName){
        this.lastName = lastName;
    }

    private String getPosition(){return this.position;}

    private void setPosition(String position){
        this.position = position;
    }

    private String getSport(){return this.sport;}

    private void setSport(String sport){
        this.sport = sport;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + " (" + sport + " - " + position + ")";
    }
}
