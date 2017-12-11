public class Faculty extends Employee
{
    String officeHours;

    public Faculty(String name, String address, String phoneNumber,
                   String emailAddress, String office, String title,
                   double salary, Date hireDate, String officeHours) {

        super(name, address, phoneNumber, emailAddress, office, title,
              salary, hireDate);
        this.officeHours = officeHours;
    }

    public static Faculty parse(String[] input) {
        return new Faculty(
                   input[1],
                   input[2],
                   input[3],
                   input[4],
                   input[5],
                   input[8],
                   Double.parseDouble(input[6]),
                   new Date(input[7]),
                   input[9]
               );
    }

}
