public class UnderGraduateStudents extends Student
{
    public UnderGraduateStudents(String name, String address,
                                 String phoneNumber, String emailAddress,
                                 Date birthDate, char status) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
    }

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
