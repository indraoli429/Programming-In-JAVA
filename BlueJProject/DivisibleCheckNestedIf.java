
/**
 * Write a description of class DivisibleCheckNestedIf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleCheckNestedIf//class
{
    public static void main(String[]args)//main method
    {//main method start
    int number=45;//local variable
    if(number%3==0)//check remainder
    {
        if(number%5==0)//check remainder (nested if)
        {
            System.out.println("The given number is Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("The given number is Divisible by 3 but not 5");
        }
    }
    else if(number%5==0)
    {
        if(number%3==0)//check remainder (nested if)
        {
            System.out.println("The given number is Divisible by both 3 and 5");
       }
       else
       {
           System.out.println("The given number is Divisible by 5 but not 3");
        }
    }
    else
    {
        System.out.println("The given number is not Divisible by both 3 and 5");
    }
    }//main method closed
}
