
/**
 * Write a description of class InstanceAndLocalVariable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InstanceAndLocalVariable
{
   static String name; //it (instance variable) has default value
   public static void main(String[]args){
       int a; //it (local variable) has no default value
       System.out.println("Instance Variable or Class level variable: "+name);
       //System.out.println("Local Variable or Method level variable: "+a);       
   }
}
