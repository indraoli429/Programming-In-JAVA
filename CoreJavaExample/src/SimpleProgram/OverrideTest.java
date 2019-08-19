
/**
 * Write a description of class OverrideTest here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Wednesday, 30 May 2018)
 */
public class OverrideTest
{
    public static void main(String []args) {
        Base bObj = new Derived();
        bObj.foo(bObj);
    }
}
