public class GraduateStudents extends Student
{
    protected char assistantshipType;

    public GraduateStudents(String name, String address, String phoneNumber, String emailAddress, Date birthDate, char status, char assistantshipType) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
        this.assistantshipType = assistantshipType;
    }

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
