/*
  Collin Hurley
  Driver class creation for running the program
  CS101
*/

import java.util.*;
import java.io.*;
public class Driver
{
    private static Database dbase = new Database();
    private static Scanner inputFile;
/*

Algorithm for void main(String [] args)
initialize(args)
readRecords()
Print ("Project 6 database inheritance and polymorphism")
Print ("Hurley,Collin")
Print ("CS 101")
Print("System Input echo file\n")
dbase.dumpInput()
print ("\n\nAlphabetized List")
dbase.sortByName()
dbase.listIf(Person.class)
Print ("\n Staff Sorted By Hire Data")
dbase.sortByDate()
dbase.listIf(Staff.class)
Print ("\n List of employees ordered by Salary")
dbase.sortBySalary()
dbase.listIf(Employee.class)
Print ("\n List of graduate Students ordered by address")
dbase.sortByAddress()
dbase.listIf(GraduateStudents.class)
*/
/*
Variable or Constant	Type	Purpose
args	String []	pass the input file parameters to the program
*/
    public static void main(String [] args) throws Exception
    {
        initialize(args);
        readRecords();
        // print some header stuff
        System.out.println("Project 6 database inheritance and polymorphism");
        System.out.println("Hurley,Collin");
        System.out.println("CS 101");
        System.out.println("System Input echo file\n");
        dbase.dumpInput();
        System.out.println("\n\nAlphabetized List");
        dbase.sortByName();
        dbase.listIf(Person.class);

        System.out.println("\n Staff Sorted By Hire Data");
        dbase.sortByDate();
        dbase.listIf(Staff.class);
        
        System.out.println("\n List of employees ordered by Salary");
        dbase.sortBySalary();
        dbase.listIf(Employee.class);
        
        System.out.println("\n List of graduate Students ordered by address");
        dbase.sortByAddress();
        dbase.listIf(GraduateStudents.class);
    }
/*
Algorithm for void initialize(String [] args)
File inFile <- new File(args[0]);
File outFile <- new File(args[1]);
inputFile <- new Scanner(inFile);
FileOutputStream outputFile <- new FileOutputStream(outFile);
System.setOut(new PrintStream(outputFile))
*/
/*
	Data Table for  void initialize()	
Variable or Constant	Type	Purpose
args	String []	passed to the program in order to show input and output
inFile	File	the input file object that allows us to get our input from the function
outFile	File	The file to print to
inputFile 	Scanner	reference to the input file of the function
outputFile	FileOutputStream	the file that is printed to
*/
    private static void initialize(String[] args) throws FileNotFoundException {
        File inFile = new File(args[0]);
        File outFile = new File(args[1]);
        inputFile = new Scanner(inFile);
        FileOutputStream outputFile = new FileOutputStream(outFile);
        System.setOut(new PrintStream(outputFile));
    }
/*
Algorithm for void readRecords()
while (inputFile.hasNext()) 
   dbase.addPerson(inputFile.nextLine());
*/
/*
	Data Table for  void readRecords()	
Variable or Constant	Type	Purpose
inputFile	Scanner	Scanner to get data input from
*/
    private static void readRecords() {
        while (inputFile.hasNext()) {
            dbase.addPerson(inputFile.nextLine());
        }
    }
}

