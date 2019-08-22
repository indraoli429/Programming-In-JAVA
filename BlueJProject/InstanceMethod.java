
/**
 * Write a description of class InstanceMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InstanceMethod
{
  public static void main(String[]args)
    {
        int num=2;
        InstanceMethod method = new InstanceMethod();
        System.out.println(method.returnNum(num));
    }
    public int returnNum(int num)
    {
        return num*num;
    }
}
