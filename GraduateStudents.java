public class GraduateStudents extends Student
{
   public char assistantshipType;

   public GraduateStudents(String[] input) {
        name = input[1];
        address = input[2];
        birthDate = new Date(input[3]);
        phoneNumber = input[4];
        emailAddress = input[5];
        status = (input[6]).charAt(0);   
        assistantshipType = (input[7]).charAt(0);   
   } 
}
