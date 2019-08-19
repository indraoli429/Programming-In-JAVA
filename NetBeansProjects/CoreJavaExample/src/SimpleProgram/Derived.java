
/**
 * Write a description of class Derived here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Wednesday, 30 May 2018)
 */
public class Derived extends Base
{
    public static void foo(Base bObj) {
        System.out.println("In Derived.foo()");
        bObj.bar();
    }

    public void bar() {
        System.out.println("In Derived.bar()");
    }
}
