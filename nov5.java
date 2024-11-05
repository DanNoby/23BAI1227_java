import java.io.*;

//1
public class nov5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Character a = 'A';
        FileOutputStream fout = new FileOutputStream("file.txt");
        ObjectOutputStream oot = new ObjectOutputStream(fout);
        oot.writeChar(a);
        oot.flush();

        oot.close();
        FileInputStream fin = new FileInputStream("file.txt");
        ObjectInputStream oit = new ObjectInputStream(fin);
        // reading the character
        System.out.println(oit.readChar());
    }
}

class demo implements Serializable {
    String s = "GeeksfoGeeks";

    private void writeObject(ObjectOutputStream out) throws IOException, ClassNotFoundException {
        // demonstrating defaultWriteObject
        out.defaultWriteObject();
    }
}

// 2
// illustrating drain() method
public class nov5 extends ObjectOutputStream {
    public nov5(OutputStream out) throws IOException {
        super(out);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fout = new FileOutputStream("file.txt");
        ObjectOutputStream oot = new ObjectOutputStream(fout);
        nov5 obj = new nov5(oot);

        // illustrating drain()
        obj.drain();

        // closing the underlying stream
        oot.close();
        fout.close();
    }
}

// using an objectinputstream with objectoutputstream

// 3) Serialization
// Create Employee.java file
// content of Employee.java,

// public class Employee implements java.io.Serializable {
// public String name;
// public String address;
// public transient int SSN;
// public int number;

// public void mailCheck() {
// System.out.println("Mailing a check to" + name + " " + "address");
// }
// } //then,

// Serialize demo
public class nov5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan,Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

// 4) Deserialization
public class nov5 {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN); // displays 0 because it can't be serialized
        System.out.println("Number: " + e.number);
    }
}