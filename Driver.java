
import java.util.*;
import java.io.*;
public class Driver
{
    private static Set[] sets = new Set[100];
    private static Scanner inputFile;
    public static void main(String [] args) throws Exception
    {
        initialize(args);

        while (inputFile.hasNext())
        {
            String command = (inputFile.next());
            String [] inputData = parseInputLine(command);
            //String output;
            switch (command.charAt(0))
            {
                case '#':
                   System.out.println(inputFile.nextLine());
                   break;
                case 'u':
                  undergraduateStudent(inputData);
                  break;
                case 'g':
                  graduateStudent(inputData);
                  break;
                case 'f':
                  faculty(inputData);
                  break;
                case 's':
                  staff(inputData);
                  break;
                default:
                  System.out.println("invalid input");
                  break;
            }
        }
    } 

   
   private static void initialize(String[] args) throws FileNotFoundException {
        File inFile = new File(args[0]);
        File outFile = new File(args[1]);
        inputFile = new Scanner(inFile);
        FileOutputStream outputFile = new FileOutputStream(outFile);
        System.setOut(new PrintStream(outputFile));
    }
    public static void undergraduateStudent(String [] input)
    {
        String name = input[0];
        String address = input[1];
        String phoneNumber = input[2];
        String emailAddress = input[3];
        Date birthdate = new Date(input[4]);
        char status = (input[5]).charAt(0); 
    }
    public static void graduateStudent(String [] input)
    {
        String name = input[0];
        String address = input[1];
        String phoneNumber = input[2];
        String emailAddress = input[3];
        Date birthdate = new Date(input[4]);
        char status = (input[5]).charAt(0);   
    }
    public static void faculty(String [] input)
    {
    
    }
    public static void staff(String [] input)
    {
      
    }
    public static String[] parseInputLine(String input)
    {
      int counter = 0;
      String nextField;
      String [] output = {};
        
         
         while(input.indexOf("#") != -1)
         {
            output[counter] = input.substring(input.indexOf("#"));
            input = input.substring(input.indexOf("#")+1);
            counter++;
         }
        
      return output;
    }
  }
   
