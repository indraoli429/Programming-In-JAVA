
/**
 * Write a description of class Base here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Wednesday, 30 May 2018)
 */
public class Base
{
   public static void foo(Base bObj){
       System.out.println("In Base.foo()");
       bObj.bar();
   }
   
   public void bar() {
       System.out.println("In Base.bar()");
    }
}
