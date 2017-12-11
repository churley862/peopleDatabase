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

    public int compareBySalary(Person other) {
        if (other instanceof Employee) {
            double otherSalary = ((Employee) other).salary;
            if (salary < otherSalary) return -1;
            if (salary > otherSalary) return 1;
            return 0;
        }

        return super.compareBySalary(other);
    }

    public int compareByHireDate(Person other) {
        if (other instanceof Employee) {
            return hireDate.compareTo(((Employee)other).hireDate);
        }

        return super.compareByHireDate(other);
    }

}

