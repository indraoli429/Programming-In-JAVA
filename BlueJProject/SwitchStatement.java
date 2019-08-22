
/**
 * Write a description of class SwitchStatement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchStatement
{
    public static void main(String[]args){
        String style;
        String guitarist = "Eric Clapton";
        switch (guitarist) {
            case "Chet Atkins":    
                style = "Nashville sound";
                System.out.println(style);
                break;
            case "Thomas Emmanuel":    
                style = "Complex fingerstyle";
                System.out.println(style);
                break;
            default:    
                style = "Unknown";
                System.out.println(style);
                break;
        }
    }
}
