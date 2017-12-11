public class UnderGraduateStudents extends Student
{
    public UnderGraduateStudents(String name, String address,
                                 String phoneNumber, String emailAddress,
                                 Date birthDate, char status) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
    }

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
