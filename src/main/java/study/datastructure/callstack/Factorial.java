package study.datastructure.callstack;

public class Factorial {

    public static int factorial(int value) {
        if(value == 1)return 1;
        return value * factorial(value - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(7));

    }
}
