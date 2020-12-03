package com.qnut.huawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P10_字符个数统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(String.valueOf(str.charAt(i)));
            }
            System.out.println(set.size());
        }
    }
}
