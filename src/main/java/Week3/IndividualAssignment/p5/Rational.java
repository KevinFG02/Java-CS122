package IndividualAssignmentWeek3.p5;

public class Rational {
    private double numerator;
    private double denominator;

    public Rational (){
        this(1,1);
    }

    public Rational (double numerator, double denominator){
        if (denominator == 0){
            denominator = 1;
            System.out.println("Cannot divide by 0 - " + numerator + "/0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    private double getNumerator(){return this.numerator;}

    private void setNumerator(double num){this.numerator = num;}

    private double getDenominator(){return this.denominator;}

    private void setDenominator(double den){this.denominator = den;}

    @Override
    public String toString(){
        return numerator + "/" + denominator + " ";
    }
}
