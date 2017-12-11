/*
  Collin Hurley
  Undergrad student class creation for ease of operations
  CS101
*/

//public class UnderGraduateStudents
  public class UnderGraduateStudents extends Student
{
    public UnderGraduateStudents(String name, String address,
                                 String phoneNumber, String emailAddress,
                                 Date birthDate, char status) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
    }
/* 
Algorithm for String toString()
return String.format("Under Graduate Student\n" +"\tname: %s\n" + "\taddress: %s\n" +"\tphone number: %s\n" + "\te-mail address: %s\n" +"\tbirth date: %s\n" + "\tstatus: %s\n"+ name, address, phoneNumber, emailAddress, birthDate.toString(), statusText());
 */
    
 /* 
 	Data Table for String toString()	
Variable or Constant	Type	Purpose
name	String	Store the value of the UnderGraduateStudent name
address	String	Store the value of the UnderGraduateStudent Address
phoneNumber	String	Store the value of the UnderGraduateStudent Phone Number
emailAddress	String	Store the value of the UnderGraduateStudent Email Address
birthDate	Date	Store the value of the UnderGraduateStudent birth date
status	char	Store the value of the UnderGraduateStudent status
  */

    public String toString() {
        return String.format(
                   "Under Graduate Student\n" +
                   "\tname: %s\n" +
                   "\taddress: %s\n" +
                   "\tphone number: %s\n" +
                   "\te-mail address: %s\n" +
                   "\tbirth date: %s\n" +
                   "\tstatus: %s\n",
                   name, address, phoneNumber, emailAddress,
                   birthDate.toString(), statusText());
    }

/* 
Algorithms for String statusText()
Switch(status)
   case 'f'
      return "Freshman"
   case 's'
      return "Sophmore"
   case 'j'
      return "Junior"
   case 'r'
      return "Senior"
return null
 */
    
 /* 
 	Data Table for String statusTest()	
Variable or Constant	Type	Purpose
status	char 	determines the class standing of the undergraduatestudent
  */

    public String statusText() {
        switch (status) {
        case 'f':
            return "Freshman";

        case 's':
            return "Sophomore";

        case 'j':
            return "Junior";

        case 'r':
            return "Senior";
        }

        return null;
    }
/* 
Algorithm for UnderGraduateStudents parse(String [] input)
String name <- input[1]
String address <- input[2]
String phoneNumber <- input[3]
String emailAddress <- input[4]
Date birthdate <- input[5]
char status <- (input[6]).charAt(0)
 */
    
 /* 
 	Data Table for UnderGraduateStudent parse(String [] input)	
Variable or Constant	Type	Purpose
name	String	Store the value of the UnderGraduateStudent name
address	String	Store the value of the UnderGraduateStudent Address
phoneNumber	String	Store the value of the UnderGraduateStudent Phone Number
emailAddress	String	Store the value of the UnderGraduateStudent Email Address
birthDate	Date	Store the value of the UnderGraduateStudent birth date
status	char	Store the value of the UnderGraduateStudent status
input	String []	the input to the parse function 
returnValue	UnderGraduateStudents	Created UnderGradStudent with these parameters
  */

    public static UnderGraduateStudents parse(String[] input) {
        String name = input[1];
        String address = input[2];
        String phoneNumber = input[3];
        String emailAddress = input[4];
        Date birthDate = new Date(input[5]);
        char status = (input[6]).charAt(0);

        return new UnderGraduateStudents(name, address, phoneNumber,
                                         emailAddress, birthDate, status);
    }
}
