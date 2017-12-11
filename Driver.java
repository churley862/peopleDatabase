
import java.util.*;
import java.io.*;
public class Driver
{
    private static Person[] people = new Person[100];
    private static int population = 0;

    private static Scanner inputFile;
    public static void main(String [] args) throws Exception
    {
        initialize(args);

        while (inputFile.hasNext())
        {
            String command = (inputFile.nextLine());
            String [] inputData = command.split("#");
            //String output;
            switch (command.charAt(0))
            {
            case '#':
                System.out.println(inputFile.nextLine());
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

}

