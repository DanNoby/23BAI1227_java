
//Person.java
abstract class Animal {
  public abstract void animalSound();// abstract method, no body
  public void sleep() {       //regular method
      System.out.println("Zzz");
  }
}
class Pig extends Animal {
  public void animalSound() {
      System.out.println("The pig says:wee wee");
  }
}
public class Person {
  public static void main(String[] args) {
      Pig myPig = new Pig();
      myPig.animalSound();     
      myPig.sleep();

  private String name;
  // Getter
  public String getName() {
      return name;
  }
  //Setter
  public void setName(String newName) {
      this.name = newName;
  }
  }
}


//Car.java
class Car extends Vehicle {
  private String modelName = "Mustang";

  public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}

class Vehicle {
  protected String brand = "Ford";

  public void honk() {
      System.out.println("Tuut, tuut!");
  }
}

//TestInterface.java
public class TestInterface {
  public static void main(String[] args) {
      Pig myPig = new Pig();
      myPig.animalSound();     
      myPig.sleep();
  }
}
interface Animal {
  public void animalSound();
  public void sleep();
}

class Pig implements Animal {
  public void animalSound() {
      System.out.println("The pig says:wee wee");
  }
  public void sleep() {
      System.out.println("Zzz");
  }
}

//Animal.java
class Pig extends Animal {
  public void animalSound() {
      System.out.println("The pig says:wee wee");
  }
}
class Dog extends Animal {
  public void animalSound() {
      System.out.println("The dog says:bow wow");
  }
}
class Animal {
  public void animalSound() {
      System.out.println("The animal makes a sound");
  }
  public static void main(String[] args) {
      Animal myAnimal = new Animal();
      Animal myPig = new Pig();
      Animal myDog = new Dog();

      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
  }
}

//inoutclass.java
public class inoutclass {
  public static void main(String[] args) {
      
      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.new InnerClass();
      System.out.println(myInner.y + myOuter.x);

      OuterClass.InnerClass myInner = new OuterClass.InnerClass();
      System.out.println(myInner.y);
      

      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.new InnerClass();
      System.out.println(myInner.myInnerMethod());
  }
}
class OuterClass {
  int x= 10;
  class InnerClass {
      public int myInnerMethod() {
          return x;
      }
  }
}


class OuterClass {
  int x = 10;
  
  static class InnerClass {
      int y = 5;
  }
  // class InnerClass {
  //     int y=5;
  // }
}
