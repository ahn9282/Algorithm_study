import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int num = 2;

        while(N != 1){
            if(N % num ==0){
                N /= num;
                System.out.println(num);
            }else{
                num++;
            }
        }
        if (N == 1) {
        } else {

        }
    }
}