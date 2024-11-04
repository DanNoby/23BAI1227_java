import java.io.*;
public class nov4 {
  public static void main(String[] args) throws IOException {
    // ObjectOutputInputStream
    FileOutputStream out = new FileOutputStream("Geeks.txt");
    ObjectOutputStream outStream = new ObjectOutputStream(out);
    ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("Geeks.txt"));

    outStream.writeBoolean(true);
    outStream.writeUTF("Geeks for Geeks");
    outStream.flush();

    //readBoolean()
    System.out.println("Use of readBoolean(): "+inStream.readBoolean());
    System.out.println("Use of read() method in java: ");

    //read() method
    for(int i=0; i<inStream.available();) {
      System.out.print((char) inStream.read());
    }

    //using buffer
    FileOutputStream out = new FileOutputStream("Geeks.txt");
    ObjectOutputStream outStream = new ObjectOutputStream(out);
    ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("Geeks.txt"));

    outStream.writeBoolean(true);
    outStream.writeUTF("Geeks for Geeks");
    outStream.flush();

    //new 
    byte[] buffer = new byte[25];
    inStream.read(buffer,2,20);
    System.out.println("Use of read(buffer,offset,maxlen): ");
    for(int i=0; i<20; i++) {
      System.out.print((char)buffer[i]);
    }
  }
}

