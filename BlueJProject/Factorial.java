
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
   public static void factorial(int num)
    {
        int a=1;
        int sum=1;
        for(int i=num;i>=1;i--)
        {
            sum*=i;
        }
        System.out.println("The factorial of "+num+" is "+sum+".");
    }
}
