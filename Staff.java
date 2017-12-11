/*
  Collin Hurley
  Staff class used to define what a staff member is 
  CS101
*/

public class Staff extends Employee
{
    protected String supervisorName;

    public Staff(String name, String address, String phoneNumber,
                 String emailAddress, String office, String title,
                 double salary, Date hireDate, String supervisorName) {
        super(name, address, phoneNumber, emailAddress, office, title,
              salary, hireDate);
        this.supervisorName = supervisorName;
    }
/*
Algorithm for toString()
return String.format(
"Staff\n" +
"\tname: %s\n" +
"\taddress: %s\n" +
"\tphone number: %s\n" +
"\te-mail address: %s\n" +
"\toffice: %s\n" +
"\tsalary: $%.02f\n" +
"\thiring date: %s\n" +
"\ttitle: %s\n" +
"\tsupervisor: %s\n",
name, address, phoneNumber, emailAddress, office, salary,
hireDate.toString(), title, supervisorName)
*/
/*
	Data Table for String toString()	
Variable or Constant	Type	Purpose
name	String	Store the value of the Staff name
address	String	Store the value of the Staff Address
phoneNumber	String	Store the value of the Staff Phone Number
emailAddress	String	Store the value of the Staff Email Address
office	String	Store the value of the Staff office location
salary	double	Store the value of the Staff salary
hireDate	Date	Store the value of the Staffs hire date
title	String	Store the value of the Staff title
supervisorName	String	Store the value of the Staff supervisor name
*/
    public String toString() {
        return String.format(
                   "Staff\n" +
                   "\tname: %s\n" +
                   "\taddress: %s\n" +
                   "\tphone number: %s\n" +
                   "\te-mail address: %s\n" +
                   "\toffice: %s\n" +
                   "\tsalary: $%.02f\n" +
                   "\thiring date: %s\n" +
                   "\ttitle: %s\n" +
                   "\tsupervisor: %s\n",
                   name, address, phoneNumber, emailAddress, office, salary,
                   hireDate.toString(), title, supervisorName);
    }
/*
Algorithm for Staff parse(String [] input)
String name <- input[1]
String address <- input[2]
String title <- input[3]
String phoneNumber <- input[4]
String emailAddress <- input[5]
String office <- input[6]
double salary <- Double.parseDouble(input[7])
Date hireDate <- new Date(input[8])
String supervisorName = input[9]
return new Staff(name, address, phoneNumber, emailAddress, office, title, salary, hireDate, supervisorName)
*/
/*
	Data Table for Staff parse()	
Variable or Constant	Type	Purpose
name	String	Store the value of the Staff name
address	String	Store the value of the Staff Address
phoneNumber	String	Store the value of the Staff Phone Number
emailAddress	String	Store the value of the Staff Email Address
office	String	Store the value of the Staff office location
salary	double	Store the value of the Staff salary
hireDate	Date	Store the value of the Staffs hire date
title	String	Store the value of the Staff title
supervisorName	String	Store the value of the Staff supervisor name
returnValue	Staff	returns the constructor of staff
*/
    public static Staff parse(String[] input) {
        String name = input[1];
        String address = input[2];
        String title = input[3];
        String phoneNumber = input[4];
        String emailAddress = input[5];
        String office = input[6];
        double salary = Double.parseDouble(input[7]);
        Date hireDate = new Date(input[8]);
        String supervisorName = input[9];

        return new Staff(name, address, phoneNumber, emailAddress, office, title, salary, hireDate, supervisorName);
    }

}
