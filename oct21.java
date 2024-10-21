import java.io.*;
public class oct21 
{
  public static void main(String[] args) throws IOException {

    //take input until user inputs 'q'
    InputStreamReader cin = null;
    try {
      cin = new InputStreamReader(System.in);
      System.out.println("enter characters,'q' to quit");
      char c;
      do {
        c = (char) cin.read();
        System.out.print(c);
      } while(c!='q');
    }

    finally {
      if(cin!=null) cin.close();
    }

    
    //2
    FileReader in = null;
    FileWriter out = null;
    try {
      in = new FileReader("input.txt");
      out = new FileWriter("output.txt");
      int c;
      while((c=in.read()) != -1) out.write(c);
    }
    finally {
      if(in!=null) in.close();
      if(out!=null) out.close();
    }


    //1
    FileInputStream in = null;
    FileOutputStream out = null;
    try {
      in = new FileInputStream("input.txt");
      out = new FileOutputStream("output.txt");
      int c;
      while((c = in.read()) != -1) {
        out.write(c);
      }
    }
    finally {
      if(in!=null) in.close();
      if(out!=null) out.close();
    }
    
  }
}
