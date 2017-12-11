/*
  Collin Hurley
  Driver class creation for running the program
  CS101
*/

public class Database {
    private String[] records = new String[100];
    private int recordCount = 0;
    private Person[] people = new Person[100];
    private int population = 0;

    public Database() {
    }
    /*
    Algorithm for void addPerson(String record)
records[recordCount++] <- record
String[] inputData <- record.split('#')
switch(record.charAt(0))
   case'#'
      break
   case 'u'
      people[population++] = underGraduateStudents.parse(inputData)
      break
   case 'g'
      people[population++] = GraduateStudents.parse(inputData)
      break
   case 'f'
      people[population++] = Faculty.parse(inputData)
      break
   case 's'
      people[population++] = Staff.parse(inputData)
      break
   default 
      print("Invalid input" + record)
      break 
    */
    /*
    	Data Table for addPerson()	
Variable or Constant	Type	Purpose
record	String	The inputed string to be turned into a person in the database
people	Person[]	the array where all of the people are stored in the database
population	int	the amount of people in existance
    */

    public void addPerson(String record) {
        records[recordCount++] = record;
        String[] inputData = record.split("#");

        switch (record.charAt(0))
        {
        case '#':
            // skip this line
            break;
        case 'u':
            people[population++] = UnderGraduateStudents.parse(inputData);
            break;
        case 'g':
            people[population++] = GraduateStudents.parse(inputData);
            break;
        case 'f':
            people[population++] = Faculty.parse(inputData);
            break;
        case 's':
            people[population++] = Staff.parse(inputData);
            break;
        default:
            System.out.println("invalid input: " + record);
            break;
        }
    }
/*
    Algorithm for void dumpInput()
   for (int = 0; i < recordCount; i++)
      System.out.println(records[i])
    */
    /*
    	Data Table for dumpInput()	
Variable or Constant	Type	Purpose
recordCount	iterration of the data for print	is the number of records that the system will print
records	String []	Stores the input data
    */
    public void dumpInput() {
        for (int i = 0; i < recordCount; i++) {
            System.out.println(records[i]);
        }
    }

    /*
    Algorithm for void sortByName()
boolean swapped <- true
while(swapped)
   swapped <- false
   for(int i = 1; i < population;i++)
      if (people[i-1].compareByName(people[i]) > 0)
         swapped <- true
         Person tmp = people[i-1]
         people[i-1] = people[i]
         people[i] = tmp
    */
    /*
    	Data Table for void sortByName()	
Variable or Constant	Type	Purpose
swapped	boolean	to see if the last loop had a swap in it
population	int	the size of people in the database used to see if we are done looping
tmp	Person	used to compute the sort 
people	Person[]	used to store sorted data on completion
    */
    public void sortByName() {
        // bubble sort
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < population; i++) {
                if (people[i-1].compareByName(people[i]) > 0) {
                    swapped = true;
                    Person tmp = people[i-1];
                    people[i-1] = people[i];
                    people[i] = tmp;
                }
            }
        }
    }
/*
    Algorithm for void sortBySalary()
boolean swapped <- true
while(swapped)
   swapped <- false
   for(int i = 1; i < population;i++)
      if (people[i-1].compareBySalary(people[i]) > 0)
         swapped <- true
         Person tmp = people[i-1]
         people[i-1] = people[i]
         people[i] = tmp
    */
    /*
    	Data Table for void sortBySalary()	
Variable or Constant	Type	Purpose
swapped	boolean	to see if the last loop had a swap in it
population	int	the size of people in the database used to see if we are done looping
tmp	Person	used to compute the sort 
people	Person[]	used to store sorted data on completion
    */
 public void sortBySalary() {
        // bubble sort
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < population; i++) {
                if (people[i-1].compareBySalary(people[i]) > 0) {
                    swapped = true;
                    Person tmp = people[i-1];
                    people[i-1] = people[i];
                    people[i] = tmp;
                }
            }
        }
    }
    /*
    Algorithm for void sortByDate()
boolean swapped <- true
while(swapped)
   swapped <- false
   for(int i = 1; i < population;i++)
      if (people[i-1].compareByDate(people[i]) > 0)
         swapped <- true
         Person tmp = people[i-1]
         people[i-1] = people[i]
         people[i] = tmp
    */
    /*
    	Data Table for void sortByDate()	
Variable or Constant	Type	Purpose
swapped	boolean	to see if the last loop had a swap in it
population	int	the size of people in the database used to see if we are done looping
tmp	Person	used to compute the sort 
people	Person[]	used to store sorted data on completion
    */
 public void sortByDate() {
        // bubble sort
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < population; i++) {
                if (people[i-1].compareByHireDate(people[i]) > 0) {
                    swapped = true;
                    Person tmp = people[i-1];
                    people[i-1] = people[i];
                    people[i] = tmp;
                }
            }
        }
    }
    /*
    Algorithm for void sortByAddress()
boolean swapped <- true
while(swapped)
   swapped <- false
   for(int i = 1; i < population;i++)
      if (people[i-1].compareByAddress(people[i]) > 0)
         swapped <- true
         Person tmp = people[i-1]
         people[i-1] = people[i]
         people[i] = tmp
    */
    /*
    	Data Table for void sortByAddress()	
Variable or Constant	Type	Purpose
swapped	boolean	to see if the last loop had a swap in it
population	int	the size of people in the database used to see if we are done looping
tmp	Person	used to compute the sort 
people	Person[]	used to store sorted data on completion
    */
  public void sortByAddress() {
        // bubble sort
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < population; i++) {
                if (people[i-1].compareByAddress(people[i]) > 0) {
                    swapped = true;
                    Person tmp = people[i-1];
                    people[i-1] = people[i];
                    people[i] = tmp;
                }
            }
        }
    }

/*
    Algorithm for void listIf(Class klass)
for (int i = 0; i < population; i++)
   if (klass.isInstance(people[i]))
      System.out.println(people[i])
    */
    /*
    	Data Table for void listIf(Class klass)	
Variable or Constant	Type	Purpose
klass	Class	to determine if the type of the input class is the same as requested
population	int	used to determine number of iterrations
i	int 	iterator 
    */
    public void listIf(Class klass) {
        for (int i = 0; i < population; i++) {
            if (klass.isInstance(people[i])) {
                System.out.println(people[i]);
            }
        }
    }
}

