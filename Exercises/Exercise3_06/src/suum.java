import java.util.Scanner;
public class suum
{

   public static void main(String[] args)
   {
    int number1, number2;
    
   Scanner keyboard = new Scanner(System.in);
  
   System.out.println("Enter two integer: ");
   
   number1 = keyboard.nextInt();
   
   number2 = keyboard.nextInt();
   
    if(number1 < number2)
    {
       
       System.out.println(number1);
       System.out.println(number2);
    }
       else
       {     System.out.println(number2);
             System.out.println(number1);
    }
    
    double sum;
    sum = number1 + number2;
    System.out.println("Their sum is " + sum);
    
    {
       double quotient;
     
     
           if (number2 == 0)
     {
        System.out.println("Can not divide by 0");
     }
     else
     {
        quotient = (double) number1 / number2;
        System.out.println("Their quotient is " + quotient);
     }  
     }
   
   {
      double leftover;
     
    if (number2 == 0) 
    {
       System.out.println(" Can not divided by 0");
          
    }
    else
    { 
       leftover = (double) number1 % number2;
       System.out.println("The reminder after division is "
                            + leftover);
    }
   }
   }}
