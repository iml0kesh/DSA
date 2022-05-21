package Recursion;

import java.util.Scanner;

public class SumOf_N_naturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("0");
        }
        else{
            System.out.println(SumFunction(n));
        }
    }

    static int SumFunction(int x ){
        if(x == 1) return 1;
        return x + SumFunction(x-1);
    }
}
