import java.util.StringTokenizer;

public class labwork_7 {
    public static void main(String[] args) {        
        StringTokenizer st = new StringTokenizer("my name is khan"," ");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }                              
        
        StringTokenizer st = new StringTokenizer("my,name,is,khan");
        System.out.println("Next token is:"+st.nextToken(","));            

        StringTokenizer st = new StringTokenizer("Demonstrating methods from String Tokenizer class whether it passes or fails who knows"," ");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());                         
        }                                                   

        StringTokenizer st = new StringTokenizer("Hello everyone I am a Java Developer"," ");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }                                           
            */
            
        StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");
        while(st.hasMoreElements()) {
             System.out.println(st.nextElement());
         }                                               

        System.out.println("Total number of Tokens:"+st.countTokens());
    }
}

// arrays

class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class exercise1 {
    public static void main(String[] args) {   
        // 1
        Student[] arr = new Student[5];
        arr[0] = new Student(1,"aman");
        arr[1] = new Student(2,"vaibhav");
        arr[2] = new Student(3,"Shikar");
        arr[3] = new Student(4,"dharmesh");
        arr[4] = new Student(5,"mohit");
        for(int i=0; i<arr.length; i++) {
            System.out.println("Element at"+i+":"+arr[i].roll_no+" "+arr[i].name);
        }


        //2
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i=0; i<arr.length; i++) {
            System.out.println("Element at index"+i+":"+arr[i]);
        }               
    }
}
