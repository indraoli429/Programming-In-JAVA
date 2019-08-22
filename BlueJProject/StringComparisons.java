
/**
 * Write a description of class StringComparisons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * The equals() method compares two strings, character 
 * bycharacter, to determine equality. This is not the default 
 * im‐plementation of the equals() method provided by the Object 
 * class. This is the overridden implementation providedby String
 * class.
 * 
 * The  ==  operator  checks  to  see  whether  two  object  
 * refer‐ences refer to the same instance of an object.
   */
public class StringComparisons
{
    // Add string to pool  
    String first = "chairs";
    // Use string from pool  
    String second = "chairs";
    // Create a new string  
    String third = new String ("chairs");
    void myMethod() {
        // Contrary to popular belief, this evaluates
        // to true. Try it!
        if (first == second) {
            System.out.println("first == second");  
        }
        // This evaluates to true
        if (first.equals(second)) {
            System.out.println("first equals second");  
        }
        // This evaluates to false
        if (first == third) {    
            System.out.println("first == third");  
        }
        // This evaluates to true
        if (first.equals(third)) {
            System.out.println("first equals third");  
        } 
    } // End myMethod()
} //end class
