
/**
 * Write a description of class PrLanguage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrLanguage
{
   String name;
   PrLanguage()
   {
       System.out.println("Constructor method called");
   }
   PrLanguage(String t) //Parameterized constructor
   {
       name = t;
   }
   public static void main(String[] args)
   {
       PrLanguage cpp = new PrLanguage();
       PrLanguage Java = new PrLanguage("Java");
       cpp.setName("C++");
       Java.getName();
       cpp.getName();
   }
   void setName(String t)
   {
   name = t; 
   }
   void getName()
   {
       System.out.println("Programming language name: "+name);
   }
}
