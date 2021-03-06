package com.cnwanj.lanqiao.guosai.lanqiao9;

/**
 * @Author: vovhh
 * @Date: 2020-11-06 12:41:52
 * @Description:
 *
 * 标题：防御力
 *
 * 小明最近在玩一款游戏。对游戏中的防御力很感兴趣。
 *
 * 我们认为直接影响防御的参数为“防御性能”，记作d，而面板上有两个防御值A和B，
 *
 * 与d成对数关系，A=2^d，B=3^d（注意任何时候上式都成立）。
 *
 * 在游戏过程中，可能有一些道具把防御值A增加一个值，有另一些道具把防御值B增加一个值。
 *
 * 现在小明身上有n1个道具增加A的值和n2个道具增加B的值，增加量已知。
 *
 * 现在已知第i次使用的道具是增加A还是增加B的值，但具体使用那个道具是不确定的，
 *
 * 请找到一个字典序最小的使用道具的方式，使得最终的防御性能最大。
 *
 * 初始时防御性能为0，即d=0，所以A=B=1。
 *
 * 【输入格式】
 * 输入的第一行包含两个数n1,n2，空格分隔。
 * 第二行n1个数，表示增加A值的那些道具的增加量。
 * 第三行n2个数，表示增加B值的那些道具的增加量。
 * 第四行一个长度为n1+n2的字符串，由0和1组成，表示道具的使用顺序。
 * 0表示使用增加A值的道具，1表示使用增加B值的道具。输入数据保证恰好有n1个0，n2个1。
 *
 * 【输出格式】
 * 对于每组数据，输出n1+n2+1行，前n1+n2行按顺序输出道具的使用情况，
 * 若使用增加A值的道具，输出Ax，x为道具在该类道具中的编号（从1开始）。
 * 若使用增加B值的道具则输出Bx。最后一行输出一个大写字母E。
 *
 * 【样例输入1】
 * 1 2
 * 4
 * 2 8
 * 101
 *
 * 【样例输出1】
 * B2
 * A1
 * B1
 * E
 *
 * 【样例输入2】
 * 3 0
 * 7 11 13
 *
 * 000
 *
 * 【样例输出2】
 * A1
 * A2
 * A3
 * E
 *
 * 【样例说明】
 * 对于第一组测试数据，操作过程如下：
 * 操作  d         A              B
 * 初始  0	        1              1
 * B2    2         4              9
 * A1    3	        8              27
 * B1   log3(29)   2^(log3(29))   29
 *
 * 可以证明，这个值是最大的。
 * 对于第二组测试数据，可见无论用什么顺序，A最后总为32，即d总为5，B总为243。
 *
 * 【数据规模】
 * 对于20%的数据，字符串长度<=10000；
 * 对于70%的数据，字符串长度<=200000；
 * 对于100%的数据，字符串长度<=2000000，输入的每个增加值不超过2^30。
 *
 *
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 1000ms
 *
 *
 * 请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
 *
 * 所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
 * 不要使用package语句。不要使用jdk1.7及以上版本的特性。
 * 主类的名字必须是：Main，否则按无效代码处理。
 */
public class Main6_防御力 {
}
