import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nov11 {
  public static void permute(ArrayList<Integer> list,int start, ArrayList<ArrayList<Integer>> permutations) {
    if(start == list.size() - 1) {
      permutations.add(new ArrayList<>(list));
      return;
    }
    for(int i=start; i<list.size(); i++) {
      Collections.swap(list,i,start);
      permute(list,start+1,permutations);
      Collections.swap(list,i,start);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
      arr.add(sc.nextInt());
    }

    ArrayList<ArrayList<Integer>> permuations = new ArrayList<>();
    permute(arr,0,permuations);
    ArrayList<Integer> sum = new ArrayList<>();
    for(ArrayList<Integer> L : permuations) {
      int tempsum = 0;
      for(int i=0; i<L.size()-1; i++) {
        tempsum += Math.abs(L.get(i) - L.get(i+1));
      }
      tempsum += Math.abs(L.get(L.size()-1) - L.get(0));
      sum.add(tempsum);
    }
    System.out.println(Collections.max(sum));
  }
}
