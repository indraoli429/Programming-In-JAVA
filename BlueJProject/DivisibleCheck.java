
/**
 * In this DivisibleCheck class We check whether the given number is
 * either divisible by both 3 and 5 or not using if Ststement.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleCheck//class
{
    public static void main(String[]args)//main method
    {
    int number=45;//local variable
    int remainder1=number%3;//local variable
    int remainder2=number%5;//local variable
    if(remainder1==0&&remainder2==0)//check remainder
    {
    System.out.println("The given number is Divisible by both 3 and 5");
    }
    else
    {
    System.out.println("The given number is not Divisible by both 3 and 5");
    }
    }
}
