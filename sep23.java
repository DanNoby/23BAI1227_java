import java.util.Scanner;

// 1

public class sep23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    int pos_ptr=0, neg_ptr=0;
    while(pos_ptr<=n && neg_ptr<=n) {
      if(pos_ptr<n) {
        while(pos_ptr<n && arr[pos_ptr]<0) {
          pos_ptr++;
        }
        if(pos_ptr<n) {
          System.out.print(arr[pos_ptr]+" ");
          pos_ptr++;
        }
      }
      if(neg_ptr<n) {
        while(neg_ptr<n && arr[neg_ptr]>=0) {
          neg_ptr++;
        }
        if(neg_ptr<n) {
          System.out.print(arr[neg_ptr]+" ");
          neg_ptr++;
        }
      }
    }
  }
}

// 2

public class sep23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }

    int max = arr[0];
    int count = 1;
    for(int i=1; i<n; i++) {
      if(arr[i]>max) count++;
    }
    System.out.println(count);
  }
}

// 3

public class sep23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }

    int jumps = 0;
    int pos = 0;
    while(pos<n-1) {
      if(arr[pos]==0) {
        System.out.println("-1");
        break;
      }
      pos+= arr[pos];
      jumps++;
    }
    if(pos>=n-1) {
      System.out.println(jumps);
    }
  }
}
