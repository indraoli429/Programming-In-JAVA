
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
   public static void main(String[]args){
       int number=3, fact=1;
       for(int i=1;i<=number;i++){
           fact=fact*i;
       }
       System.out.println("Factorial of "+number+" is "+fact);
    }
}
