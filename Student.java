/*
  Collin Hurley
  Student class creation for ease of operations
  CS101
*/

public class Student extends Person
{
    protected Date birthDate;
    protected char status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Date birthDate, char status) {
        super(name, address, phoneNumber, emailAddress);
        this.birthDate = birthDate;
        this.status = status;
    }
}
