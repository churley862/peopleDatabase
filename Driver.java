
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

            //String output;
            switch (command.charAt(0))
            {
                case '#':
                   System.out.println(inputFile.nextLine());
                   break;
                case 'u':
                  undergraduateStudent(command);
                  break;
                case 'g':
                  graduateStudent();
                  break;
                case 'f':
                  faculty();
                  break;
                case 's':
                  staff();
                  break;
                default:
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
    public static void undergraduateStudent(String command)
    {
        String undergradData[] = parseInputLine(command);
        String name = undergradData[0];
        String address = undergradData[1];
        String phoneNumber = undergradData[2];
        String emailAddress = undergradData[3];
        Date birthdate = new Date(undergradData[4]);
        char status = (undergradData[5]).charAt(0); 
    }
    public static void graduateStudent()
    {
        
    }
    public static void faculty()
    {
    
    }
    public static void staff()
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
   
