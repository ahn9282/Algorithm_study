class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                for(int k =0 ; k < arr2[0].length;k++){
                    arr[i][k] += arr1[i][j] * arr2[j][k];
                }
            }

        }
        return arr;
    }
}