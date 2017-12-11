/*
  Collin Hurley
  Graduate student class creation for ease of operations
  CS101
*/

public class GraduateStudents extends Student
{
    protected char assistantshipType;

    public GraduateStudents(String name, String address, String phoneNumber, String emailAddress, Date birthDate, char status, char assistantshipType) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
        this.assistantshipType = assistantshipType;
    }

/*
Algorithm for String toString()
return String.format(
"Graduate Student\n" +
"\tname: %s\n" +
"\taddress: %s\n" +
"\tphone number: %s\n" +
"\te-mail address: %s\n" +
"\tbirth date: %s\n" +
"\tstatus: %s\n" +
"\tassistantship: %s\n",
name, address, phoneNumber, emailAddress,
birthDate.toString(), statusText(), assistantshipText())
*/
/*
	Data Table for String toString()	
Variable or Constant	Type	Purpose
name	String	Store the value of the GraduateStudent name
address	String	Store the value of the GraduateStudent Address
phoneNumber	String	Store the value of the GraduateStudent Phone Number
emailAddress	String	Store the value of the GraduateStudent Email Address
birthDate	Date	Store the value of the GraduateStudent birth date
status	char	Store the value of the GraduateStudent status
assistantshipType	char	Store the value of the graduate students assistantship type
*/
    public String toString() {
        return String.format(
                   "Graduate Student\n" +
                   "\tname: %s\n" +
                   "\taddress: %s\n" +
                   "\tphone number: %s\n" +
                   "\te-mail address: %s\n" +
                   "\tbirth date: %s\n" +
                   "\tstatus: %s\n" +
                   "\tassistantship: %s\n",
                   name, address, phoneNumber, emailAddress,
                   birthDate.toString(), statusText(), assistantshipText());
    }
/*
Algorithm for String statusText()
switch(status)
case 'm'
   return "Master"
case 'd'
   return "Doctoral"
return null
*/
/*
Variable or Constant	Type	Purpose
status	char 	determines the class standing of the graduatestudent
*/

    public String statusText() {
        switch (status) {
        case 'm':
            return "Master";

        case 'd':
            return "Doctoral";
        }
        return null;
    }
/*
Algorithm for String assistantshipText()
switch(status)
   case 't'
      return "Teaching"
   case'r'
      return "Research"
   return null
*/
/*
*/

    public String assistantshipText() {
        switch (assistantshipType) {
        case 't':
            return "Teaching";

        case 'r':
            return "Research";
        }

        return null;
    }
/*
Algorithm for GraduateStudents parse()
String name <- input[1]
String address <- input[2]
Date birthdate <- input[3]
String phoneNumber <- input[4]
String emailAddress <- input[5]
char status <- (input[6]).charAt(0)
char assistantshipType = (input[7]).charAt(0)
return new GraduateStudents(name,address,phoneNumber,emailAddress,birthDate,status, assistantshipType)
*/
/*
	Data Table for GraduateStudent parse(String [] input)	
Variable or Constant	Type	Purpose
name	String	Store the value of the GraduateStudent name
address	String	Store the value of the GraduateStudent Address
phoneNumber	String	Store the value of the GraduateStudent Phone Number
emailAddress	String	Store the value of the GraduateStudent Email Address
birthDate	Date	Store the value of the GraduateStudent birth date
status	char	Store the value of the GraduateStudent status
input	String []	the input to the parse function 
returnValue	UnderGraduateStudents	Created GradStudent with these parameters
assistantshipType	char	Store the value of the assistantship type that the graduate student has
*/

    public static GraduateStudents parse(String[] input) {
        String name = input[1];
        String address = input[2];
        Date birthDate = new Date(input[3]);
        String phoneNumber = input[4];
        String emailAddress = input[5];
        char status = (input[6]).charAt(0);
        char assistantshipType = (input[7]).charAt(0);

        return new GraduateStudents(name, address, phoneNumber, emailAddress, birthDate, status, assistantshipType);
    }
}
