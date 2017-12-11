
import java.util.*;
import java.io.*;
public class Driver
{
    private static Database dbase = new Database();
    private static Scanner inputFile;

    public static void main(String [] args) throws Exception
    {
        initialize(args);
        readRecords();
        // print some header stuff
        System.out.println("System Input\n");
        dbase.dumpInput();
        System.out.println("\n\nAlpha List");
        dbase.sortByName();
        dbase.listIf(Person.class);

        System.out.println("Only Faculty");
        dbase.listIf(Faculty.class);
    }

    private static void initialize(String[] args) throws FileNotFoundException {
        File inFile = new File(args[0]);
        File outFile = new File(args[1]);
        inputFile = new Scanner(inFile);
        FileOutputStream outputFile = new FileOutputStream(outFile);
        //System.setOut(new PrintStream(outputFile));
    }

    private static void readRecords() {
        while (inputFile.hasNext()) {
            dbase.addPerson(inputFile.nextLine());
        }
    }
}

