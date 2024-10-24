import java.io.IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//or just import java.io.*;

//Demonstrate working of BufferedInputStream & its methods

public class oct24 {
    public static void main(String[] args) throws IOException {
        // attach the file to FileInputStream
        FileInputStream fin = new FileInputStream("file1.txt"); // create this file beforehand
        BufferedInputStream bin = new BufferedInputStream(fin);

        System.out.println("Number of remaining bytes:" + bin.available()); // available method

        boolean b = bin.markSupported();
        if (b)
            bin.mark(bin.available()); // check if mark is possible and then mark

        bin.skip(4); // skip 4 bytes
        System.out.println("FileContents:");

        // read chars from FileInputStream and then write them
        int ch;
        while ((ch = bin.read()) != -1)
            System.out.print((char) ch);

        bin.reset(); // reset method
        while ((ch = bin.read()) != -1)
            System.out.print((char) ch);

        fin.close();

        //OP: displays file1.txt but skips first 4 bytes
    }
}

// demonstrate FileOutputStream & BufferedOutputStream
public class oct24 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("f1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        // write method
        for (int i = 65; i < 75; i++) {
            bout.write(i);
        }
        byte b[] = { 75, 76, 77, 78, 79, 80 };
        bout.write(b);

        bout.flush(); // FLUSH METHOD(CLEAR BUFFER)
        bout.close(); // close method
        fout.close();

        // output: ABCDEFGHIJKLMNOP
    }
}

// Illustrate forClass() , lookup() and loopup()method
import java.io.ObjectStreamClass;
import java.util.ArrayList;

public class oct24 {
    public static void main(String[] args) throws IOException {
        ObjectStreamClass geeks_stream = ObjectStreamClass.lookup(Number.class);
        ObjectStreamClass quiz_stream = ObjectStreamClass.lookupAny(ArrayList.class);

        // checking class instance
        System.out.println(geeks_stream.forClass()); // OP: class java.lang.Number
        System.out.println(quiz_stream.forClass()); // OP: class java.util.ArrayList
    }
}
