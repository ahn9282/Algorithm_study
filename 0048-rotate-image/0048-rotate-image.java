class Solution {
     public void rotate(int[][] matrix) {

        int len = matrix.length;
        int[][] result = new int[len][len];

        for (int x = 0; x < len; x++) {
            for (int y = len - 1; y >= 0; y--) {
                int val = matrix[y][x];
                result[x][len-1-y] = val;
            }
        }
        for (int i = 0; i < len; i++) {
            System.arraycopy(result[i],0, matrix[i],0, len);
        }
    }
}