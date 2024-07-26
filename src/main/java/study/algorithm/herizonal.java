package study.algorithm;

import java.util.Arrays;

public class herizonal {

    public static void main(String[] args) {
    int[][] arr = new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.print("original Array : ");

        System.out.print("sorted Array : ");
        int[][] array1 = Arrays.stream(arr)
                .sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new);

    }
}

