public class Date
{

    public int day;
    public int month;
    public int year;

    public Date(String input)
    {
        month = Integer.parseInt(input.substring(0,input.indexOf("/")));
        input = input.substring(input.indexOf("/")+1);
        day = Integer.parseInt(input.substring(0,input.indexOf("/")));
        input = input.substring(input.indexOf("/")+1);
        year = Integer.parseInt(input);
    }

    public String toString() {
        return String.format("%s %d, %d", monthName(), day, year);
    }

    public String monthName() {
        switch (month) {
        case 1:
            return "January";
        case 2:
            return "Feburary";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        }

        return null;
    }

    public int compareTo(Date dateIn)
    {
        if (dateIn.year > year)
        {
            return -1;
        } else if (dateIn.year < year) {
            return 1;
        } else {
            if (dateIn.month > month)
                return -1;
            else if (dateIn.month < month)
                return 1;
            else if (dateIn.day > day)
                return -1;
            else if (dateIn.day < day)
                return 1;
            else
                return 0;
        }
    }
}
