import java.util.Scanner;

public class GenderTest
{

   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.println("Type gender (M or F):");
   String line = input.nextLine();
   char gender = line.charAt(0);
   int number;
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter your age ");
   number = keyboard.nextInt();
   if (gender == 'M' && number >= 18)
      {System.out.println("Man");}
   else if (gender == 'M' && number < 18)
      {System.out.println("Boy");}
   else if (gender == 'F' && number >= 18)
   {System.out.println("Woman");}
   else
   {System.out.println("Girl");}}
   

   }


