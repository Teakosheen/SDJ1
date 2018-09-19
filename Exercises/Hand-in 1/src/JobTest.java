
public class JobTest
{

   public static void main(String[] args)
   {
    Job aJob = new Job("Teacher", 5000,"Teakosheen");
    System.out.println("The title is" + aJob.getTitle());
    System.out.println("The salary is" + aJob.getSalary());
    System.out.println("The employee is" + aJob.getEmployee());
    
    aJob.fire();
    System.out.println("Teakosheen" + "is fired");
    
    aJob.hire("Michael");
    System.out.println("Michael" + "is hired");
   
    }

}
