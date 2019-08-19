/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TxtFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suyash
 */
public class TokenizerTest {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No suitable input");
            System.exit(0);
        } else {
            String filename = args[0];
            try {
                Set<String> wordSet = new TreeSet<>();
                Scanner sc = new Scanner(new FileReader(filename));
                sc.useDelimiter("\\W");
                while (sc.hasNext()) {
                    wordSet.add(sc.next().toLowerCase());
                }

                for (String word : wordSet) {
                    System.out.println(word);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TokenizerTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
