package com.cnwanj.lanqiao.dasai.begin;

import java.util.Scanner;

public class Demo03_εΊεζ±ε {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        if(n >= 1 && n <= 1000000000){
            long sum = (1 + n)*n/2;
            System.out.println(sum);
        }
    }
}
