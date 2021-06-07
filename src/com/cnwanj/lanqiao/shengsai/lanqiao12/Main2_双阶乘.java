package com.cnwanj.lanqiao.shengsai.lanqiao12;

import java.util.Scanner;

/**
 * 试题 B: 双阶乘
 *
 * 本题总分：5 分
 *
 * 【问题描述】
 * 一个正整数的双阶乘，表示不超过这个正整数且与它有相同奇偶性的所有
 * 正整数乘积。n 的双阶乘用 n!! 表示。
 * 例如：
 * 3!! = 3 × 1 = 3。
 * 8!! = 8 × 6 × 4 × 2 = 384。
 * 11!! = 11 × 9 × 7 × 5 × 3 × 1 = 10395。
 *
 * 请问，2021!! 的最后 5 位（这里指十进制位）是多少？
 * 注意：2021!! = 2021 × 2019 × · · · × 5 × 3 × 1。
 * 提示：建议使用计算机编程解决问题。
 *
 * 【答案提交】
 * 这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一
 * 个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */
public class Main2_双阶乘 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 1;
        int i = n % 2 == 0 ? 2 : 1;
        for (; i <= n; i += 2) {
            sum *= i;
            sum %= 100000;
            System.out.println(i + " " + sum);
        }
    }
}
