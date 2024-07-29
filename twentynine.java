import java.util.*;

public class twentynine {
    public static void main(String[] args) {
    
        // 1
        Scanner sc = new Scanner(System.in);                    // Scanner object
        
        
        System.out.println("enter the limiting range:");        
        int range = sc.nextInt();                                   // limiting range input
        for (int num=1; num <= range ; num++) {
            int temp = num;                                         // storing original
            int sum=0;                                              // initializing sum
            while(temp > 0) {                           
                int r = temp%10;
                sum+= Math.pow(r,3);
                temp = temp/10;
            }
            if(num == sum) {
                System.out.println(num+" is an armstrong number");
            }
        }
    
    // 2 
        for(int i=0; i<10; i++) {
            if(i==0 || i==9) {
                String top = "";
                for(int j=0; j<20; j++) {
                    top += "*";
                }
                System.out.println(top);
            }
            else {
                System.out.println("*\t\t   *");
            }
        }
     
    // 3
        System.out.println("enter two numbers below:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int small = (a<b)?a:b;
        int HCF = 1;
        for(int i=1; i<=small ; i++) {
            if(a%i == 0 && b%i == 0) {
                HCF = i;
            }
        }
        int LCM = (a * b)/HCF;
        System.out.format("The LCM of %d and %d is %d",a,b,LCM);
    }
}


