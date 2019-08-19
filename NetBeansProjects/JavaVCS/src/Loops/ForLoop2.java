/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author indra
 */
public class ForLoop2 {
    public static void main (String []args){
       for(int i=1; i<=5; i++){
           for(int j=i; j>=1; j--){
               System.out.print(j);
           }
           for(int k=2;k<=i; k++){
                   System.out.print(k);
               }
           System.out.println();
       }
       System.out.println();
   }
}
