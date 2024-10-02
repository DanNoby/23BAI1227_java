import java.util.Scanner;
// 1

public class oct1{
    public static double ComputeArea(int r){
        return 3.14*r*r;
    }
    public static double ComputeArea(int a,int b,int c){
        return ((a+b)/2 )*c;
    }
    public static double ComputeArea(int x,int y){
        return x*y;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int a4=sc.nextInt();
        int a5=sc.nextInt();
        int a6=sc.nextInt();
        System.out.printf("%.2f\n%.2f\n%.2f\n",ComputeArea(a1,a2),ComputeArea(a3,a4,a5),ComputeArea(a6));
    }
}

import java.util.Scanner;
public class oct1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(w);
        if(n>6){
            for(int j=0;j<8;j++){
                if(j==r+1 || j==r-1){
                    System.out.println(j+","+c);
                }
                else if(j==c-1 || j==c+1){
                    System.out.println(r+","+j);
                }
            }
            System.out.println((r-1)+","+(c+1));System.out.println((r-1)+","+(c-1));System.out.println((r+1)+","+(c+1));System.out.println((r+1)+","+(c-1));
        }
        else{
            System.out.println(r+","+(c+1));
        }
    }
}

// 3
class Pizza {
    int veg_chicken;
    int radius;
    String[] ingredient1;
    double[] quantity;
    String[] ingredient2;
    double[] cost100gm;

    public Pizza(int veg_chicken, int radius, String[] ingredient1, double[] quantity, String[] ingredient2,
                 double[] cost100gm) {
        this.veg_chicken = veg_chicken;
        this.radius = radius;
        this.ingredient1 = ingredient1;
        this.quantity = quantity;
        this.ingredient2 = ingredient2;
        this.cost100gm = cost100gm;
    }

    public double calculateCost() {
        double cost = (veg_chicken == 0) ? 50: 100;
        double area = 3.14*radius*radius; 

        for (int i = 0; i < ingredient1.length; i++) {
            for (int j = 0; j < ingredient2.length; j++) {
                if (ingredient2[j].equals(ingredient1[i])) {
                    double costForIngredient = (cost100gm[j] / 100) * quantity[i];
                    cost += (costForIngredient * area); 
                }
            }
        }
        return cost;
    }
}
public class oct1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veg_chicken = sc.nextInt();
        int radius = sc.nextInt();
        int n1 = sc.nextInt();
        String[] ingredient1 = new String[n1];
        double[] quantity = new double[n1];

        for (int i = 0; i < n1; i++) {
            ingredient1[i] = sc.next(); 
            quantity[i] = sc.nextDouble(); 
        }

        int n2 = sc.nextInt();
        String[] ingredient2 = new String[n2];
        double[] cost100gm = new double[n2];

        for (int i = 0; i < n2; i++) {
            ingredient2[i] = sc.next(); 
            cost100gm[i] = sc.nextDouble();
        }

        Pizza P = new Pizza(veg_chicken, radius, ingredient1, quantity, ingredient2, cost100gm);

        System.out.printf("%.2f", P.calculateCost());
    }
}


