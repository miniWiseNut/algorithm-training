package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P15_求int型数据在内存中存储时1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String str = Integer.toBinaryString(num);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
