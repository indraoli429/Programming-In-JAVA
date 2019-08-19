/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileWrite;

/**
 *
 * @author indra
 */
public class Test {

    public static void main(String[] args) {
        String a = "fghj";
        
        try{
            int aa=Integer.parseInt(a);
            if (a.equals(Integer.toString(aa))) {
            System.out.println(a + " is an integer");
        }
        }
        catch(NumberFormatException ex){
            System.out.println(a + " is not an integer");
        }
    }

}
