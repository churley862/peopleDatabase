/*
  Collin Hurley
  faculty class used to define what a faculty member is 
  CS101
*/
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
/*

*/
/*
	Data table for String toString	
Variable or Constant	Type	Purpose
name	String	Store the value of the Faculty name
address	String	Store the value of the Faculty Address
phoneNumber	String	Store the value of the Faculty Phone Number
emailAddress	String	Store the value of the Faculty Email Address
office	String	Store the value of the Faculty office location
salary	double	Store the value of the Faculty salary
hireDate	Date	Store the value of the Facultys hire date
title	String	Store the value of the Faculty title
officeHours	String 	Stored value of the office hours a faculty has
*/
    public String toString() {
        return String.format(
                   "Faculty\n" +
                   "\tname: %s\n" +
                   "\taddress: %s\n" +
                   "\tphone number: %s\n" +
                   "\te-mail address: %s\n" +
                   "\toffice: %s\n" +
                   "\tsalary: $%.02f\n" +
                   "\thiring date: %s\n" +
                   "\ttitle: %s\n" +
                   "\toffice hourse: %s\n",
                   name, address, phoneNumber, emailAddress, office, salary,
                   hireDate.toString(), title, officeHours);
    }
/*

*/
/*
	Data Table for Faculty parse()	
Variable or Constant	Type	Purpose
name	String	Store the value of the Faculty name
address	String	Store the value of the Faculty Address
phoneNumber	String	Store the value of the Faculty Phone Number
emailAddress	String	Store the value of the Faculty Email Address
office	String	Store the value of the Faculty office location
salary	double	Store the value of the Faculty salary
hireDate	Date	Store the value of the Facultys hire date
title	String	Store the value of the Faculty title
officeHours	String 	Stored value of the office hours a faculty has
*/
    public static Faculty parse(String[] input) {
        String name = input[1];
        String address = input[2];
        String phoneNumber = input[3];
        String emailAddress = input[4];
        String office = input[5];
        String title = input[8];
        double salary = Double.parseDouble(input[6]);
        Date hireDate = new Date(input[7]);
        String officeHours = input[9];

        return new Faculty(name, address, phoneNumber, emailAddress, office,
                           title, salary, hireDate, officeHours);
    }

}
