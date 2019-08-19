package OCA_JAVA8;
/**
 * Write a description of class Example2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example2
{
    public static void main(String [] args){
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1)); 
    }
}
