package Recursion;

import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = sc.nextInt();
        System.out.println("enter the power of the number: ");
        int b = sc.nextInt();
        System.out.println(a+" power "+b+" = "+pow(a,b));
    }

    static long pow(int x, int y){
        if(y == 0) return 1;
        long res1 = pow(x , y-1);
        return x * res1;
    }
}
