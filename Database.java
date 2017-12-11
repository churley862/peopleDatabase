public class Database {
    private String[] records = new String[100];
    private int recordCount = 0;
    private Person[] people = new Person[100];
    private int population = 0;

    public Database() {
    }

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

    public void dumpInput() {
        for (int i = 0; i < recordCount; i++) {
            System.out.println(records[i]);
        }
    }

    // there is a better way to write this as a generic bubble sort,
    // if you are allowed to pass in an interface and implement
    // a sorter for each type...
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

    public void listIf(Class klass) {
        for (int i = 0; i < population; i++) {
            if (klass.isInstance(people[i])) {
                System.out.println(people[i]);
            }
        }
    }
}

