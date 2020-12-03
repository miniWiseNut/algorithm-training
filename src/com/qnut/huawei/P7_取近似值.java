package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P7_取近似值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            System.out.println((int) (num + 0.5));
        }
    }
}
