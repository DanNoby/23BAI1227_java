import java.util.Scanner;
public class sep30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1
    int streak = 0;
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    int max_streak = 0;
    for(int i=0; i<n-1; i++) {
      if(arr[i] < arr[i+1]){
        streak++;
      }
      else{
        max_streak = streak;
        streak = 0;
      }
    }
    if(max_streak==0) max_streak = streak;
    System.out.println(max_streak);

    // 2  
    int n = sc.nextInt(); 
    int[] arr = new int[n]; 
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int[] stack = new int[n];
    int ptr = -1;  
    
    for (int i = 0; i < n; i++) {
      if(n%2==1 && i==n/2) continue;
      else if (ptr == -1 || arr[i] != stack[ptr]) {
        ptr++;
        stack[ptr] = arr[i];
      } 
      else {
        ptr--;
      }
    }
    if (ptr == -1 || (n%2==1 && ptr==0)) {
      System.out.println("true");  
    } 
    else {
      System.out.println("false");  
    }

    //3
    String s=sc.nextLine();
    String p=sc.nextLine();
    int[] charCountP = new int[256];
    int[] windowCount = new int[256];

  
    for (int i = 0; i < p.length(); i++) {
      charCountP[p.charAt(i)]++;
    }

    int left = 0, right = 0, minLength = Integer.MAX_VALUE, start = -1;
    int count = 0;


    while (right < s.length()) {
      char currentChar = s.charAt(right);
      windowCount[currentChar]++;

      if (charCountP[currentChar] != 0 && windowCount[currentChar] <= charCountP[currentChar]) {
        count++;
      }

      while (count == p.length()) {
        if (right - left + 1 < minLength) {
          minLength = right - left + 1;
            start = left;
        }

        char leftChar = s.charAt(left);
        windowCount[leftChar]--;          
        if (charCountP[leftChar] != 0 && windowCount[leftChar] < charCountP[leftChar]) {
          count--;
        }
        left++;
      }
      right++;
    }
    System.out.println(s.substring(start, start + minLength));

    //4
    int repeatingnum=-1, missingnum=-1;
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
        int temp = arr[arr[i] - 1];
        arr[arr[i] - 1] = arr[i];
        arr[i] = temp;
      }
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] != i + 1) {
        missingnum = i + 1;
        break;
      }
    }

    int c=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(arr[i]==arr[j]){
          c++;
        }
      }
      if(c==2){
        repeatingnum = arr[i];
        break;
      }
      c=0;
    }
    System.out.println(repeatingnum+" "+missingnum);

    //5
    String str=sc.nextLine();
    int n = str.length();
    int[] lps = new int[n];
    int length = 0;
    int i = 1;
    lps[0] = 0;
    while (i < n) {
      if (str.charAt(i) == str.charAt(length)) {
        length++;
        lps[i] = length;
        i++;
      } 
      else {
        if (length != 0) {
          length = lps[length - 1];
        } 
        else {
          lps[i] = 0;
          i++;
        }
      }
    }
    System.out.println(lps[n-1]);
  }
}
