import java.time.LocalDateTime;                     
import java.time.format.DateTimeFormatter;          // to format the localdatetime
 
public class week6_1 {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("before formatting:" + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting:" + formattedDate);
    }
}
//note differences bw overloading & overriding

import java.util.Scanner;
class AP {
    int f,d,n,k,p,q;
    AP() {
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        p = sc.nextInt();
        q = sc.nextInt();
    }
    public void A_n() {
        int an = f+(n-1)*d;
        System.out.println(an);
    }
    public void r() {
        int r =0;
        int ap = f;
        while(ap!=k) {
            ap = ap+d;
            r++;
        }
        System.out.println(r);
    }
    public void absdiff() {
        int ap = f + (p-1)*d;
        int aq = f + (q-1)*d;
        System.out.println(Math.abs(ap-aq));
    }
}

class week6_1 {
    public static void main(String[] args) {
        AP arithprog = new AP();
        arithprog.A_n();
        arithprog.r();
        arithprog.absdiff();
    }
}

//Programmer.java

class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
//hybrid and multiple inhertience classes are only supported through interfaces

//TestInheritance2.java


class Animal { void eat() {System.out.println("eating...");} }
class Dog extends Animal { void bark() {System.out.println("barking...");} }
class BabyDog extends Dog { void weep() {System.out.println("weeping...");} }

class Cat extends Animal { void meow() {System.out.println("meowing...");} }

class TestInheritance2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        //c.bark() won't work
        Dog d = new Dog();
        d.bark();
    }
} 

public class TestInheritance2 {
    public static void main(String[] args) {
        BabyDog d= new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    } 
}
