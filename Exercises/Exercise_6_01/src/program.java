import java.util.ArrayList;
import java.util.Scanner;

public class program
{
   public static void main(String[] args)
   {
      ArrayList<Integer> accountList = new ArrayList<Integer>();
      Scanner keyboard = new Scanner(System.in);
      {
         System.out.println("Please enter a list of Integers: ");
      }

      for (int i = 0; i < 3; i++) // for only three inputs
      {
         int input = keyboard.nextInt();
         accountList.add(input);
      }

      for (int index = 0; index < accountList.size(); index++)

         System.out.println(
               "Index " + index + " : integer" + accountList.get(index));

      int max = accountList.get(0);
      int index = 0;
      for (int i = 0; i < accountList.size(); i++)
      {
         if (max < accountList.get(i))
         {
            max = accountList.get(i);
            index = i;
         }
      }
      System.out.println(
            "Index position of Maximum value" + " in array list is: " + index);

   }

}
