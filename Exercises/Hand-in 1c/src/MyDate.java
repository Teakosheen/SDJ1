
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

      if(month < 1 || month > 12)
      {
         month = 1;
      }
    
      if(day < 1)
      {
         day = 1;
      }
      if( year < 0 )
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
            if( day > 31)
            {
               day = 1;
            }
            break;
         case 2:
            
            if( day > 28)
            {
               day = 1;
            }
            break;
         case 4:
         case 6:
         case 9:
         case 11:
            if( day > 30)
               {
               day = 1;
               }
            break;
      }
      
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
}