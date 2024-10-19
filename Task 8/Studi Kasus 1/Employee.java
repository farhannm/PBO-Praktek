// Employee

public class Employee extends StaffMember
{
    protected String socialSecuriyNumber;
    protected double payRate;

    public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone);

        socialSecuriyNumber = socSecNumber;
        payRate = rate;
    }

    public String toString()
    {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecuriyNumber;

        return result;
    }

    public double pay()
    {
        return payRate;
    }
}