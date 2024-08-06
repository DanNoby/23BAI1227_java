public class labwork_8 {
    public static void main(String[] args) {
        int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };
        int cloneArray[][] = intArray.clone();
        System.out.println(intArray == cloneArray);
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);

        Student[] myStudents = new Student[] { new Student("Dharma"), new Student("sanvi"), new Student("Rupa"),
                new Student("Ajay") };
        for (Student m : myStudents) {
            System.out.println(m);
        }

        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        System.out.println("Trying to access element outside the size of the array");
        System.out.println(arr[5]);

        int[][] arr = new int[10][20];
        arr[0][0] = 1;
        System.out.println("arr[0][0]=" + arr[0][0]);

        int[][][] arr = new int[10][20][30];
        arr[0][0][0] = 1;
        System.out.println("arr[0][0][0]=" + arr[0][0][0]);

        int arr[] = m1();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass()); // imp
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());

        int intArray[] = { 1, 2, 3 };
        int cloneArray[] = intArray.clone(); // deep copy
        System.out.println(intArray == cloneArray);
        for (int i = 0; i < cloneArray.length; i++)
            System.out.print(cloneArray[i] + " ");

    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("sum of array values:" + sum);
    }

    public static int[] m1() {
        return new int[] { 1, 2, 3 };
    }

}
