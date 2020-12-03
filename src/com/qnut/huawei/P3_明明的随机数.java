package com.qnut.huawei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P3_明明的随机数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int total = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < total; i++) {
                set.add(sc.nextInt());
            }
            for (Integer num: set) {
                System.out.println(num);
            }
        }
    }
}
