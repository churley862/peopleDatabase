public class GraduateStudents extends Student
{
    protected char assistantshipType;

    public GraduateStudents(String name, String address, String phoneNumber, String emailAddress, Date birthDate, char status, char assistantshipType) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
        this.assistantshipType = assistantshipType;
    }


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

    public String statusText() {
        switch (status) {
        case 'm':
            return "Master";

        case 'd':
            return "Doctoral";
        }
        return null;
    }

    public String assistantshipText() {
        switch (assistantshipType) {
        case 't':
            return "Teaching";

        case 'r':
            return "Research";
        }

        return null;
    }

    public int compareByAddress(GraduateStudents other) {
        return address.compareTo(other.address);
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
