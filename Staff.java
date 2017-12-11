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

    public int compareByHireDate(Staff other) {
        return hireDate.compareTo(other.hireDate);
    }

    public String toString() {
        return String.format(
                   "Faculty\n" +
                   "\tname: %s\n" +
                   "\taddress: %s\n" +
                   "\tphone number: %s\n" +
                   "\te-mail address: %s\n" +
                   "\toffice: %s\n" +
                   "\tsalary: $%02f\n" +
                   "\thiring date: %s\n" +
                   "\ttitle: %s\n" +
                   "\tsupervisor: %s\n",
                   name, address, phoneNumber, emailAddress, office, salary,
                   hireDate.toString(), title, supervisorName);
    }

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
