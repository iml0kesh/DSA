package Recursion;

import java.util.Scanner;

public class Factorial {
    static int fact(int x){
        if(x == 0) return 1;
        return x*fact(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of :- ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Error");
        }
        else {
            System.out.println(n + "!" + " = " + fact(n));
        }
    }
}
