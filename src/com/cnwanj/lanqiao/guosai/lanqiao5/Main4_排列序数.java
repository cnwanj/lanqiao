package com.cnwanj.lanqiao.guosai.lanqiao5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: vovhh
 * @Date: 2020-11-12 15:55:09
 * @Description:
 *
 * 标题：排列序数
 *
 * 如果用a b c d这4个字母组成一个串，有4!=24种，如果把它们排个序，每个串都对应一个序号：
 * abcd 0
 * abdc 1
 * acbd 2
 * acdb 3
 * adbc 4
 * adcb 5
 * bacd 6
 * badc 7
 * bcad 8
 * bcda 9
 * bdac 10
 * bdca 11
 * cabd 12
 * cadb 13
 * cbad 14
 * cbda 15
 * cdab 16
 * cdba 17
 * …
 *
 * 现在有不多于10个两两不同的小写字母，给出它们组成的串，你能求出该串在所有排列中的序号吗？
 *
 * 【输入格式】
 * 一行，一个串。
 *
 * 【输出格式】
 * 一行，一个整数，表示该串在其字母所有排列生成的串中的序号。注意：最小的序号是0。
 *
 * 例如：
 * 输入：
 * bdca
 *
 * 程序应该输出：
 * 11
 *
 * 再例如：
 * 输入：
 * cedab
 *
 * 程序应该输出：
 * 70
 *
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗 < 1000ms
 *
 * 请严格按要求输出，不要画蛇添足地打印类似：“请您输入…” 的多余内容。
 *
 * 所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
 * 注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
 * 注意：主类的名字必须是：Main，否则按无效代码处理。
 */
public class Main4_排列序数 {
    static char[] a, b;
    static boolean[] vis;
    static int num = 0;
    static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        a = str.toCharArray();
        b = new char[a.length];
        vis = new boolean[a.length];
        Arrays.sort(a);
        f(0);
    }

    static void f(int p) {
        if (p == b.length) {
            if (String.valueOf(b).equals(str)) {
                System.out.println(num);
            }
            num ++;
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (!vis[i]) {
                b[p] = a[i];

                vis[i] = true;
                f(1 + p);
                vis[i] = false;
            }
        }
    }
}
