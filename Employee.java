/*
  Collin Hurley
  Employee class creation for ease of operations
  CS101
*/
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
        this.title = title;
    }
/*
Algorithm for int compareBySalary(Person other)
if (other instanceof Employee)
   double otherSalary <- ((Employee) other).salary
   if (salary < otherSalary) 
      return -1
   if (salary > otherSalary) 
      return 1
   return 0
return super.compareBySalary(other)
*/
/*
	Data table for compareBySalary(other)	
Variable or Constant	Type	Purpose
other	Person	The person to compare with the current one
salary	double	the salary an employee is paid
other.salary	double	the salary of another employee to compare with
*/
    public int compareBySalary(Person other) {
        if (other instanceof Employee) {
            double otherSalary = ((Employee) other).salary;
            if (salary < otherSalary) return -1;
            if (salary > otherSalary) return 1;
            return 0;
        }

        return super.compareBySalary(other);
    }
/*
Algorithm for int compareByHireDate(Person other)
if (other instanceof Employee)
   return hireDate.compareTo(((Employee)other).hireDate)
return super.compareByHireDate(other)
*/
/*
	Data table for compareByHireDate	
Variable or Constant	Type	Purpose
other	Person	The person to compare with the current one
hireDate	Date	the date at which an employee started working there
other.hireDate	Date	the date at which the employee being compared to started working there
*/
    public int compareByHireDate(Person other) {
        if (other instanceof Employee) {
            return hireDate.compareTo(((Employee)other).hireDate);
        }

        return super.compareByHireDate(other);
    }

}

