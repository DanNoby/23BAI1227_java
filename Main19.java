import java.util.Scanner;
/* 
public class Main19 {
    public static void main(String[] args) {
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        System.out.println(a+" "+i+" "+j);
    }
    
} 
public class Main19 {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        int i = a.intValue();
        int j = a;
        a.intValue();
        int j = a;
        System.out.println(a+" "+i+" "+j);
    }
}


// 1

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int o=0; o<n; o++) {   
            if(o%2==0 && arr[o]%2==1) {
                System.out.print(arr[o]+" ");
            }
        }
    }
}


public class Main19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int num = sc.nextInt();

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==j)
                    continue;
                if(arr[i]+arr[j]==num)
                    System.out.format("(%d, %d) ",arr[i],arr[j]);
            }
        }
    }
}
*/

import java.util.Scanner;

public class Main19 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int beg = 0;
        int end = n-1;
        while(beg <= end) {
            if(arr[beg] == 0) {
                int temp = arr[beg];
                arr[beg] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                beg++;
            }
        }

        for(int o = 0; o < n; o++)
            System.out.print(arr[o] + " ");
    }
}



