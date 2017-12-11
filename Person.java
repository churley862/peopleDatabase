public class Person
{
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public int compareByName(Person other) {
        return name.compareTo(other.name);
    }

    public int compareBySalary(Person other) {
        return 0;
    }

    public int compareByAddress(Person other) {
        return address.compareTo(other.address);
    }

    public int compareByHireDate(Person other) {
        return 0;
    }
}
