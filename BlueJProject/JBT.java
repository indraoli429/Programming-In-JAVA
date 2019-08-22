
/**
 * Write a description of class JBT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JBT
{
    JBT()
    {
        this("JBT");
        System.out.println("Inside Constructor without parameter");
    }
    JBT(String str)
    {
        System.out.println("Inside Constructor with String parameter");
    }
    public static void main(String[] args)
    {
    JBT obj = new JBT();
    }
}
