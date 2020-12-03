package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P2_计算字符个数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int count = 0;
            String s = scan.nextLine().toLowerCase();
            Character target = scan.nextLine().charAt(0);
            target = Character.toLowerCase(target);
            char[] arr = s.toCharArray();
            for (char c: arr) {
                if (c == target) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
