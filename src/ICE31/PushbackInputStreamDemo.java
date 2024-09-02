package ICE31;// Java code illustrating unread() method
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
public class PushbackInputStreamDemo
{
    public static void main(String[] arg) throws Exception
    {
        PrintWriter pw = new PrintWriter(System.out, true);
        String str = "GeeksforGeeks a computer science portal ";
        byte b[] = str.getBytes();
        ByteArrayInputStream bout = new ByteArrayInputStream(b);
        PushbackInputStream push = new PushbackInputStream(bout);

        int c;
        while((c=push.read())!=-1)
        {
            pw.print((char)c);
        }
        pw.println();

        // unread method
        push.unread(b);
        push.unread(b, 0, 6);

        while((c=push.read())!=-1)
        {
            pw.print((char)c);
        }
        pw.println();
        pw.close();
    }
}

