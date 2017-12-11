/*
  Collin Hurley
  date class creation for operations and comparison
  CS101
*/
public class Date
{

    public int day;
    public int month;
    public int year;

    public Date(String input)
    {
        String[] parts = input.split("/");
        month = Integer.parseInt(parts[0]);
        day = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
    }
/* 
Algorithm for String toString()
   return String.format("%s %d,%d",monthName(),day,year)
*/
    
 /* 
 		Data Table for String toString()	
Variable or Constant	Type	Purpose
day	int	to store the day of the month
year	int	to store the year of a date
   */

    public String toString() {
        return String.format("%s %d, %d", monthName(), day, year);
    }
/* 
Algorithm for monthName()
switch(month)
 Case 1:
   return "January"
   break
 Case 2:
   return "Feburary"
   break
 Case 3:
   return "March"
   break
 Case 4:
   return "April"
   break
 Case 5 :
   return "May"
   break
 Case 6:
   return "June"
   break
 Case 7:
   return "July"
   break
 Case 8:
   return "August"
   break
 Case 9:
   return "September"
   break
 Case 10:
   return "October"
   break
 Case 11:
   return "November"
   break
 Case 12:
   return "December"
   break
return null
*/
    
 /* 
 	
   */
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
/* 
Algorithm for compareTo(Date dateIn)
if (dateIn.year < year)
   return -1
   else if (dateIn.year < year)
      return 1
   else 
      if(dateIn.month > month)
         return -1
      else if(dateIn.month < month)
         return 1
      else if(dateIn.day > day)
        return -1
      else if(dateIn < day)
        return 1
      else 
        return 0
*/
    
 /* 
 		Data Table for int compareTo(Date dateIn)	
Variable or Constant	Type	Purpose
year	int	to store the year of a date
month	int 	to store the month of a date
day	int 	to store the day of a date
dateIn.year	int	to store the year of a date inputed
dateIn.month	int 	to store the month of a date inputed
dateIn.day	int 	to store the day of a date inputed 
   */
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
