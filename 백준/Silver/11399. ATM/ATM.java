import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   	
    	int humans = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int time[] = new int[humans];
   	
    	for (int i = 0; i < humans; i++) {
    		time[i] = Integer.parseInt(st.nextToken());
		}
   	
    	int sum = 0;
    	int totalSum = 0;
  	
    	Arrays.sort(time);
   
    	for (int i = 0; i < humans; i++) {
			sum += time[i];
			totalSum += sum;
		}
   	
    	bw.write(String.valueOf(totalSum));
  	
    	bw.close();
    	br.close();
    }
}