import java.io.*;

// (don't create any of the input files seperately, it's automatic)
public class oct22 { // fileStreamTest
    public static void main(String[] args) throws IOException {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}// ops binary gibberish



//converting characters to uppercase
public class oct22 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
        while (bOutput.size() != 10) {
            bOutput.write("hello".getBytes());
        }
        byte b[] = bOutput.toByteArray();
        System.out.println("Print the content");
        for (int x = 0; x < b.length; x++) {
            System.out.print((char) b[x] + " ");
        }
        System.out.println(" ");
        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("Converting characters to Upper case");
        for (int y = 0; y < 1; y++) {
            while ((c = bInput.read()) != -1) {
                System.out.println(Character.toUpperCase((char) c));
            }
            bInput.reset();
        }
    }
}


//read 5 lines from test.txtand convert lines into capital letters and copy to test1.txt
public class oct22 {
    public static void main(String[] args) throws IOException { // DataInput Stream

        // writing string to a file encoded as modified UTF-8
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("D:\\23BAI1227\\file.txt"));
        dataOut.writeUTF("hello");

        // reading data from the same file
        DataInputStream dataIn = new DataInputStream(new FileInputStream("D:\\23BAI1227\\file.txt"));
        while (dataIn.available() > 0) {
            String k = dataIn.readUTF();
            System.out.print(k + " ");
        }
    }
}
