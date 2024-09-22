class Parent {
    void Print() {System.out.println("parent class"); }
}

class subclass1 extends Parent {
    void Print() { System.out.println("subclass1"); }
}

class subclass2 extends Parent {
    void Print() {System.out.println("subclass2");}
}

public class GFG {
    public static void main(String[] args) {
        Parent a;
        a = new subclass1();
        a.Print();
        a = new subclass2();
        a.Print();
    }    
}

//Helper.java

class Helper {
    static int Multiply(int a,int b) {
        return a*b;
    }
    static double Multiply(double a, double b) {
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(Helper.Multiply(2,4));
        System.out.println(Helper.Multiply(5.5,6.3));
    }
}


class Helper {
    static int Multiply(int a, int b) {
        return a*b;
    }
    static int Multiply(int a, int b, int c) {
        return a*b*c;
    }
    public static void main(String[] args) {
        System.out.println(Helper.Multiply(2,4));
        System.out.println(Helper.Multiply(2,7,3));
    }
}

