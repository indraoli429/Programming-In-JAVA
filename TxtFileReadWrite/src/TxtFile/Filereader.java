/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TxtFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author indra
 */
public class Filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("/home/indra/file4.csv"));
            //BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(new File("/home/indra/file4.csv"));
           // BufferedWriter bfr = new BufferedWriter(fw);
            int a=0;
            while((a=fr.read())!=-1)
            {
                System.out.print((char)a);
                fw.write((char)a);
                fw.write("hello indra");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception has occured");
        } catch (IOException ex) {
            Logger.getLogger(Filereader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
