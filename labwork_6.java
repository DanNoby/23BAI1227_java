// 30-07-2024

public class thirty {
    public static void main(String[] args) {
        
        // String buffer methods
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        sb.insert(1, "Java");
        sb.replace(1, 3, "Java");
        sb.delete(1, 3);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity()); // 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // still 16
        sb.append("javais my favorite language");
        System.out.println(sb.capacity()); // 16*2 + 2 = 34

        sb.ensureCapacity(10); // no change
        System.out.println(sb.capacity()); // still34
        sb.ensureCapacity(50); // 34*2 +2 = 70
        System.out.println(sb.capacity()); // displays 70

        // String Builder methods
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);

        sb.insert(1, "Java");
        System.out.println(sb);

        sb.replace(1, 3, "Java");
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        System.out.println(sb);


        // exercise
        System.out.println("No of elements in array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // delcaring array

        System.out.println("enter elements below:");
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt(); // taking input
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // bubble sorting the array
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Third largest element is " + arr[n - 3]);// third largest from the sorted array
    }
}
