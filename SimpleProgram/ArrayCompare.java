
/**
 * Write a description of class ArrayCompare here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Wednesday, 30 May 2018)
 */
public class ArrayCompare
{
    public static void main(String []args){
        int []arr1 = {1, 2, 3, 4, 5};
        int []arr2 = {1, 2, 3, 4, 5};
        System.out.println("arr1 ==arr2 is "+(arr1 ==arr2));
        System.out.println("arr1.equals(arr2) is "+arr1.equals(arr2));
        System.out.println("Arrays.equals(arr1, arr2) is " +java.util.Arrays.equals(arr1, arr2));
    }
}
