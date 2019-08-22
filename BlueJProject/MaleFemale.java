
/**
 * In this MaleFemale class I used the nested If condition. 
 * Nested If condition means if-else statement with another 
 * if-else statement as insiide the if body or inside the else body.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaleFemale //class
{
    public static void main()//main method
  
    {
        int a =20;//local variable
        String b="female";//local string
        if (a>=20)
        {//nested if statement Starts
            if(b=="male")
            {
            System.out.println("Male Adult");
            }     
            else if(b=="female")
            {
                System.out.println("Female Adult");
            }
        }///nested if statement Closed
      
            else
            {
                System.out.println("Child");
            }
        
    }//Main method closed
}//class closed
