
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
            char command = (inputFile.next()).charAt(0);

            //String output;
            switch (command)
            {
                case '#':
                   System.out.println(inputFile.nextLine());
                   break;
                case 'u':
                  undergraduateStudent();
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
    public static void undergraduateStudent()
    {
      String name = inputFile.next();
      String address = inputFile.next();
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
    public String[] getInputData()
    {
      int counter = 0;
      String input;
      String nextField;
      String [] output = {};
      while (inputFile.hasNext())
      {
        
         input  = inputFile.next();
         while(input.indexOf("#") != -1)
         {
            output[counter] = input.substring(input.indexOf("#"));
            input = input.substring(input.indexOf("#")+1);
            counter++;
         }
        
      }
      return output;
    }
  }
   