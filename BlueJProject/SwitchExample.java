
/**
 * In this SwitchExample class we use the switch 
 * statement with break.
 *if the given number is match with crossponding 
 *case then that case will be execute.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchExample//class
{
   public static void main(String[]args)//main method
   {
    int number =10;//local variable
    switch(number)//switch statement start
    {
    case 10:System.out.println("10");break;
    case 20:System.out.println("20");break;
    case 30:System.out.println("30");break;
    default:System.out.println("Not in 10, 20 or 30");
    }
    }
}
