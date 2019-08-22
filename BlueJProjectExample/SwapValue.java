
/**
 * Write a description of class SwapValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwapValue
{
    static int num1=5, num2=10;
    
    public static void main(String[]args){
        System.out.println("Number before swap: \nnum1: "+num1+"\nnum2: "+num2);
        int num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("Number After swap: \nnum1: "+num1+"\nnum2: "+num3);
    }
}
