package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 *  1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P40_输入一行字符分别统计出包含英文字母空格数字和其它字符的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.nextLine();
            int english = 0;
            int empty = 0;
            int num = 0;
            int other = 0;
            String[] arr = string.split( " ");
            empty = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                int length = arr[i].length();
                for (int j = 0; j < length; j++) {
                    if ((arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') ||
                            (arr[i].charAt(j) >= 'A' && arr[i].charAt(j) <= 'Z') ) {
                        english++;
                    } else if (arr[i].charAt(j) >= '0' && arr[i].charAt(j) <= '9') {
                        num++;
                    } else {
                        other++;
                    }
                }
            }
            System.out.println(english);
            System.out.println(empty);
            System.out.println(num);
            System.out.println(other);
        }
    }
}
