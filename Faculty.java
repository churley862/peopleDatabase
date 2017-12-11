public class Faculty extends Employee
{
   String officeHours;
   public Faculty(String[] input) {
        name = input[1];
        address = input[2];
        phoneNumber = input[3];
        emailAddress = input[4];
        office = input[5];
        salary = Double.parseDouble(input[6]);
        hireDate = new Date(input[7]);
        title = input[8];
        officeHours = input[9];
      } 
   
}