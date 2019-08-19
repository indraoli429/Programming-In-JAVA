
/**
 * Write a description of class StrEqual here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Wednesday, 30 May 2018)
 */
public class StrEqual
{
   public static void main(String []args){
       String s1 = "Hi";
       String s2 = new String("Hi");
       String s3 = "Hi";
       
       if(s1 == s2){
           System.out.println("s1 and s2 equal");
       }
       else{
           System.out.println("s1 and s2 not equal");
       }
       
       if (s1 == s3){
           System.out.println("s1 and s3 equal");
       }
       else{
           System.out.println("s1 and s3 not equal");
        }
   }
}
