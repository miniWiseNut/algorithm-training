package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P6_质数因子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                sb.append(i + " ");
                num = num / i;
                i--;
            }
        }
        sb.append(num + " ");
        System.out.println(sb.toString());
    }
}
