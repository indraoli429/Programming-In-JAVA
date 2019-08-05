
/**
 * Write a description of class Increment here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Wednesday, 30 May 2018)
 */
public class Increment
{
    public static void main(String[]args){
        Integer i = 10;
        Integer j = 11;
        Integer k = ++i;
        System.out.println("k==j is " + (k==j));
        System.out.println("k.equals(j) is " +k.equals(j));
    }
}
