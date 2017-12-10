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

   public int compareTo(Date dateIn)
   {
      if (dateIn.year > year)
      {
         return -1;
      }else if (dateIn.year < year)
      {
         return 1;
      }else
      {
         if (dateIn.month > month)
            return -1;
         else if (dateIn.month < month)
            return 1;
         else
            if (dateIn.day > day)
               return -1;
            else if (dateIn.day < day)
               return 1;
            else 
               return 0;
      }
   }
}
