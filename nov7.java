//Collection Framework

//file handling and collection framework will be asked for PAT6
import java.io.*;
import java.util.*;

public class nov7 {

    // ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            al.add(i); // appending elements
        }
        System.out.println(al);
        al.remove(3); // removes at index 3
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " "); // get() to retrieve value
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            LL.add(i);
        }
        System.out.println(LL);
        LL.remove(3);
        System.out.println(LL);
        for (int i = 0; i < LL.size(); i++) {
            System.out.print(LL.get(i) + " ");
        }
    }

    // Vector ***V_IMP -> Vector is SYNCHRONIZED while ArrayList is NON-SYNCHRONIZED
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }

    // Stack
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");
        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        stack.pop();
        itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    // treeset sorts in ASCII value in OP
    // HashMap
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        System.out.println("Value for 1 is " + hm.get(1));
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    // Learn what a red-black tree is,
    // TreeMap is based on red-black tree implementation : No null keys but null
    // values can exist

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");

        System.out.println("Before invoking remove method");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // remove method
        map.remove(102);
        System.out.println("After invoking remove method");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    // ---------------

    // Generics (it's like templates in C++)
    // V_IMP

}
// SELF STUDY PORTION: Generics
