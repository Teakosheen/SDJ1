
public class MyDateTest
{

   public static void main(String[] args)
   {
      MyDate MyDate1 = new MyDate(29, 2, 2014);

      System.out.println("Day: " + MyDate1.getDay());
      System.out.println("Month: " + MyDate1.getMonth());
      System.out.println("Year: " + MyDate1.getYear());
      
      MyDate1.setMyDate(30, 2, 2000);

   

      System.out.println("Day: " + MyDate1.getDay());
      System.out.println("Month: " + MyDate1.getMonth());
      System.out.println("Year: " + MyDate1.getYear());
}

}
