import java.util.Scanner;

public class order
{

   public static void main(String[] args)
   {
      int number1, number2, number3;
      
      Scanner keyboard = new Scanner(System.in);
     
      System.out.println("Enter three integer: ");
      
      number1 = keyboard.nextInt();
      
      number2 = keyboard.nextInt();
      
      number3 = keyboard.nextInt();
      if (number1 < number2 && number1 < number3 && number2 < number3)
         {System.out.println(number1);
         System.out.println(number2);
         System.out.println(number3);}
      else if (number1 < number2 && number1 < number3 && number3 < number2)
         {System.out.println(number1);
         System.out.println(number3);
         System.out.println(number2);}
      else if (number2 < number1 && number2 < number3 && number1 < number3)
         {System.out.println(number2);
         System.out.println(number1);
         System.out.println(number3);}
      else if (number2 < number1 && number2 < number3 && number3 < number1)
         {System.out.println(number2);
         System.out.println(number3);
         System.out.println(number1);}
      else if (number3 < number1 && number3 < number2 && number1 < number2)
         {System.out.println(number3);
         System.out.println(number1);
         System.out.println(number2);}
      else
         {System.out.println(number3);
         System.out.println(number2);
         System.out.println(number1);}
      

   }

}
