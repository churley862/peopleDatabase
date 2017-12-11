public class Employee extends Person
{
    protected String office;
    protected String title;
    protected double salary;
    protected Date hireDate;

    public Employee(String name, String address, String phoneNumber,
                    String emailAddress, String office, String title, 
                    double salary, Date hireDate) {

        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }
}
