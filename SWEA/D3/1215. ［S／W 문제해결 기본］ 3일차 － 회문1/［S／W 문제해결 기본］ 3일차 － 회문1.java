import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
 static int[][] arr;
    static int N, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iter = 10;

        for (int i =0; i < iter; i++) {

            arr = new int[8][8];
            answer = 0;
            N = Integer.parseInt(br.readLine());

            for (int Y = 0; Y < 8; Y++) {

                String str = br.readLine();

                for (int X = 0; X < 8; X++) {
                    int c = str.charAt(X) - 'A';
                    arr[Y][X] = c;
                }
            }
            for (int Y = 0; Y < 8; Y++) {
                for (int X = 0; X < 8; X++) {
                    validWord(Y, X);
                }
            }
            System.out.println("#" + (i + 1) + " " + answer);
        }
    }



    static void validWord(int y, int x) {

        if (x + N <= 8) {
            boolean isPalindrome = true;
            for (int i = 0; i < N / 2; i++) {
                if (arr[y][x + i] != arr[y][x + N - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) answer++;
        }

        if (y + N <= 8) {
            boolean isPalindrome = true;
            for (int i = 0; i < N / 2; i++) {
                if (arr[y + i][x] != arr[y + N - 1 - i][x]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) answer++;
        }
    }
}
