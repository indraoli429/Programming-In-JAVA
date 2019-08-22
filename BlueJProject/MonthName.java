
/**
 * Description of class MonthName:
 * display the Name of the month according to 
 * the given numberby using Switch statement. 
 * Variable: int and String
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MonthName//class
{
   public static void main(String[]args)//main method
   {
    int month=9;//local integer variable
    String monthString;//local String variable
    switch(month)//Switch statement
    {//Switch statement start
        case 1:monthString="January";break;
        case 2:monthString="February";break;
        case 3:monthString="March";break;
        case 4:monthString="April";break;
        case 5:monthString="May";break;
        case 6:monthString="June";break;
        case 7:monthString="July";break;
        case 8:monthString="August";break;
        case 9:monthString="September";break;
        case 10:monthString="October";break;
        case 11:monthString="November";break;
        case 12:monthString="December";break;
        default:monthString="Invalid month";break;
    }//Switch statement closed
    System.out.println(monthString);
    }//closed main method
}
