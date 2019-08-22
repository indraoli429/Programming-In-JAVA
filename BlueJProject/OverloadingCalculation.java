
/**
 * If a class has multiple methods having same name but 
 * different in parameters, it is known as Method Overloading. 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OverloadingCalculation
{
   public void sum(int a, long b)
   {
       System.out.println(a+b);
   }
   public void sum(int a, int b, int c)
   {
       System.out.println(a+b+c);
   }
}
