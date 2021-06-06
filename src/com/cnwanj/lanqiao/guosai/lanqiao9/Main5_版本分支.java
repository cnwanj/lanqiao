package com.cnwanj.lanqiao.guosai.lanqiao9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: vovhh
 * @Date: 2020-11-06 12:41:34
 * @Description:
 *
 * 标题：版本分支
 *
 * 小明负责维护公司一个奇怪的项目。这个项目的代码一直在不断分支(branch)但是从未发生过合并(merge)。
 * 现在这个项目的代码一共有N个版本，编号1~N，其中1号版本是最初的版本。
 * 除了1号版本之外，其他版本的代码都恰好有一个直接的父版本；即这N个版本形成了一棵以1为根的树形结构。
 *
 * 如下图就是一个可能的版本树：
 *
 *     1
 *    / \
 *  2    3
 *  \   / \
 *  5  4  6
 *
 * 现在小明需要经常检查版本x是不是版本y的祖先版本。你能帮助小明吗？
 *
 * 输入
 * ----
 * 第一行包含两个整数N和Q，代表版本总数和查询总数。
 * 以下N-1行，每行包含2个整数u和v，代表版本u是版本v的直接父版本。
 * 再之后Q行，每行包含2个整数x和y，代表询问版本x是不是版本y的祖先版本。
 *
 * 对于30%的数据，1 <= N <= 1000  1 <= Q <= 1000
 * 对于100%的数据，1 <= N <= 100000  1 <= Q <= 100000
 *
 * 输出
 * ----
 * 对于每个询问，输出YES或NO代表x是否是y的祖先。
 *
 * 【样例输入】
 * 6 5
 * 1 2
 * 1 3
 * 2 5
 * 3 6
 * 3 4
 * 1 1
 * 1 4
 * 2 6
 * 5 2
 * 6 4
 *
 * 【样例输出】
 * YES
 * YES
 * NO
 * NO
 * NO
 *
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 1000ms
 *
 * 请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
 *
 * 所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
 * 不要使用package语句。不要使用jdk1.7及以上版本的特性。
 * 主类的名字必须是：Main，否则按无效代码处理。
 */
public class Main5_版本分支 {

    static int N, Q, u, v, x, y;
    static ArrayList<Integer>[] next = new ArrayList[100010];
    static ArrayList<Integer>[] child = new ArrayList[100010];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        // 最大长度初始化二叉树
        for (int i = 1; i <= N; i++) {
            next[i] = new ArrayList<Integer>();
            child[i] = new ArrayList<Integer>();
        }
        // 构建二叉树
        for (int i = 1; i < N; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            next[u].add(v);
        }
//        for (int i = 1; i < next.length; i++) {
//            System.out.println(i + " " + next[i]);
//        }
        // 将父节点的所有子节点（包括自己）都放入自己的子节点集合中
        child[1] = getChild(1);
//        for (int i = 1; i < child.length; i++) {
//            System.out.println(i + " " + child[i]);
//        }
        while(Q-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            // 判断该父节点是否包含儿子
            if (child[x].contains(y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    // 通过根节点复制next树到child上构建新的二叉树
    static ArrayList<Integer> getChild(int root) {
        // 获取当前根节点儿子的数量
        int size = next[root].size();
        // 遍历每个根节点的儿子
        for (int i = 0; i < size; i++) {
            // 递归查找next树，将每个节点的儿子添加到child中
            child[root].addAll(getChild(next[root].get(i)));
        }
        // 将自己添加到子节点集合中
        child[root].add(root);
        // 返回二叉树根及自己的所有节点
        return child[root];
    }
}
