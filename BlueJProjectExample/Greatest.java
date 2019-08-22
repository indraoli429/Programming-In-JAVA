
/**
 * Write a description of class Greatest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Greatest
{
    public static void main(String[]args){
        int a=10, b=10, c=11;
        if(a>b && a>c){
            System.out.println("Value of a is Greater and the value is: "+a);
        }
        if(b>a && b>c){
            System.out.println("Value of b is Greater and the value is: "+b);
        }
        if(c>a && c>b){
            System.out.println("Value of c is Greater and the value is: "+c);
        }
        else{
            System.out.println("All number are equal");
        }
    }
}
