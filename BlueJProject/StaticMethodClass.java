
/**
 * Write a description of class FactorialStaticMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaticMethodClass
{
   public static void main(String[]args)
    {
        int num=2;
        long numb=2;
        StaticMethodClass method = new StaticMethodClass();
        System.out.println(method.returnNum(num));
        method.checkNum(num);
        Factorial fact = new Factorial();
        fact.factorial(5);
    }
    public int returnNum(int num)
    {
        return num*num;
    }
    public String checkNum(int num)
    {
        if(num>0)
        {
            return "Positive";
        }
        else if(num<0)
        {
            return "Negative";
        }
        else
        {
           return "Zero"; 
        }
    }
    public String checkNum(long numb)
    {
        if(numb%2==0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
        
    }
}
