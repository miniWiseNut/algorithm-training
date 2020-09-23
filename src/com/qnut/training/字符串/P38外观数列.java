package com.qnut.training.字符串;

/**
 * @Description LeetCode 38
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 *
 * 注意：整数序列中的每一项将表示为一个字符串。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 *
 * 描述前一项，这个数是 1 即 “一个 1 ”，记作 11
 *
 * 描述前一项，这个数是 11 即 “两个 1 ” ，记作 21
 *
 * 描述前一项，这个数是 21 即 “一个 2 一个 1 ” ，记作 1211
 *
 * 描述前一项，这个数是 1211 即 “一个 1 一个 2 两个 1 ” ，记作 111221
 *
 * 继续往下推是 312211
 *  
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: "1"
 * 解释：这是一个基本样例。
 * 示例 2:
 *
 * 输入: 4
 * 输出: "1211"
 * 解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似 "1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P38外观数列 {
    public static String countAndSay(int n) {
        if (n == 0) {
            return "";
        }
        String num = "1";
        for (int i = 1; i < n; i++) {
            num = say(num);
        }
        return num;

    }

    private static String say(String num) {
        StringBuffer sb = new StringBuffer();
        int start = 0;
        for (int i = 0; i < num.length() + 1; i++) {
            if (i == num.length()) {
                sb.append(i - start).append(num.charAt(start));
                // 直到start位的字符串和i位的字符串不同，拼接并更新start位
            } else if (num.charAt(i) != num.charAt(start) ) {
                sb.append(i - start).append(num.charAt(start));
                start = i;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(7));
    }
}
