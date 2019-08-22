
/**
 * In this OddEven class We check whether the given number is
 * either Even or Odd using if statement.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEven//class
{
   public static void main(String []args)//main method
   {
        int number=13;//local variable
        int remainder=number%2;//local variable
        if(remainder==0)//check remainder
        {
            System.out.println("The given number is Even");
        }else{
            System.out.println("The given number is Odd");
        }
    }
}
