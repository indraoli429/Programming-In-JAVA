/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TxtFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author indra
 */

public class TxtFileReaderDemo2 {

    public static void main(String[] args) throws IOException {
    // TODO code application logic here

    // // read KeyWestTemp.txt

    // create token1
    String token1 = "";

    // for-each loop for calculating heat index of May - October

    // create Scanner inFile1
    Scanner inFile1 = new Scanner(new File("/home/indra/Sagarmatha/file3.csv")).useDelimiter(",\\s*");

    // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
    // List<String> temps = new LinkedList<String>();
    List<String> temps = new ArrayList<String>();

    // while loop
    while (inFile1.hasNext()) {
      // find next line
      token1 = inFile1.next();
      temps.add(token1);
    }
    inFile1.close();

    String[] tempsArray = temps.toArray(new String[0]);

    for (String s : tempsArray) {
      System.out.println(s);
    }
  }
}