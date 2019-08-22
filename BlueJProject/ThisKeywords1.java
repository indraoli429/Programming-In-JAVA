
/**
 * Write a description of class ThisKeywords1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThisKeywords1
{
    public static void main(String[] args)
    {
        ThisKeywords1 object = new ThisKeywords1();
        object.methodTwo();
    }
    void methodOne()
    {
        System.out.println("Inside Method One");
    }
    void methodTwo()
    {
        System.out.println("Inside Method Two");
        this.methodOne();
    }
}
