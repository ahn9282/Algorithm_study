import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int[][] arr = new int[b][a];
        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}