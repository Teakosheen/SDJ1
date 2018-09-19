
public class MyDate
{
   private int month;
   private int day;
   private int year;

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public void setMyDate(int day, int month, int year)
   {

      if (month < 1)
      {
         month = 1;
      }
      if (month > 12)
      {
         month = 12;
      }

      if (day < 1)
      {
         day = 1;
      }
      if (year < 0)
      {
         year = 2000;
      }
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            if (day > 31)
            {
               day = 31;
            }
            break;
         case 2:

            if (day > 28)
               
            {
             if (isLeaperyear)
             {
                day = 29;
             }
             else
             {    
             day = 28; ;
            }
            break;
         case 4:
         case 6:
         case 9:
         case 11:
            if (day > 30)
            {
               day = 30;
            }
            break;
            default:
               break;
      }

      this.day = day;
      this.month = month;
      this.year = year;
   }
public int numberOfDaysInMonth(int month)
      
   public boolean isLeapyear()
   {
      if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))
         return true;
      else
      {
         return false;
      }
   

   public void stepForwardOneDay()
   {
 int day = 1;
 for ( int day; day++)
    day++;
    for( int monthnumber; monthnumber++)
       monthnumber++;
       for( int year; year++)
          year++;
   }

   public int getNumberOfDaysInMonth(int monthnumber)
   {
    switch (month)
    {
       case 1:case 3:case 5:case 7:case 8:case 10:case 12:
         return 31;
       case 4:case 6:case 9:case 11:
          return 30;
       case 2:
         if(isLeapYear())
            return 29;
         else
            return 28;
      default:
         return -1;
          
    }
   }

}
}