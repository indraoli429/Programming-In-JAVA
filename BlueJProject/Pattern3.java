
/**
 * Write a description of class Pattern3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern3
{
   public static void main(String[]args)
   {
       for (int i = 1; i <=4; i++) 
        {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for(int l=(i-1); l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println("");

        }
        
    }
}
/**
   1
  121
 12321
1234321
   */
