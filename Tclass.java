// 23-07-2024
// boolean expressions

public class Tclass {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;     // without assigning, throws an error
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
}

public class Tclass {
    public static void main(String[] args) {
        int x= 10;
        int y = 9;
        System.out.println(x>y);        //comparison
        System.out.println(x==y);       //equality
    }
}

public class Tclass {
    public static void main(String[] args) {
        int time = 12;
        if(time < 12) {                              // using if block
            System.out.println("Good day.");    
        }
        else if(time == 12) {
            System.out.println("Good afternoon");
        }

        else {
            System.out.println("Good evening");      // else block
        }
    }
}

// switch case

public class Tclass {
    public static void main(String[] args) {
        int day = 4;
        switch(day) {                               // switch b/w chars,ints, etc
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;                                  // break after every case
            default:              // if default is defined first, it gets executed and the rest continue.
                System.out.println("I DON'T KNOW !");    // it doesn't need a break
        }
    }
}


// LOOOOOPs - while loop,do while, for, for each
public class Tclass {
    public static void main(String[] args) {
        int i=0;
        while (i<5) {                // while
            System.out.println(i);
            i++;
        }

        do {                            // do while loop
            System.out.println(i);
            i++;
        }
        while(i<5); 

        for(;i<5;i++) {       //for
            System.out.println(i);            // without any conditions, it runs forever
        }

        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for(String k:cars) {                                // for each loop
            System.out.println(k);
        }

    }
}

public class Tclass {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {                     // break in loops
            // if(i==4) {
            //     break;
            // }
            
            if(i==4) {
                continue;                           // continue in loops
            }
            System.out.println(i);
        }
    }
}


// user input found in java.util package

import java.util.Scanner;
public class Tclass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        System.out.println("Enter username:");
        userName = myObj.nextLine();
        System.out.println("User name is " + userName);
    }
}
