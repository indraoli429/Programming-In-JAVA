/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TxtFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author indra
 */
public class readCSV {
    public static void main(String []args){
        String csvFile = "/home/indra/file7Column.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] hp=line.split(cvsSplitBy);
                System.out.println(Arrays.deepToString(hp));
                
                LocalDate time = LocalDate.now();
                
                    //Date date = new Date();
                    System.out.println(time);

    String strDateFormat = "hh:mm a";

    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);

    //String formattedDate= dateFormat.format(date);

    //System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }    
}
