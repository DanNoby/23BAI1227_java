public class Labwork_9 {
    /*int x;
    int x=5;
    int x;
    int x = 10;
    final int x = 10;
    String fname="John";
    String lname ="Doe";
    int age = 24; */        // all variables initialized
    public Labwork_9(int y) {       // parameterized constructor
            x=y;
    }
    public static void main(String[] args) {
        Labwork_9 myobj = new Labwork_9(5);
        System.out.println(myobj.x);            
    }

        //everything done in main
        Labwork_9 myobj = new Labwork_9();
        Labwork_9 myobj1 = new Labwork_9();
        System.out.println(myobj.x);       
        System.out.println(myobj.x);
        System.out.println(myobj1.x);

        Second myobj = new Second();
        System.out.println(myobj.x);

        Labwork_9 myobj = new Labwork_9();
        myobj.x = 25;
        System.out.println(myobj.x);
        
        Labwork_9 myobj = new Labwork_9();
        myobj.x=25;
        System.out.println(myobj.x);

        Labwork_9 myobj1 = new Labwork_9();
        Labwork_9 myobj2 = new Labwork_9();
        myobj2.x = 25;
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);

        Labwork_9 myobj = new Labwork_9();
        System.out.println("Name: "+myobj.fname+" "+myobj.lname);
        System.out.println("Age: "+myobj.age);

    static void myMethod() {
        System.out.println("Hello World!");
    }


    // all the functions defined
    public static void main(String[] args) {
        myStaticMethhod();
        Labwork_9 myobj = new Labwork_9();
        myobj.myPublicMethod();        
    }
    static void myStaticMethhod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }


    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Maxspeed is: "+maxSpeed);
    }
    public static void main(String[] args) {
        Labwork_9 myCar = new Labwork_9();
        myCar.fullThrottle();
        myCar.speed(200);
    }

    public Labwork_9() {
        x = 5;
    }
    public static void main(String[] args) {
        Labwork_9 myobj = new Labwork_9();
        System.out.println(myobj.x);
    }

}
    

// contents of Second.java
public class Second {
    int x = 5;
}
