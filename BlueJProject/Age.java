
/**
 * In this Age class I used the nested If condition. 
 * Nested If condition means if-else statement with another 
 * if-else statement as insiide the if body or inside the else body.
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Age //class
{
     public static void main() //main method
    {
        int a =20;//local variable
        if (a>=20) //if condition
        {
            System.out.println("Adult"); 
        }
        else
        {
            if(a>=5)
        {
            System.out.println("Child");
        }
            else
        {
            System.out.println("NewlyBorn");
        } 
    }
    }
}
