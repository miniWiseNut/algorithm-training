package com.qnut.huawei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P9_提取不重复的整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (!list.contains(String.valueOf(str.charAt(i)))) {
                    list.add(String.valueOf(str.charAt(i)));
                }
            }
            for (String s: list) {
                System.out.print(s);
            }
        }
    }
}
