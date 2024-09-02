package ICE31;

import java.io.*;
public class ReaderStreamEx {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("f1.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
