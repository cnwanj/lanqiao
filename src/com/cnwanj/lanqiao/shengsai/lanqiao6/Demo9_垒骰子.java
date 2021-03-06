package com.cnwanj.lanqiao.shengsai.lanqiao6;

import java.util.Scanner;

/**
 * 垒骰子
 *
 * 赌圣atm晚年迷恋上了垒骰子，就是把骰子一个垒在另一个上边，不能歪歪扭扭，要垒成方柱体。
 *
 * 经过长期观察，atm 发现了稳定骰子的奥秘：有些数字的面贴着会互相排斥！
 *
 * 我们先来规范一下骰子：1 的对面是 4，2 的对面是 5，3 的对面是 6。
 *
 * 假设有 m 组互斥现象，每组中的那两个数字的面紧贴在一起，骰子就不能稳定的垒起来。
 *
 * atm想计算一下有多少种不同的可能的垒骰子方式。
 *
 * 两种垒骰子方式相同，当且仅当这两种方式中对应高度的骰子的对应数字的朝向都相同。
 *
 * 由于方案数可能过多，请输出模 10^9 + 7 的结果。
 *
 * 不要小看了 atm 的骰子数量哦～
 *
 * 「输入格式」
 * 第一行两个整数 n m
 * n表示骰子数目
 * 接下来 m 行，每行两个整数 a b ，表示 a 和 b 不能紧贴在一起。
 *
 * 「输出格式」
 * 一行一个数，表示答案模 10^9 + 7 的结果。
 *
 * 「样例输入」
 * 2 1
 * 1 2
 *
 * 「样例输出」
 * 544
 *
 * 「数据范围」
 * 对于 30% 的数据：n <= 5
 * 对于 60% 的数据：n <= 100
 * 对于 100% 的数据：0 < n <= 10^9, m <= 36
 *
 *
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 2000ms
 *
 *
 * 请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
 *
 * 所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
 * 注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
 * 注意：主类的名字必须是：Main，否则按无效代码处理。
 */
public class Demo9_垒骰子 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        f(arr, n);
    }

    // n表示骰子数量
    static void f(int[][] a, int n) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

            }
        }
    }
}
