import java.util.Scanner;
public class yourage
{

   public static void main(String[] args)
   {
   int number;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your age ");
    number = keyboard.nextInt();
    if(number < 0 )
    {
       System.out.println("Error in the age value");
    }
    else if(number > 0 && number <= 12)
    {
       System.out.println("You are a child");
    }
    else if(number > 12 && number <= 19)
    {
       System.out.println("You are a teenager");
    }
    else if(number > 19 && number <= 65)

   {
      System.out.println("You are an adult");
      }
    else
    {
       System.out.println("You are senior citizen");
    }
   }
   

}
