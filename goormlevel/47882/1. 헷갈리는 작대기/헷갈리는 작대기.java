import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		for(char c : arr){
			if( c =='1'){
				count1++;
			}
				if( c =='I'){
				count2++;
			}
				if(c=='l'){
				count3++;
			}
				if(c=='|'){
				count4++;
			}
		}
	System.out.println(count1);
			System.out.println(count2);
			System.out.println(count3);
			System.out.println(count4);
		
	}
}