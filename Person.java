/*
  Collin Hurley
  Person class creation for ease of operations and nice design of code
  CS101
*/
public class Person
{
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
/*
Algorithm for int compareByName(Person other)
return name.compareTo(other.name)
*/
/*
	Data Table for int compareByName	
Variable or Constant	Type	Purpose
name	String	name of person to compare alphabetically to another
other	Person	the inputted person to compare
*/
    public int compareByName(Person other) {
        return name.compareTo(other.name);
    }
/*
Algorithim for int compareBySalary(Person other)
return 0
*/
/*
	Data Table for int compareBySalary	
Variable or Constant	Type	Purpose
other	Person	The person to compare with the current one
*/
    public int compareBySalary(Person other) {
        return 0;
    }
/*
Algorithm for int compareByAddress
return address.compareTo(other.address)
*/
/*
	Data Table for int compareByAddress	
Variable or Constant	Type	Purpose
Address	String	Address of person to compare alphabetically to another
other	Person	The person to compare with the current one
*/
    public int compareByAddress(Person other) {
        return address.compareTo(other.address);
    }
/*

Algorithm for int compareByHireDate(Person other)
return 0
*/
/*
	Data Table for int compareByHireDate	
Variable or Constant	Type	Purpose
Other	Person	The other person to compare with
*/
    public int compareByHireDate(Person other) {
        return 0;
    }
}
