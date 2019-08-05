/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TxtFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author indra
 */
public class OSTypes {

    public static void main(String[] args) throws IOException {

        try (FileOutputStream f = new FileOutputStream(new File("/home/indra/Sagarmatha/file3.csv")); DataOutputStream d = new DataOutputStream(f);) {

            for (int i = 0; i <= 9; i++) {
                d.writeByte(i);
                d.writeShort(i);
                d.writeInt(i);
                d.writeLong(i);
                d.writeFloat(i);
                d.writeDouble(i);
            }
            System.out.println("Data Written");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception has occured");
        } catch (IOException ex) {
            Logger.getLogger(OSTypes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (FileInputStream fis = new FileInputStream(new File("E://DOSTest.data")); DataInputStream dis = new DataInputStream(fis);) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(dis.readByte()+"--"+dis.readShort()+"--"+dis.readInt()+"--"+dis.readLong()+"--"+dis.readFloat()+"--"+dis.readDouble());
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OSTypes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
