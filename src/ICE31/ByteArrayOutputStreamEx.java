package ICE31;
//
//import java.io.ByteArrayOutputStream;
//import java.io.FileOutputStream;
import java.io.*;
// public class ByteArrayOutputStream extends OutputStream
public class ByteArrayOutputStreamEx{
    public static void main(String args[])throws Exception{
        FileOutputStream fout1=new FileOutputStream("D:\\Java Code\\Text\\f1.txt");
        FileOutputStream fout2=new FileOutputStream("D:\\Java Code\\Text\\f2.txt");
//        "D:\ACC REC\Java Code\f1.txt"
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
       // ByteArrayInputStream bin = new ByteArrayInputStream();
        //bin.read(fout1);
        bout.write(65);
        bout.write(67);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
//      bout.flush();
//      bout.close();//has no effect
        System.out.println("Success...");
    }
}   