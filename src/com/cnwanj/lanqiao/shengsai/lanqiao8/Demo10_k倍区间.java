package com.cnwanj.lanqiao.shengsai.lanqiao8;

import java.util.Scanner;

/**
 * 标题： k倍区间
 *
 *  给定一个长度为N的数列，A1, A2, ... AN，如果其中一段连续的子序列Ai,
 *
 *  Ai+1, ... Aj(i <= j)之和是K的倍数，我们就称这个区间[i, j]是K倍区间。
 *
 *  你能求出数列中总共有多少个K倍区间吗？
 *
 *  输入
 *  -----
 *  第一行包含两个整数N和K。(1 <= N, K <= 100000)
 *  以下N行每行包含一个整数Ai。(1 <= Ai <= 100000)
 *
 *  输出
 *  -----
 *  输出一个整数，代表K倍区间的数目。
 *
 *  例如，
 *  输入：
 *  5 2
 *  1
 *  2
 *  3
 *  4
 *  5
 *
 *  程序应该输出：
 *  6
 *
 *  资源约定：
 *  峰值内存消耗（含虚拟机） < 256M
 *  CPU消耗  < 2000ms
 *
 *  请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
 *
 *  所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
 *  不要使用package语句。不要使用jdk1.7及以上版本的特性。
 *  主类的名字必须是：Main，否则按无效代码处理。
 */
public class Demo10_k倍区间 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int r, sum = 0;

        for (int l = 0; l < n; l++) {
            r = l;
            while (r < n) {
                if (sum(arr, l, r) % k == 0) {
                    sum++;
                    // 右指针右移
                    r++;
                } else
                    r++;
            }
        }
        System.out.println(sum);
    }

    // 求该区间的和
    static int sum(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
