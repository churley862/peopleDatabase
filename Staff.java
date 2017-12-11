public class Staff extends Employee
{
   String supervisorName;
   public Staff(String[] input) {
        name = input[1];
        address = input[2];
        title = input[3];
        phoneNumber = input[4];
        emailAddress = input[5];
        office = input[6];
        salary = Double.parseDouble(input[7]);
        hireDate = new Date(input[8]);
        supervisorName = input[9];
      } 
   
}