import java.util.Scanner;

public class Solution {

    static int[] board;
    static int N;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();
            board = new int[N];
            answer = 0;

            solve(0);

            System.out.println("#" + t + " " + answer);
        }
    }


    private static void solve(int row) {
        if (row == N) {
            answer++;
            return;
        }

        for (int col = 0; col < N; col++) {
            if (canPlace(row, col)) {
                board[row] = col;
                solve(row + 1);
            }
        }
    }

  
    private static boolean canPlace(int row, int col) {
        for (int i = 0; i < row; i++) {
       
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
