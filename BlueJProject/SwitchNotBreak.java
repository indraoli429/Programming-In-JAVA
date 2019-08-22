
/**
 * In this SwitchNotBreak class we use switch without break
 * if the given number is match with the crossponding 
 * case, then that case will be execute after the executing 
 * remaining case (below that case) will be execute.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchNotBreak//class
{
  public static void main(String[]args) //main method
  {//start main method
   int num = 10;//local variable
   switch (num)//switch statement
   {//switch statement start
    case 10:System.out.println("10");
    case 20:System.out.println("20");
    case 30:System.out.println("30");
    default:System.out.println("Not in case 10, case 20 or case 30");
    }//closed switch statement
    }//closed main method
}
