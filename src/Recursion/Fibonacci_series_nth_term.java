package Recursion;

import java.util.Scanner;

public class Fibonacci_series_nth_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int x ){
        if (x == 1) return 1;
        if (x == 2) return 1;
        int n1 = fibonacci(x-1);
        int n2 = fibonacci(x-2);
        return n1 + n2;
    }
}
