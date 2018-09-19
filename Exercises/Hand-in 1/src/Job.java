
public class Job
{

   private String title;
   private double salary;
   private String employee;

   public Job(String title, double salary, String employee)
   {
      this.title = title;
      this.salary = salary;
      this.employee = employee;
   }

   public Job(String title, double salary)
   {
      this.title = title;
      this.salary = salary;
   }

   public void setSalary(double salary)
   {
      this.salary = salary;
   }

   public String getTitle()
   {
      return this.title;
   }

   public double getSalary()
   {
      return this.salary;
   }

   public String getEmployee()
   {
      return this.employee;
   }

   public boolean isAvailable()
   {
      if (employee == null)
         return true;
      else
         return false;
   }

   public void hire(String employee)
   {
      if (isAvailable() == true)
      {
         this.employee = employee;
      }
   }

   public void fire()
   {
      this.employee = null;
   }

}
