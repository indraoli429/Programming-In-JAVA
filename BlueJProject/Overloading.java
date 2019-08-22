
/**
 * Write a description of class Overloading here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Overloading
{
   static String getName(String a){
       return a;
   }
   static String getName(String a, String b){
       return a+b;
   }
   static String getName(String a, String b, String c){
       return a+b+c;
   }
   public static void main(String[]args){
       //System.out.println(getName("Indra"));
       //System.out.println(getName("Indra ", "Bahadur"));
       System.out.println(getName("Indra ", "Bahadur ", "Oli"));
   }
}
