public class UnderGraduateStudents extends Student
{
    public UnderGraduateStudents(String[] input) {
        name = input[1];
        address = input[2];
        phoneNumber = input[3];
        emailAddress = input[4];
        birthDate = new Date(input[5]);
        status = (input[6]).charAt(0); 
    } 
}
