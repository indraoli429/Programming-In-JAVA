
/**
 * Write a description of class IfElseIf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IfElseIf
{
    public static void main(String[]args){
      int numOfSongs = 10;
        if (numOfSongs <= 24) {  
            System.out.println("Do not book");
        } else if((numOfSongs > 24) & (numOfSongs < 50))
        { 
            System.out.println("Book for one night");
        } else if ((numOfSongs >= 50)) { 
            System.out.println("Book for two nights");
        } else {  
            System.out.println("Book for the week");
        }
    }
}
