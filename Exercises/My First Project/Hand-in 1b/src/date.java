import java.util.Scanner;

public class date
{

   public static void main(String[] args)
   {
      int number1, number2, number3;
      
      Scanner keyboard = new Scanner(System.in);
     
      System.out.println("Enter three integer: ");
      
      number1 = keyboard.nextInt();
      
      number2 = keyboard.nextInt();
      
      number3 = keyboard.nextInt();
      
      if (number1 <= 0 && number2 > 12 && number2 <=0)
      {System.out.println("Illegal date");}
      else if(number1 > 28 && number2 == 2) 
      {System.out.println("Illegal date");}
      else if(number1 > 30 && number2 == 4)
      {System.out.println("Illegal date");}
      else if(number1 > 30 && number2 == 6)
      {System.out.println("Illegal date");}
      else if(number1 >30 && number2 == 9)
      {System.out.println("Illegal date");}
      else if(number1 >30 && number2 == 11)
      {System.out.println("Illegal date");}
      else if(number1 >31 && number2 == 1)
      {System.out.println("Illegal date");}
      else if(number1 > 31 && number2 == 3)
      {System.out.println("Illegal date");}
      else if(number1 > 31 && number2 == 5)
      {System.out.println("Illegal date");}
      else if(number1 > 31 && number2 == 7)
      {System.out.println("Illegal date");}
      else if(number1 > 31 && number2 == 8)
      {System.out.println("Illegal date");}
      else if(number1 > 31 && number2 == 10)
      {System.out.println("Illegal date");}
      else if(number1 > 31 && number2 == 12)
      {System.out.println("Illegal date");}
      else
      {
         System.out.println(number1 + "/" +  number2 + "/" + number3);
         
      }
         
      
      }
      
      }
