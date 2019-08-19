/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author indra
 */
public class FileWriteNew {

    static String fileName="hello";
    public static void main(String[] args) throws IOException {
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);
        
            fileWriter.write("hello world");//writes the current name to the file. you may need to add a /n or a "," to the name to get approprite line seperations and comas
        System.out.println("vayo");

        fileWriter.flush();
        fileWriter.close();
    }
}
