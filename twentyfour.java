import java.util.*;
public class twentyfour {
    public static void main(String[] args) {

        //1
        char[] helloArray = {'h','e','l','l','o'};
        String helloString = new String(helloArray);    //displays a string
        System.out.println(helloString);            

        //exercise
        Scanner obj = new Scanner(System.in);
        int choice = 0;
        while(true) {
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.remainder");
            System.out.println("6.exponential");
            System.out.println("7.exit");       // menu

            choice = obj.nextInt();         // menu choice
            System.out.println("-----");
            int num1 = obj.nextInt();
            int num2 = obj.nextInt();       // recieving two inputs from user
            switch(choice) {
                case 1:
                    System.out.println("sum: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("diff" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("product:" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("quotient: " + ((double) num1 / num2));
                    break;
                case 5:
                    System.out.println("remainder: " + (num1 % num2));
                    break;
                case 6:
                    System.out.println("exponential: " + (Math.pow(num1,num2)));
                    break;
                case 7:
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
