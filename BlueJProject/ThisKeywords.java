
/**
 * Write a description of class ThisKeywords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThisKeywords
{
    int var = 5;
    public static void main(String[] args)
    {
        ThisKeywords obj = new ThisKeywords();
        obj.methodM(10);
        obj.methodM();
    }
    void methodM(int var)
    {
    var = 10;
    System.out.println("value of Instance variable: "+this.var);
    System.out.println("Value of Local variable: "+var);
    }
    void methodM()
    {
    int var = 40;
    System.out.println("Value of Instance Variable:"+this.var);
    System.out.println("Value of Local variable:"+var);
    }
}
