/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleProgram;

/**
 *
 * @author indra
 */
public class Pattern {
     public static void main(String[]args)
    {
        for(int i=6;i>=0;i--) 
        {   
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=0;i<6;i++) 
        {   
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
