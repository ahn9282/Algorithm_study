import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try{
                
            int a = Integer.parseInt(sc.next());
            int b =  Integer.parseInt(sc.next());

            System.out.println((a + b));
            }catch(Exception e){
                break;
            }
        }


    }
}
