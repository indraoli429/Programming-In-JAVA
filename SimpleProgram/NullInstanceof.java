
/**
 * Write a description of class NullInstanceof here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Wednesday, 30 May 2018)
 */
public class NullInstanceof
{
    public static void main(String[]args){
        String str = null;
        if(str instanceof Object)
            System.out.println("str is object");
        else
            System.out.println("str is not Object");
    }
}
