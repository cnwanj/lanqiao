package com.cnwanj.lanqiao.guosai.lanqiao9;

/**
 * @Author: vovhh
 * @Date: 2020-11-06 12:40:41
 * @Description:
 *
 * 标题：全排列
 *
 * 对于某个串，比如：“1234”，求它的所有全排列。
 * 并且要求这些全排列一定要按照字母的升序排列。
 * 对于“1234”，应该输出(一共4!=24行)：
 * 1234
 * 1243
 * 1324
 * 1342
 * 1423
 * 1432
 * 2134
 * 2143
 * 2314
 * 2341
 * 2413
 * 2431
 * 3124
 * 3142
 * 3214
 * 3241
 * 3412
 * 3421
 * 4123
 * 4132
 * 4213
 * 4231
 * 4312
 * 4321
 *
 * 下面是实现程序，请仔细分析程序逻辑，并填写划线部分缺少的代码。
 *
 * 请注意：只需要填写划线部分缺少的内容，不要抄写已有的代码或符号。
 *
 * 答案：在底部
 */
public class Main3_全排列 {
    static void permu(char[] data, int cur) {
        if (cur == data.length - 1) {
            System.out.println(new String(data));
            return;
        }

        for (int i = cur; i < data.length; i++) {
            char tmp = data[i];
            for (int j = i - 1; j >= cur; j--)
                data[j + 1] = data[j];
            data[cur] = tmp;

            permu(data, cur + 1);

            tmp = data[cur];
            // _______________________________;
            data[i] = tmp;
        }
    }

    static void permu(String x) {
        permu(x.toCharArray(), 0);
    }

    public static void main(String[] args) {
        permu("1234");
    }
}













// for (int j = cur; j < i; j++) data[j] = data[j + 1]
