
/**
 * Write a description of class FibonacciNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciNumber
{
    public static void main(String[]args)
    {
        int num1=1,num2=1,num3;
        int count=10;
        System.out.print(num1+" "+num2);
            for(int i=2;i<count;++i)
            {
                num3=num1+num2;
                System.out.print(" "+num3);
                num1=num2;
                num2=num3;
            }
    }
}
/**
 * 1 1 2 3 5 8 13 21 34 55
   */